package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("ENTER CLIENT DATA:");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String clientEmail = sc.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date clientBirthDate =  sdf.parse(sc.next());
		System.out.println();
		
		System.out.println("ENTER ORDER DATA:");
		System.out.print("Status: ");
		OrderStatus orderStatus = OrderStatus.valueOf(sc.next());
		Order order = new Order(new Date(), orderStatus, new Client(clientName, clientEmail, clientBirthDate));
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		System.out.println();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			sc.nextLine();
			System.out.print("Product name: ");
			String prodName = sc.nextLine();
			System.out.print("Product price: ");
			Double prodPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer prodQuant = sc.nextInt();
			OrderItem orderItem = new OrderItem(prodQuant, prodPrice, new Product(prodName, prodPrice));
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order.toString());
		
		sc.close();
	}

}
