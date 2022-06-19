package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas linhas vai ter cada matriz? ");
		int m = sc.nextInt();
		System.out.print("Quantas colunas vai ter cada matriz? ");
		int n = sc.nextInt();
		
		int[][] matrizA = new int[m][n];
		int[][] matrizB = new int[m][n];
		int[][] matrizC = new int[m][n];
		
		System.out.println("Digite os valores da matriz A:");
		for(int i=0; i<matrizA.length; i++) {
			for(int j=0; j<matrizA[i].length; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				matrizA[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite os valores da matriz B:");
		for(int i=0; i<matrizB.length; i++) {
			for(int j=0; j<matrizB[i].length; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				matrizB[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("MATRIZ SOMA:");
		for(int i=0; i<matrizC.length; i++) {
			for(int j=0; j<matrizC[i].length; j++) {
				matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}
		
		for(int[] vetorC : matrizC) {
			for(int resultado : vetorC) {
				System.out.print(resultado + " ");
			}
			System.out.println();
		}	
		sc.close();
	}
}
