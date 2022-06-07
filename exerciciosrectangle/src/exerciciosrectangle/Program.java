package exerciciosrectangle;

import java.util.Locale;
import java.util.Scanner;

import exerciciosrectangle.entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Entre com a largura e altura do retângulo:");
		
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle);
		
		sc.close();
	}

}
