package functions;

public class Car {

//Instance variables==> Non static variables==>can be called ONLY using object of the class
		public String color;
		public String type;
		
		
		//class variables==> Static variables==> can be called using class name
		public static int wheel;
		
		public void feture() {
			System.out.println("Color is: "+color+" with "+wheel+" wheels of type "+type);
		}
		

	

}
