package Classes;

public class Origin {
	
	
	//ORIGIN KISMI TAM
	
	private String manuFacturer;
	private String currency;
	private String tax;
	
	
	
	public Origin(String manuFacturer, String currency, String tax) {
		this.currency=currency;
		this.manuFacturer=manuFacturer;
		this.tax=tax;
		
	
	}


	

	public String getManuFacturer() {
		return manuFacturer;
	}





	public String getCurrency() {
		return currency;
	}





	public String getTax() {
		return tax;
	}





	public void setManuFacturer(String manuFacturer) {
		this.manuFacturer = manuFacturer;
	}





	public void setCurrency(String currency) {
		this.currency = currency;
	}





	public void setTax(String tax) {
		this.tax = tax;
	}





	@Override
	public String toString() {
		return "\n\n\n "
				+ "\nManufacturer of the Car=" + manuFacturer 
				+ "\nCurrency=" + currency 
				+ "\nTax=" + tax 
				+ "\n";
	}




	




	
}
