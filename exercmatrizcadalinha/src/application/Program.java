package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		int maiorLinha;		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.printf("ELEMENTO [%d,%d]: ", i, j);
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
		maiorLinha = 0;
		for(int i=0; i<matriz.length; i++) {
			maiorLinha = matriz[i][0];
			for(int j=0; j<matriz[i].length; j++) {
				if(maiorLinha < matriz[i][j]) {
					maiorLinha = matriz[i][j];
				}
			}
			System.out.println(maiorLinha);
		}
		sc.close();
	}
}
