package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered? ");
		Integer nn = sc.nextInt();
		List<Employee> listEmployee = new ArrayList<Employee>();
		
		for (int i=0; i<nn; i++) {
			System.out.println("Employee #" + (i + 1));
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee employee = new Employee(id, name, salary);
			listEmployee.add(employee);
		}
		
		System.out.print("Enter the employee ID that have salary increase: ");
		Integer idIncrease = sc.nextInt();
		Employee emp = listEmployee.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		
		System.out.println("List of employees:");
		for (Employee x : listEmployee) {
			System.out.println(x.toString());
		}
		sc.close();
	}

}
