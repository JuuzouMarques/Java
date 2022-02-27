package entities;

public class Department {
	// Atributos
	private String name;
	
	// Construtores
	public Department() {
	}
	
	public Department(String name) {
		this.name = name;
	}
	
	// Get e Set
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
