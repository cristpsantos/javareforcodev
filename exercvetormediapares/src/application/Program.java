package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double sum, avg;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vector = new double[n];

		for(int i=0; i<vector.length; i++) {
			System.out.print("Digite um n�mero: ");
			vector[i] = sc.nextDouble();
		}
		
		sum = 0.0;
		for(int i=0; i<vector.length; i++) {	
			if(vector[i] % 2 == 0) {
				sum += vector[i];
			}
		}
		
		if(sum != 0.0) {
			avg = sum / vector.length;
			System.out.printf("\nM�DIA DOS PARES = %.1f\n", avg );
		} else {
			System.out.println("NENHUM N�MERO PAR");
		}
		sc.close();
	}
}
