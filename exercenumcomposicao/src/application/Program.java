package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Order order;
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.nextLine());
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine();
		
		order = new Order(new Date(), OrderStatus.valueOf(status), new Client(name, email, birthDate));
		System.out.print("How many items to this order? ");
		int itemsOrder = sc.nextInt();
				
		for(int i=1; i<=itemsOrder; i++) {
			sc.nextLine();
			System.out.println("Enter #"+ i + " item data:");
			System.out.print("Product name: ");
			String nameProduct = sc.nextLine();
			System.out.print("Product price: ");
			Double priceProduct = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantProduct = sc.nextInt();
			order.addItem(new OrderItem(quantProduct, priceProduct, new Product(nameProduct, priceProduct)));
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		sc.close();

	}

}
