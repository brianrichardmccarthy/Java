/*
 * Student name: Brian McCarthy.
 * Student number: 20063914
 * Program: Implement Auto class
 * Date: 1/28/2016
 */
package multimediaProgramming.assignmentTwo;

public class AutoTest {

	public static void main(String[] args) {
		
		// declare and initialize two instances of Auto class called superCar and familyCar
		Auto superCar = new Auto("BMW", 150, 20), familyCar = new Auto("Toyota", 250, 10);
		
		// change the superCar instance variable mi;esDriven to 200 using mutator
		superCar.setMilesDriven(200);
		
		/*
		 * Print out instance variables for superCar and familyCar
		 * Expected output is
		 * Super Car
		 * Model: BMW
		 * Miles Driven: 200
		 * Gallons of Gas: 20.0
		 * 
		 * Family Car
		 * Model: Toyota
		 * Miles Driven: 250
		 * Gallons of Gas: 10.0
		 */
		System.out.println("Super Car\nModel: " 
							+ superCar.getModel() 
							+ "\nMiles Driven: " 
							+ superCar.getMilesDriven() 
							+ "\nGallons of Gas: " 
							+ superCar.getGallonsOfGas() 
							+ "\n");
		System.out.println("Family Car\nModel: " 
				+ familyCar.getModel() 
				+ "\nMiles Driven: " 
				+ familyCar.getMilesDriven() 
				+ "\nGallons of Gas: " 
				+ familyCar.getGallonsOfGas());

	}
}