package functions;

public class CarUser {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.color="Red";
		car1.wheel=6;
		//Car.wheel=4;
		car1.type="SUV";
		car1.feture();
		
		Car car2=new Car();
		car2.color="White";
		car2.wheel=1;
		car2.type="Hatchback";
		car2.feture();
		
		Car car3=new Car();
		car3.feture();

	}

}
