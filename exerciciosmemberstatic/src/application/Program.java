package application;

import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do d?lar? ");
		double dolar = sc.nextDouble();
		System.out.print("Quantos d?lares ser?o comprados? ");
		double quantity = sc.nextDouble();
		
		System.out.printf("Valor a ser pago em reais = %.2f%n ", CurrencyConverter.converter(dolar, quantity));
		
		sc.close();
	}
}
