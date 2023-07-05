package Classes;

import java.util.ArrayList;

public class ElectricCars extends Cars{
	
	private boolean maintenanceAndServiceEase;
	//
	private int batteryWarrantyPeriod;
	//
	private String vehicleStatus;
	private int range;
	private boolean enhancedAutoPilot;
	private ArrayList<Origin> origin = new ArrayList<>();

	
	
	

	public ElectricCars(int id, String type, String brand, String modelOfVehicle,double price, String[] wheels2, 
		 String color, String carsReleaseDate, boolean maintenanceAndServiceEase, int batteryWarrantyPeriod, 
		 String vehicleStatus, int range, boolean enhancedAutopilot,ArrayList<Origin> origin) {
		// TODO Auto-generated constructor stub
		super(id, type, brand, modelOfVehicle, wheels2, price, color, carsReleaseDate);
		this.batteryWarrantyPeriod=batteryWarrantyPeriod;
		this.enhancedAutoPilot=enhancedAutoPilot;
		this.maintenanceAndServiceEase=maintenanceAndServiceEase;
		this.range=range;
		this.vehicleStatus=vehicleStatus;
		this.origin=origin;
		
		
	}

	
	
	
	
	
	public boolean isMaintenanceAndServiceEase() {
		return maintenanceAndServiceEase;
	}






	public int getBatteryWarrantyPeriod() {
		return batteryWarrantyPeriod;
	}






	public String getVehicleStatus() {
		return vehicleStatus;
	}






	public int getRange() {
		return range;
	}






	public boolean isEnhancedAutoPilot() {
		return enhancedAutoPilot;
	}






	





	public ArrayList<Origin> getOrigin() {
		return origin;
	}






	public void setMaintenanceAndServiceEase(boolean maintenanceAndServiceEase) {
		this.maintenanceAndServiceEase = maintenanceAndServiceEase;
	}






	public void setBatteryWarrantyPeriod(int batteryWarrantyPeriod) {
		this.batteryWarrantyPeriod = batteryWarrantyPeriod;
	}






	public void setVehicleStatus(String vehicleStatus) {
		this.vehicleStatus = vehicleStatus;
	}






	public void setRange(int range) {
		this.range = range;
	}






	public void setEnhancedAutoPilot(boolean enhancedAutoPilot) {
		this.enhancedAutoPilot = enhancedAutoPilot;
	}






	



	public void setOrigin(ArrayList<Origin> origin) {
		this.origin = origin;
	}







	public double calcNewPrice(int i) {
		
		double newPrice=0;
		
		if(enhancedAutoPilot)
			newPrice +=  price + 800;
		

		if(maintenanceAndServiceEase)
			newPrice +=  price + 1000;
		
		if(batteryWarrantyPeriod>2) {
			newPrice +=  price + 2000;

		}
		
		String manufacturer = origin.get(i).getManuFacturer();
		String currency = origin.get(i).getCurrency();
		if(manufacturer.equalsIgnoreCase("TOGG") && currency.equalsIgnoreCase("TL"))
			return newPrice +=price * 2.3;
		else if(manufacturer.equalsIgnoreCase("Tesla") && currency.equalsIgnoreCase("euro"))
			return newPrice +=price * 1.2;
		else if(manufacturer.equalsIgnoreCase("Tesla") && currency.equalsIgnoreCase("Dollar"))
			return newPrice +=price * 0.80;
		else if(manufacturer.equalsIgnoreCase("Porsche") && currency.equalsIgnoreCase("Dollar"))
			return newPrice +=price * 1.05;
		else if(manufacturer.equalsIgnoreCase("TOGG") && currency.equalsIgnoreCase("DOLLAR"))
			return newPrice +=price * 2.8;
		else if(manufacturer.equalsIgnoreCase("Porsche") && currency.equalsIgnoreCase("Euro"))
			return newPrice +=price * 2;
		else
			return newPrice;
		

	}


	
	

	

	@Override
	public String toString() {
		
		
		String res= super.toString() +
				"\nElectricCars" +
				"\nMaintenance and Service Ease=" + maintenanceAndServiceEase + 
				"\nBattery Warranty Period=" + batteryWarrantyPeriod + 
				"\nVehicle Status=" + vehicleStatus + 
				"\nRange(km)=" + range + 
				"\nEnhanced Auto Pilot=" + enhancedAutoPilot +  
				"\n" ;
				if(origin.isEmpty())
	                res += "\nOrigin Pakage: None";
	            else
	                res +="\nOrigin Packages: " + origin.toString();
	                       
	           // res+= "\n|---> Total Price: "+ String.format("%,.0f", calcNewPrice()) +"$";
	                
	           return res;
	    
				
	
	}




	@Override
	public double addTax(double priceWithoutTax) {
		// TODO Auto-generated method stub
		
		if(vehicleStatus.equalsIgnoreCase("New")) {
			priceWithoutTax= priceWithoutTax + priceWithoutTax * 0.40;

		}
		if(vehicleStatus.equalsIgnoreCase("secondhand"))
			priceWithoutTax= priceWithoutTax + priceWithoutTax * 1;
		
		if(range>400000)
			
			priceWithoutTax= priceWithoutTax + priceWithoutTax * 0.25;
			

		return priceWithoutTax;
		
	}




	@Override
	public double addTax() {
		// TODO Auto-generated method stub
		return 0;
	}









	
	
}
