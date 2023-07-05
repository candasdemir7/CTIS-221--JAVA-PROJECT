package Classes;

import java.util.Arrays;

public abstract class Cars implements addTax {
	protected int id;
	protected String type;
	protected String brand;
	protected String modelOfVehicle;
	protected double price;
	protected String[] wheels2; //
	protected String color;
	protected String carsReleaseDate;
	
	
	
	
	
	
	public Cars(int id, String type, String brand, String modelOfVehicle, String [] wheels2,
			double price, String color, String carsReleaseDate) {
		
		super();
		this.id = id;
		this.type = type;
		this.brand = brand;
		this.modelOfVehicle = modelOfVehicle;
		this.wheels2=wheels2;
		this.color = color;
		this.carsReleaseDate=carsReleaseDate;
		
		
	}
	
	
	
	
	



	 public int getId() {
		return id;
	}








	public String getType() {
		return type;
	}








	public String getBrand() {
		return brand;
	}








	public String getModelOfVehicle() {
		return modelOfVehicle;
	}








	public double getPrice() {
		return price;
	}








	public String[] getWheels2() {
		return wheels2;
	}








	public String getColor() {
		return color;
	}








	public String getCarsReleaseDate() {
		return carsReleaseDate;
	}








	public void setId(int id) {
		this.id = id;
	}








	public void setType(String type) {
		this.type = type;
	}








	public void setBrand(String brand) {
		this.brand = brand;
	}








	public void setModelOfVehicle(String modelOfVehicle) {
		this.modelOfVehicle = modelOfVehicle;
	}








	public void setPrice(double price) {
		this.price = price;
	}








	public void setWheels2(String[] wheels2) {
		this.wheels2 = wheels2;
	}








	public void setColor(String color) {
		this.color = color;
	}








	public void setCarsReleaseDate(String carsReleaseDate) {
		this.carsReleaseDate = carsReleaseDate;
	}








	public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null) {
	            return false;
	        }
	        if (getClass() != obj.getClass()) {
	            return false;
	        }
	        final Cars other = (Cars) obj;
	        if (this.id != other.id) {
	            return false;
	        }
	        return true;
	    }
	


	

	
	 	public  abstract double addTax();



		public abstract double calcNewPrice(int i);
		
	@Override
	public String toString() {
		return "\nCars"
				+ "\nID=" + id + 
				"\nType=" + type + 
				"\nBrand=" + brand + 
				"\nModel of Car=" + modelOfVehicle
				+ "\n"
				+ "Price=" + String.format("%,.0f", price) + "$"  
				+ "\nWheels=" + Arrays.toString(wheels2) + ", color=" + color
				+ "\nCars Release Date=" + carsReleaseDate + "\n";
	}





}
