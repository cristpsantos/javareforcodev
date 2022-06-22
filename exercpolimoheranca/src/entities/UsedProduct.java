package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufacturDate;
	
	public UsedProduct() {
	}

	public UsedProduct(String name, Double price, Date manufacturDate) {
		super(name, price);
		this.manufacturDate = manufacturDate;
	}

	public Date getManufacturDate() {
		return manufacturDate;
	}

	public void setManufacturDate(Date manufacturDate) {
		this.manufacturDate = manufacturDate;
	}
	
	@Override
	public String priceTag() {
		return getName() + " (used)" + " $" 
					+ String.format("%.2f", getPrice())
					+ " (Manufacture date: " + sdf.format(manufacturDate) + ")"; 
	}
}
