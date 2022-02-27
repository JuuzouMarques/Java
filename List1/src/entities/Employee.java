package entities;

public class Employee {
	private Integer IDAccount;
	private String name;
	private Double salary;
	
	// Construtores
	public Employee(int IDAccount, String name, double salary) {
		this.IDAccount = IDAccount;
		this.name = name;
		this.salary = salary;
	}
	
	// Get
	public int getId() {
		return this.IDAccount;
	}
	
	// Métodos
	public void increaseSalary(double percentage) {
		salary *= 1 + (percentage / 100);
	}
	
	public String toString() {
		return IDAccount + ", "
				+ name + ", R$ "
				+ String.format("%.2f", salary);
	}
}
