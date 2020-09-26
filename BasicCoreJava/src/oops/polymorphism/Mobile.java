package oops.polymorphism;

public class Mobile extends Telephone {
	public void texting() {

		System.out.println("Texting from mobile");
	}

	// when we have same method name with same parameters in both parent and child class
	// then that concept is known as method overriding
	public void calling() {
		System.out.println("Calling from mobile");
		
		

	}

}
