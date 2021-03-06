package exerciciosemployee;

import java.util.Locale;
import java.util.Scanner;

import exerciciosemployee.entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Nome: ");
		employee.name = sc.next();
		sc.next();
		System.out.print("Salário bruto: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Imposto: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Funcionário: " + employee);
		
		System.out.print("Qual a porcentagem para aumentar o salário? ");
		double increaseSalary = sc.nextDouble();
		
		employee.increaseSalary(increaseSalary);
		
		System.out.println("Dados atualizados: " + employee);
		
		sc.close();

	}

}
