package oops.polymorphism;

public class User {
	public static void main(String[] args) {
		StaticPolymorphism obj = new StaticPolymorphism();
		obj.sum(10, 20);
		obj.sum(10, 60, 30);

		Telephone phone1;
		phone1 = new Telephone();
		phone1 = new Mobile();
		phone1 = new SmartPhone();

		Mobile phone2;
		phone2 = new Mobile();
		phone2 = new SmartPhone();
		
		//1. We can use parent class reference for child class object
		
		//2. When we use parent class reference for child class object then we
		// can only call functions which are present in child class
		
		//3. When we use parent class reference for child class object then the
		//overriden functions will get call from child class

		/*
		 * SmartPhone phone3; phone3 = new SmartPhone();
		 * 
		 * Telephone p = new Telephone(); p.calling();
		 * 
		 * Telephone p1 = new Mobile(); p1.calling();
		 * 
		 * Telephone p2 = new SmartPhone(); p2.calling();
		 */
		
		
		Telephone overridenpoly= new Mobile();
		overridenpoly.calling();
		overridenpoly.billing();
		
		Telephone t=new Telephone();
		t.calling();
		t.billing();
	}

}
