package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Student[] student = new Student[n];

		for(int i=0; i<student.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
			String name = sc.nextLine();
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			sc.nextLine();
			student[i] = new Student(name, n1, n2);
		}
		
		System.out.println("Alunos aprovados: ");
		for(int i=0; i<student.length; i++) {
			double sum = (student[i].getN1() + student[i].getN2()) / 2;
			if(sum >= 6.0) {
				System.out.println(student[i].getName());
			}
		}
		sc.close();
	}
}
