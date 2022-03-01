package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int qtdEmployees = sc.nextInt();
		System.out.println();
		
		for (int i=1; i <=qtdEmployees; i++) {
			System.out.println("Employe #" + i + " Data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per Hour: ");
			double perHour = sc.nextDouble();
			if (ch == 'y') {
				System.out.print("Additional Charge: ");
				double addCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, perHour, addCharge);
				employees.add(emp);
			} else {
				Employee emp = new Employee(name, hours, perHour);
				employees.add(emp);
			}
		}
		System.out.println();
		
		System.out.println("PAYMENTS:");
		for (Employee emp : employees) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
	}

}
