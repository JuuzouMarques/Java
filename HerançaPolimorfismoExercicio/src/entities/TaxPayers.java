package entities;

public abstract class TaxPayers {
	// Atributos
	private String name;
	private Double anualIncome;
	
	// Construtores
	public TaxPayers() {
	}
	
	public TaxPayers(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}
	
	// Gets e Sets
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getAnualIncome() {
		return anualIncome;
	}
	
	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	// Métodos
	public abstract Double taxToPay();
}
