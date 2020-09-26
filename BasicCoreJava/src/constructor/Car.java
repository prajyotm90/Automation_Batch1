package constructor;

public class Car {

	// TODO Auto-generated method stub
	String color;
	String type;
	String fuelType;

	public Car() {
		// Constructor helps to initialize the object
		// Constructor does not have any return type
		// Constructor name is same as the class name
		// Every class by default has a default constructor
		// Constructor is called whrn the class object is created
		System.out.println("Default constructor");
	}

	public Car(String colorName, String carType, String fuel)
	// In this constructor we have passed different name of parameters
	{
		// Parameterized constructor
		// Instance variables-->
		System.out.println("Parameterized constructor");
		color = colorName;
		type = carType;
		fuelType = fuel;

	}

	public Car(String color, String type)
	// In this constructor we have passed Same name of parameters
	{
		this.color = color;
		this.type = type;
	}

	public void features() {
		System.out.println("Colour of car is: " + color + " of type: " + type + " and fuel type: " + fuelType);
	}

}
