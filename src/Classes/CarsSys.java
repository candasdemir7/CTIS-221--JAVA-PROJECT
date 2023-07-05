package Classes;

//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.Scanner;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;




public class CarsSys {
	
	private static Set<Cars> carsSet = new LinkedHashSet<Cars>();
	private static ArrayList<Cars> carsList = new ArrayList<Cars>();

	
	
	
	
	//readFromFile
	
	public static boolean readFromFile() {

		try {
			File file = new File("cars.txt"); 

			if (!file.exists()) {
				System.out.println("Error: File does not exists!");
				System.exit(0);
			}

			Scanner input = new Scanner(file);

			Cars newCar = null;

			while (input.hasNext()) {

				int id = input.nextInt();
				String type = input.next();
				String brand = input.next();
				String modelOfVehicle = input.next();
				double price = input.nextDouble();
				String wheels1 = input.next();
				String[] wheels2 = wheels1.split(",");
				String color = input.next();
				String carsReleaseDate = input.next();
				

				if (type.equalsIgnoreCase("ElectricCars")) {
					boolean maintenanceAndServiceEase = input.nextBoolean();
					int batteryWarrantyPeriod = input.nextInt();
					String vehicleStatus = input.next();
					int range = input.nextInt();
					boolean enhancedAutoPilot = input.nextBoolean();
					
					ArrayList<Origin> origin = new ArrayList<>();
					String manuFacturer, currency, tax;
					manuFacturer = input.next();
					currency = input.next();
					tax = input.next();
					Origin orig = new Origin(manuFacturer, currency, tax);
					origin.add(orig);
					newCar = new ElectricCars(id,  type,  brand,  modelOfVehicle, price, wheels2, 
							  color,  carsReleaseDate,  maintenanceAndServiceEase,  batteryWarrantyPeriod,  vehicleStatus,  range,  enhancedAutoPilot, origin);
				} 
				else if (type.equalsIgnoreCase("GasolineDieselGasCars")) {
					String vehicleStatus = input.next();
					String gear = input.next();
					int motorPower = input.nextInt();
					int km = input.nextInt();

					newCar = new GasolineDieselGasCars(id, type, brand, modelOfVehicle, wheels2, price, color, carsReleaseDate,
							 vehicleStatus, gear, motorPower,km);
				} 
				else if (type.equalsIgnoreCase("HybridCars")) {

					int batteryWarrantyPeriod = input.nextInt();
					String hybridType = input.next();
					boolean regenerativeBraking = input.nextBoolean();
					String vehicleStatus = input.next();
					boolean multimediaFullScreen = input.nextBoolean();
					


					newCar = new HybridCars(id, type, brand, modelOfVehicle, wheels2, price, color, carsReleaseDate,
                       batteryWarrantyPeriod, hybridType, regenerativeBraking, multimediaFullScreen,vehicleStatus);
				}

				carsList.add(newCar);

			}

			input.close();
			return true;
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("ERROR: File does not exists!");
			return false;
		}

	}

	
	

	
	 public static Set<Cars> getCarsSet() {
	        return carsSet;
	    }
	
		// The method returns the arraylist.

	 public static ArrayList<Cars> getCarsList() {
	        return carsList;
	    }
	
	//check cars ıd burada
		
		 public static boolean checkCarsID(int id){
				  
			 for (int i = 0; i < carsList.size(); i++) {
					if (carsList.get(i).getId() == id)
						return true;
				}
				return false;
			}
	 
	//adding carr
		 public static boolean addCar(int id, String type, String brand, String modelOfVehicle, double price,
				 	 String[] wheels2, String color, String carsReleaseDate, int playerCount,
					String vehicleStatus,String gear, int motorPower, int km,
					ArrayList<Origin> origin, boolean maintenanceAndServiceEase, int batteryWarrantyPeriod, String vehicleStatus2,
					int range, boolean enhancedAutoPilot, int batteryWarrantyPeriod2, String hybridType, boolean regenerativeBraking,String vehicleStatus3,boolean multimediaFullScreen) {// not sorted

				for (Cars c : carsList)
					if (c.getId() == id)
						return false;

				if (type.equalsIgnoreCase("ElectricCars")) {

					ElectricCars ec = new ElectricCars(id,  type,  brand,  modelOfVehicle, price, wheels2, 
							  color,  carsReleaseDate,  maintenanceAndServiceEase,  batteryWarrantyPeriod,  vehicleStatus,  range,  enhancedAutoPilot, origin);
					carsList.add(ec);
				} else if (type.equalsIgnoreCase("GasolineDieselGasCarsame")) {
					GasolineDieselGasCars gc = new GasolineDieselGasCars(id, type, brand, modelOfVehicle, wheels2, price, color, carsReleaseDate,
							 vehicleStatus, gear, motorPower,km);
					
					carsList.add(gc);
				} else if (type.equalsIgnoreCase("HybridCars")) {

					HybridCars hc = new HybridCars(id, type, brand, modelOfVehicle, wheels2, price, color, carsReleaseDate,
		                       batteryWarrantyPeriod, hybridType, regenerativeBraking, multimediaFullScreen,vehicleStatus);

					carsList.add(hc);
				}

				return true;

			}

		
	 public static void calcAllNewPrice() {

			for (int i = 0; i < carsList.size(); i++) {

				carsList.get(i).setPrice(carsList.get(i).calcNewPrice(0));

			}

		}
	 
	 public static double displayTax(int id) {

			for (int i = 0; i < carsList.size(); i++) {
				if (carsList.get(i).getId() == id) {
					return carsList.get(i).addTax();
				}

			}
			return 0.;

		}
	
		
		

		public static Cars searchCars(int id) {
			for (int i = 0; i < carsList.size(); i++) {
				if (carsList.get(i).getId() == id) {
					return carsList.get(i);
				}

			}
			return null;
		}
		
	
	
	
	


	 public static boolean removeCars(int carsId) {
			for (int i = 0; i < carsList.size(); i++) {
				if (carsList.get(i).getId() == carsId) {
					carsList.remove(i);
					return true;
				}
			}

			return false;
		}
	
	
	
	//display all carss

		public static String displayAllCars() {
			String str = "";

			for (int i = 0; i < carsList.size(); i++) {
				str += carsList.get(i).toString() + "\n";
			}

			return str;
		}


	
	
	
	/*public static String[] displayModelsOfVehicles() {
		String[] result = new String[carsList.size()];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = carsList.get(i).getModelOfVehicle();
		}
		return result;
	}
	*/
		
	
	public static String displayTheCars(String modelOfVehicle) {
		for (int i = 0; i < carsList.size(); i++) {
			if (carsList.get(i).getModelOfVehicle().equalsIgnoreCase(modelOfVehicle))
				return carsList.get(i).toString();
		}

		return null;
	}

	
	//display game by price
	public static String displayTheCarsByPrice(double MaxPrice, double MinPrice) {
		for (int i = 0; i < carsList.size(); i++) {
			if (MaxPrice >= carsList.get(i).getPrice() && carsList.get(i).getPrice() >= MinPrice)
				return carsList.get(i).toString();
		}
		return null;
	}
	
	

}
