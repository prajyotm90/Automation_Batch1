package exceptionHandling;

import oops.abstraction.RBI;

public class ExceptionHandling2 {
	public static void main(String[] args) {
		
		

		int a = 0;
		int b = 20;

		// 1. Arithmetic exception
		System.out.println(b / a);

		// 2. StringIndexOutOfBound exception
		String name = "Anand";
		System.out.println(name.charAt(6));

		// 3. ArrayIndexOutOfBound exception
		String[] arr = { "Prajyot", "Sunil" };
		System.out.println(arr[2]);

		// 4. NullPinter exception
		RBI rbi = null;
		rbi.creditCard();
		
		//Scenario 1
		//Launch browser
		//Login
		//Validate compose email functionality
		
		//Scenario 2 Validate the visibility of all fields displayed on homepage
		//Search text box,gmail link,You tube, Languages,Image
		//Need to create separate try catch block for each step
		//validate search box is displayed
		//validate gmail is displayed
		//validate You Tube is displayed
		//validate Languages is displayed
	}

}
