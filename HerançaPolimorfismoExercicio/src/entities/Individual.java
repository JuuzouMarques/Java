package entities;

public class Individual extends TaxPayers {
	// Atributos
	private Double healtSpeding;
	
	// Construtores
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healtSpeding) {
		super(name, anualIncome);
		this.healtSpeding = healtSpeding;
	}
	
	// Gets e Sets
	public Double getHealtSpeding() {
		return healtSpeding;
	}
	
	public void setHealtSpeding(Double healtSpeding) {
		this.healtSpeding = healtSpeding;
	}
	
	// Métodos
	@Override
	public Double taxToPay() {
		if (getAnualIncome() < 20000.0) {
			return getAnualIncome() * 0.15 - getHealtSpeding() * 0.5;
		} else  {
			return getAnualIncome() * 0.25 - getHealtSpeding() * 0.5;
		}
	}
}
