package model.services;

public class BrazilTaxService {
	
	private static final double TAX_BR_1 = 0.2;
	private static final double TAX_BR_2 = 0.1;
	
	public Double tax(double amount) {
	
		if (amount <= 100) 
			return amount * TAX_BR_1; 
		
		else
			return amount * TAX_BR_2;
	}
}
