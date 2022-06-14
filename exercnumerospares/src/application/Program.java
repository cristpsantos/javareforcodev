package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int count;
		
		System.out.print("Quantos números serão digitados? ");
		int n = sc.nextInt();
		
		int[] numbers = new int[n];
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextInt();
		}
		
		System.out.println();
		count = 0;
		System.out.println("Números pares:");
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] % 2 == 0) {
				count++;
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.print("Quantidade de pares = " + count);
		sc.close();
	}
}
