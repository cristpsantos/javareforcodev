package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Map<String, Integer> candidates = new LinkedHashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		File strPath = new File(path);
		
		try(BufferedReader br = new BufferedReader(new FileReader(strPath))) {
			
			String line = br.readLine();
			
			while(line != null) {
				String[] candData = line.split(",");
				
				String candKey = candData[0];
				int candValue = Integer.parseInt(candData[1]);
				
				if(candidates.containsKey(candKey)) {
					candidates.put(candKey, candidates.get(candKey) + candValue);
				} else {
					candidates.put(candKey, candValue);
				}
				
				line = br.readLine();
			}
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		for(String key : candidates.keySet()) {
			System.out.println(key + ": " + candidates.get(key));
		}
		
		sc.close();
	}
}
