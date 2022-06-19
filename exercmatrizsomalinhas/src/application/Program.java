package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		int m = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		int n = sc.nextInt();
		
		double[][] matriz = new double[m][n];
		double[] vetor = new double[m];
		
		
		for(int i=0; i<matriz.length; i++) {
			System.out.println("Digite os elementos da " + (i+1) + "a. linha:");
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = sc.nextDouble();
			}
		}
		
		for(int i=0; i<vetor.length; i++) {
				for(int k=0; k<matriz[i].length; k++) {
					vetor[i] += matriz[i][k];
				}
		}
		System.out.println("VETOR GERADO:");
		for(Double vect : vetor) {
			System.out.println(vect);
		}
		
		sc.close();

	}

}
