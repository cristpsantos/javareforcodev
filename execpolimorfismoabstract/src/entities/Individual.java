package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditure;

	public Individual() {
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditure) {
		super(name, anualIncome);
		this.healthExpenditure = healthExpenditure;
	}

	public Double getHealthExpenditure() {
		return healthExpenditure;
	}

	public void setHealthExpenditure(Double healthExpenditure) {
		this.healthExpenditure = healthExpenditure;
	}

	@Override
	public double tax() {
		double tax = 0.0;
		if(getAnualIncome() < 20000.0) {
			tax = getAnualIncome() * 0.15;
		} else {
			tax = getAnualIncome() * 0.25;
		}
		if(healthExpenditure != 0.0) {
			tax -= healthExpenditure * 0.5;
		}
		
		return tax;
	}
}
