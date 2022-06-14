package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vector = new double[n];
		
		for(int i=0; i<vector.length; i++) {
			System.out.print("Digite um numero: ");
			vector[i] = sc.nextDouble();
		}
		System.out.println();
		
		double sum = 0.0;
		
		System.out.print("VALORES =");
		for(int i=0; i<vector.length; i++) {
			System.out.printf(" %.2f", vector[i]);
			sum += vector[i];
		}
		System.out.println();
		
		double avg = sum / vector.length;
		
		System.out.printf("SOMA = %.2f%n", sum);
		System.out.printf("MÉDIA = %.2f%n", avg);
		
		sc.close();
	}
}
