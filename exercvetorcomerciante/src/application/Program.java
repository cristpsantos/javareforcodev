package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sumPurchase, sumSale;
		int countPercentUnder10, countPercentBetween10and20, countPercentAbove20;
		
		System.out.print("Serão digitados dados de quantos produtos? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Product[] product = new Product[n]; 
		
		for(int i=0;i<product.length;i++) {
			System.out.println("Produto " + (i+1) + ":");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Preço de compra: ");
			double purchasePrice = sc.nextDouble();
			System.out.print("Preço de venda: ");
			double salePrice = sc.nextDouble();
			sc.nextLine();
			product[i] = new Product(name, salePrice, purchasePrice);
		}
		
		sumPurchase = 0.0;
		sumSale = 0.0;
		countPercentUnder10 = 0;
		countPercentBetween10and20 = 0;
		countPercentAbove20 = 0;
		for(int i=0;i<product.length;i++) {
			sumPurchase += product[i].getPurchasePrice();
			sumSale += product[i].getSalePrice();
			
			double sum = ((product[i].getSalePrice() - product[i].getPurchasePrice()) * 100) 
							/ product[i].getPurchasePrice();
			
			if(sum < 10) {
				countPercentUnder10++;
			} else if(sum >= 10 && sum <=20) {
				countPercentBetween10and20++;
			} else {
				countPercentAbove20++;
			}			
		}
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.println("Lucro abaixo de 10%: " + countPercentUnder10);
		System.out.println("Lucro entre 10% e 20%: " + countPercentBetween10and20);
		System.out.println("Lucro acima de 20%: " + countPercentAbove20);
		System.out.printf("Valor total de compra: %.2f\n", sumPurchase);
		System.out.printf("Valor total de venda: %.2f\n", sumSale);
		System.out.printf("Lucro total: %.2f\n", sumSale - sumPurchase);
		
		sc.close();

	}

}
