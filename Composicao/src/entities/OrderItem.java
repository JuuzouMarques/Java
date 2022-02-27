package entities;

public class OrderItem {
	// Atributos
	private Integer quantity;
	private Double price;
	
	private Product product;
	
	// Construtor
	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	// Gets e Sets
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	// Métodos
	public Double subTotal() {
		return price * quantity;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product.getName());
		sb.append(", $");
		sb.append(String.format("%.2f", price));
		sb.append(", Quantity: ");
		sb.append(quantity);
		sb.append(", SubTotal: $");
		sb.append(String.format("%.2f", subTotal()) + "\n");
		
		return sb.toString();
	}
}
