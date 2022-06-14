package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String oldPeople;
		int oldAge;
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		People[] people = new People[n];

		for(int i=0; i<people.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a Pessoa:");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			sc.nextLine();
			people[i] = new People(name, age);
		}
		
		oldPeople = people[0].getName();
		oldAge = people[0].getAge();
		for(int i=0; i<people.length; i++) {
			if(people[i].getAge() > oldAge) {
				oldPeople = people[i].getName();
				oldAge = people[i].getAge();
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + oldPeople);
		
		sc.close();
	}
}
