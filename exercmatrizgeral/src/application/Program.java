package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double somaPositivos;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a ordem matriz? ");
		int n = sc.nextInt();
		
		double[][] matriz = new double[n][n];
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				matriz[i][j] = sc.nextDouble();
			}
		}
		
		System.out.println();
		somaPositivos = 0.0;
		for(double[] positivos: matriz) {
			for(double soma : positivos) {
				if(soma > 0.0) {
					somaPositivos += soma;
				}
			}
		}
		
		System.out.println("SOMA DOS POSITIVOS: " + somaPositivos);
		System.out.println()
		;
		System.out.print("Escolha uma linha: ");
		int linha = sc.nextInt();
		
		System.out.print("LINHA ESCOLHIDA: ");
		for(int i=0; i<matriz.length; i++) {
			System.out.print(matriz[linha][i] + " ");
		}
		System.out.println();
		
		System.out.println();
		System.out.print("Escolha uma coluna: ");
		int coluna = sc.nextInt();
		
		System.out.print("COLUNA ESCOLHIDA: ");
		for(int i=0; i<matriz.length; i++) {
			System.out.print(matriz[i][coluna] + " ");
		}
		System.out.println();
		
		System.out.println();
		System.out.println("DIAGONAL PRINCIPAL: ");
		for(int i=0; i<matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		System.out.println();
		System.out.println();
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				if(matriz[i][j] < 0) {
					matriz[i][j] = Math.pow(matriz[i][j], 2);
				}	
			}
		}
		
		System.out.println("MATRIZ ALTERADA:");
		for(double[] matrizalterada : matriz) {
			for(double resultfinal : matrizalterada) {
				System.out.print(resultfinal + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
