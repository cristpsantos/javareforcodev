package exerciciosstudent;

import java.util.Locale;
import java.util.Scanner;

import exerciciosstudent.entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Digite as notas: ");
		student.note1 = sc.nextDouble();
		student.note2 = sc.nextDouble();
		student.note3 = sc.nextDouble();
		
		System.out.println(student);
		
		sc.close();
	}
}
