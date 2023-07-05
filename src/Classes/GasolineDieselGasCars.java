package Classes;

import java.util.ArrayList;

public class GasolineDieselGasCars extends Cars{
	private String vehicleStatus;
	private String gear;
	private int motorPower;
	private int km; 



	public GasolineDieselGasCars(int id, String type, String brand, String modelOfWehicle, String[] wheels2,
			double budget, String color,String carsReleaseDate, String vehicleStatus, String gear,
			int motorPower, int km) {
		// TODO Auto-generated constructor stub
		
		super(id, type, brand, modelOfWehicle, wheels2, budget,  color, carsReleaseDate);
		this.gear=gear;
		this.km=km;
		this.motorPower=motorPower;
		this.vehicleStatus=vehicleStatus;
		
		
				
	}



	public String getVehicleStatus() {
		return vehicleStatus;
	}



	public String getGear() {
		return gear;
	}



	public int getMotorPower() {
		return motorPower;
	}



	public int getKm() {
		return km;
	}



	public void setVehicleStatus(String vehicleStatus) {
		this.vehicleStatus = vehicleStatus;
	}



	public void setGear(String gear) {
		this.gear = gear;
	}



	public void setMotorPower(int motorPower) {
		this.motorPower = motorPower;
	}



	public void setKm(int km) {
		this.km = km;
	}



	@Override
	public String toString() {
		return "Gasoline || Diesel || Cars\n"
				+ super.toString()
				+ "\nGear Type=" + gear 
				+ "\nKM of the car=" + km
				+ "\n Motor Power:"+ motorPower 
				+ "\n";
	}



	





	@Override
	public double calcNewPrice(int i) {
		double newPrice=price;
		
		if(vehicleStatus.equalsIgnoreCase("New"))
			newPrice +=price;
		else if(vehicleStatus.equalsIgnoreCase("secondhand"))
			newPrice +=price - 30000;
		
		if(gear.equalsIgnoreCase("automatic"))
			newPrice +=price + 10000;
		else if(gear.equalsIgnoreCase("manuel"))
			newPrice +=price - 10000;
		
		
		return newPrice;
	}


	
	

	@Override
	public double addTax(double priceWithoutTax) {
		// TODO Auto-generated method stub
		
		if(motorPower==1)
			
			priceWithoutTax= priceWithoutTax + priceWithoutTax * 0.30;
		
		if(km==0 && km<100000)
			
			priceWithoutTax= priceWithoutTax + priceWithoutTax * 0.25;
			
		return priceWithoutTax;
	}



	@Override
	public double addTax() {
		// TODO Auto-generated method stub
		return 0;
	}



	

	

	
	
	
	
	

}
