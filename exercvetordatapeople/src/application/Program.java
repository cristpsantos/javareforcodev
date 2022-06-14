package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DataPeople;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double heightMax, heightMin, avgWomen, sumWomen;
		int countMan, countWomen;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		DataPeople[] people = new DataPeople[n];

		for(int i=0; i<people.length; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			double height = sc.nextDouble();
			System.out.print("Gênero da " + (i + 1) + "a pessoa: ");
			char genre = sc.next().charAt(0);
			people[i] = new DataPeople(height, genre);
			sc.nextLine();
		}
		
		heightMin = people[0].getHeight();
		heightMax = people[0].getHeight();
		sumWomen = 0.0;
		countMan = 0;
		countWomen = 0;
		
		for(int i=0; i<people.length; i++) {
			if(people[i].getHeight() < heightMin) {
				heightMin = people[i].getHeight();
			}
			if(people[i].getHeight() > heightMax) {
				heightMax = people[i].getHeight();
			}
			if(people[i].getGenre() == 'M') {
				countMan++;
			} else {
				sumWomen += people[i].getHeight();
				countWomen++;
			}
		}
		
		avgWomen = sumWomen / countWomen;
		
		System.out.printf("Menor altura = %.2f%n", heightMin);
		System.out.printf("Maior altura = %.2f%n", heightMax);
		System.out.printf("Média das alturas das mulheres = %.2f%n", avgWomen);
		System.out.println("Número de homens = " + countMan);
		sc.close();
	}
}
