package polymorphism.homework;

import polymorph.onthego.assignment.ChromeDriver;
import polymorph.onthego.assignment.EdgeDriver;
import polymorph.onthego.assignment.FirefoxDriver;
import polymorph.onthego.assignment.SuperBrowser;

public class Traveller {

	public static void main(String[] args) {
		Vehicle v = null;
		
		v = new Car();
		v.travelling();
		
		v=new Vehicle();
		v.travelling();
		
		Motorcycle m=new Motorcycle();
		m.travelling();
		

	}
}
