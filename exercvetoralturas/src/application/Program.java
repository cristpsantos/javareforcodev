package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double sum, avg, percentSixteen, countSixteen;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		People[] people = new People[n];
		
		sc.nextLine();
		
		for(int i=0; i<people.length; i++) {
			System.out.println("Dados da " + (i+1) +"a pessoa:");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			people[i] = new People(name, age, height);
			sc.nextLine();
		}
		System.out.println();
		
		sum = 0.0;
		for(int i=0; i<people.length; i++) {
			sum += people[i].getHeight();
		}
		avg = sum / people.length;
		System.out.printf("Altura média: %.2f%n", avg);
		
		percentSixteen = 0.0;
		countSixteen = 0.0;
		for(int i=0; i<people.length; i++) {
			if(people[i].getAge() < 16) {
				countSixteen += 1.0;
			}
		}
		
		percentSixteen = (countSixteen * 100) / people.length;
		
		System.out.println("Pessoas com menos de 16 anos: " 
							+ String.format("%.1f", percentSixteen ) + "%");

		for(int i=0; i<people.length; i++) {
			if(people[i].getAge() < 16) {
				System.out.println(people[i].getName());
			}
		}
		
		sc.close();
	}
}
