package entities;

public final class OutsourcedEmployee extends Employee {
	// Atributos
	private Double additionalCharge;
	
	// Construtores
	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	// Gets e Sets
	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	
	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	// Métodos
	@Override
	public Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
