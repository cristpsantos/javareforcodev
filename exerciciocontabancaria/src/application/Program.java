package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Account account;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char deposit = sc.next().charAt(0);
		
		if(deposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			account = new Account(accountNumber, accountHolder, balance);
		} else {
			account = new Account(accountNumber, accountHolder);
		}
		System.out.println();
		
		System.out.println("Account Data:");
		System.out.println(account);
		
		System.out.print("Enter a deposit value: ");
		double depositAccount = sc.nextDouble();
		account.deposit(depositAccount);
	
		System.out.println("Updated Data:");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		double withDrawAccount = sc.nextDouble();
		account.withdraw(withDrawAccount);
		
		System.out.println("Updated Data:");
		System.out.println(account);
		
		sc.close();
	}
}
