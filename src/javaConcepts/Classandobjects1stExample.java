package javaConcepts;

public class Classandobjects1stExample {
	
	/*
	 * Author: Jayanta Kumar Panda
	 */

	public static void main(String[] args) {
		
	//Object is an instance of an class
		
	Car	hyundai = new Car(); //Object creation statement
	Car benz = new Car();
	Car audi = new Car();
		
	hyundai.carModel = "Venue";
	hyundai.carColor = "Red";
	hyundai.carCost = 1300000;
	
	hyundai.startcar();
	hyundai.stopcar();
	hyundai.carDetails();
	
	benz.carModel = "Class A";
	benz.carColor = "Black";
	benz.carCost = 4500000;
	
	benz.startcar();
	benz.stopcar();
	benz.carDetails();
	
	audi.carModel = "Series A3";
	audi.carColor = "Blue";
	audi.carCost = 3500000;
	
	audi.startcar();
	audi.stopcar();
	audi.carDetails();

	}

}

/*
 * Class cannot be communicated with each other
 * Through object class can communicate
 * Class is a template for creating objects
 */

class Car {
	
	String carModel;
	String carColor;
	int carCost;
	
	public void startcar() {
		
		System.out.println(carModel+ " started");
	}
	
	public void stopcar() {
		
		System.out.println(carModel+ " stopped");
	}
	
	public void carDetails() {
		
		System.out.println("The model of the car is: "+ carModel);
		System.out.println("The color of the car is: "+ carColor);
		System.out.println("The cost of the car is: "+ carCost);
		System.out.println("***************************************");
	}
}