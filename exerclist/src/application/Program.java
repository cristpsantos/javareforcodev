package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		for(int i=1;i<=n;i++) {
			System.out.println("Employee #" + i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			employees.add(new Employee(id, name, salary));
			System.out.println();
		}
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
	
	// ------- Solução do professor -----------------
		Employee findIdEmp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(findIdEmp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentagem = sc.nextDouble(); 
			findIdEmp.increaseSalary(percentagem);
		}
	// --------------------------------------------------------
	//------------ Minha Solução --------------------------	
	/*	for (Employee list : employees) {
			if(list.getId() == id) {
				System.out.print("Enter the percentage: ");
				double percentagem = sc.nextDouble(); 
				list.increaseSalary(percentagem);
				findId = true;
			}
		}
		
		if(!findId) {
			System.out.println("This id does not exist!");
		} */
	//------------------------------------	
		
		
		System.out.println();
		System.out.println("List of employees");
		for (Employee emp : employees) {
			System.out.println(emp);
		}
		
		sc.close();
	}
}
