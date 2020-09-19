package constructor;

public class CarUser {

	public static void main(String[] args) {

		/*
		 * Car car1 = new Car(); car1.color = "White"; car1.type = "Sedan";
		 * car1.fuelType = "Deisel"; car1.features();
		 * 
		 * Car car2 = new Car(); car2.color = "Grey"; car2.type = "SUV"; car2.fuelType =
		 * "Deisel"; car2.features();
		 * 
		 * Car car3 = new Car(); car3.color = "Silver"; car3.type = "Hatchback";
		 * car3.fuelType = "CNG"; car3.features();
		 */

		// This is calling parameterized constructor
		Car car4 = new Car("Black", "Passenger 2seater", "Li-ion Battery");
		car4.features();
		
		Car car6=new Car("Grey", "BUS", "LPG");
		car6.features();

		Car car5 = new Car();
		car5.features();
		
		Car car7= new Car("Mango", "Limousine");
		car7.features();

	}

}
