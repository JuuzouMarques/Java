package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayers;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<TaxPayers> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or Company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual Income: $");
			Double anualIncome = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Healt expenditures: $");
				Double healtSpending = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healtSpending));
			} else {
				System.out.print("Number of employees: ");
				Integer quantityEmployeers = sc.nextInt();
				list.add(new Company(name, anualIncome, quantityEmployeers));
			}
		}
		System.out.println();
		
		System.out.println("TAXES PAID");
		double sum = 0.0;
		for (TaxPayers payer : list) {
			System.out.println(payer.getName() + ": $ " + String.format("%.2f", payer.taxToPay()));
			sum += payer.taxToPay();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f%n", sum);
		sc.close();
	}

}
