package utils;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double converter(double dolar, double quantity) {
		//double total = dolar * quantity;
		//double tax = total * IOF;
		return dolar * quantity * (1 + IOF);
	}
}
