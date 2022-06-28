package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PayPalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Contract contract;
		ContractService service = new ContractService(new PayPalService());
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		sc.nextLine();
		System.out.print("Date (dd/mm/yyyy): ");
		Date date = sdf.parse(sc.nextLine());
		System.out.print("Contract value: ");
		Double totalValue = sc.nextDouble();
		System.out.print("Enter number of installments: ");
		Integer months = sc.nextInt();
		
		contract = new Contract(number, date, totalValue);
		
		service.processContract(contract, months);
		System.out.println();
		System.out.println("Installments: ");
		
		for(Installment list : contract.getInstallments()) {
			System.out.println(sdf.format(list.getDueDate()) + " " + String.format("%.2f", list.getAmount()));
		}
		sc.close();
	}

}
