package entities;

public class Company extends TaxPayers {
	// Atributos
	private Integer quantityEmployeers;
	
	// Construtores
	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, Integer quantityEmployeers) {
		super(name, anualIncome);
		this.quantityEmployeers = quantityEmployeers;
	}
	
	// Gets e Sets
	public Integer getQuantityEmployeers() {
		return quantityEmployeers;
	}
	
	public void setQuantityEmployeers(Integer quantityEmployeers) {
		this.quantityEmployeers = quantityEmployeers;
	}
	
	// Métodos
	@Override
	public Double taxToPay() {
		if (quantityEmployeers > 10) {
			return getAnualIncome() * 0.14;
		} else {
			return getAnualIncome() * 0.16;
		}
	}
}
