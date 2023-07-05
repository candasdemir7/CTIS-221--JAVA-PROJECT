package Classes;

import java.util.ArrayList;

//SADECE STRİNG KISMI

public class HybridCars extends Cars {
	private int batteryWarrantyPeriod;
	private String hybridType;
	private boolean regenerativeBraking;
	private String vehicleStatus;
	private boolean multimediaFullScreen;



	
	public HybridCars(int id, String type, String brand, String modelOfVehicle, String[] wheels, double budget, String color, 
			String carsReleaseDate, int batteryWarrantyPeriod, String hybridType,boolean regenerativeBraking, boolean multimediaFullScreen, 
			String vehicleStatus) {
		
		super(id, type, brand, modelOfVehicle, wheels, budget,  color,carsReleaseDate);

		this.batteryWarrantyPeriod = batteryWarrantyPeriod;
		this.hybridType = hybridType;
		this.multimediaFullScreen=multimediaFullScreen;
		this.regenerativeBraking=regenerativeBraking;
	
	}

	


	

	




	public int getBatteryWarrantyPeriod() {
		return batteryWarrantyPeriod;
	}











	public String getHybridType() {
		return hybridType;
	}











	public boolean isRegenerativeBraking() {
		return regenerativeBraking;
	}











	public String getVehicleStatus() {
		return vehicleStatus;
	}











	public boolean isMultimediaFullScreen() {
		return multimediaFullScreen;
	}











	public void setBatteryWarrantyPeriod(int batteryWarrantyPeriod) {
		this.batteryWarrantyPeriod = batteryWarrantyPeriod;
	}











	public void setHybridType(String hybridType) {
		this.hybridType = hybridType;
	}











	public void setRegenerativeBraking(boolean regenerativeBraking) {
		this.regenerativeBraking = regenerativeBraking;
	}











	public void setVehicleStatus(String vehicleStatus) {
		this.vehicleStatus = vehicleStatus;
	}











	public void setMultimediaFullScreen(boolean multimediaFullScreen) {
		this.multimediaFullScreen = multimediaFullScreen;
	}











	@Override
	public String toString() {
		return "HybridCars\n"
				+ "\nBattery Warranty Period=" + batteryWarrantyPeriod + 
				"\nHybrid Type=" + hybridType
				+ "\nRegenerative Braking=" + regenerativeBraking + 
				"\nVehicleStatus=" + vehicleStatus
				+ "\nMultiplayer FullScreen=" + multimediaFullScreen + "\n";
	}



	@Override
	public double calcNewPrice(int i) {
		// TODO Auto-generated method stub
		double newPrice =price;
		
		if(regenerativeBraking)
			newPrice *= 1.5;
		if(multimediaFullScreen)
			newPrice +=  price + 800;
		if(vehicleStatus.equalsIgnoreCase("New"))
			newPrice +=price;
		if(vehicleStatus.equalsIgnoreCase("secondhand"))
			newPrice +=price - 30000;
		
		if(multimediaFullScreen)
			newPrice *=  1.25;
		
		
		
		if(hybridType.equalsIgnoreCase("Series Hybrid"))
			newPrice += price * 1;
		else if (hybridType.equalsIgnoreCase("Parallel Hybrid"))
			newPrice += price * 1.2;
		else 
			newPrice += price * 1.5;
		

		return newPrice;
	}



	



	@Override
	public double addTax(double priceWithoutTax) {
		// TODO Auto-generated method stub
		
		if(vehicleStatus.equalsIgnoreCase("New")) {
			priceWithoutTax= priceWithoutTax + priceWithoutTax * 0.40;

		}
		if(vehicleStatus.equalsIgnoreCase("secondhand"))
			priceWithoutTax= priceWithoutTax + priceWithoutTax * 1;

		return priceWithoutTax;

	}



	@Override
	public double addTax() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	
	

}
