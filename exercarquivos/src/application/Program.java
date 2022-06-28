package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter path file:");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		try(BufferedReader br = new BufferedReader(new FileReader(strPath))) {
			
			String line = br.readLine();
			
			while(line != null) {
				String[] prodData = line.split(",");
				String name = prodData[0];
				double price = Double.parseDouble(prodData[1]);
				int quantity = Integer.parseInt(prodData[2]);
				
				list.add(new Product(name, price, quantity));
				
				line = br.readLine();
			}
		}
		catch(IOException e) {
			e.getStackTrace();
		}
		
		new File(path.getParent() + "\\out").mkdir();
		
		String newFile = path.getParent() + "\\out\\summary.csv";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(newFile, true))) {
			for (Product prod : list) {
				bw.write(prod.getName() + ", " + prod.sumTotal());
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.getStackTrace();
		}
	
	sc.close();
	}
}
