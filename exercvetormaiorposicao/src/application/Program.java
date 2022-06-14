package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int pos;
		double aux;
		
		System.out.print("Quantos n�meros ser�o digitados? ");
		int n = sc.nextInt();
		
		double[] numbers = new double[n];
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print("Digite um n�mero: ");
			numbers[i] = sc.nextDouble();
		}
		
		pos = 0;
		aux = numbers[0];
		for(int i=0; i<numbers.length; i++) {
			if(aux < numbers[i]) {
				aux = numbers[i];
				pos = i;
			}
		}
		System.out.println();
		
		System.out.println("MAIOR VALOR = " + aux);
		System.out.println("POSI��O DO MAIOR VALOR = " + pos);
		
		sc.close();
	}
}
