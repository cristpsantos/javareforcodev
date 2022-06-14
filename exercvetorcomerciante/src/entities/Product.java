package entities;

public class Product {

	private String name;
	private double purchasePrice;
	private double salePrice;
	
	public Product(String name, double salePrice, double purchasePrice) {
		this.name = name;
		this.salePrice = salePrice;
		this.purchasePrice = purchasePrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
}
