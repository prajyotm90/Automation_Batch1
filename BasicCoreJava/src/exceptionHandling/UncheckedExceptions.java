package exceptionHandling;

import oops.abstraction.RBI;

public class UncheckedExceptions {
	// UncheckedExceptions since they are checked or identified at run time
	// Exceptions: It can be handled (Arithmetic,FileNotFound)
	// Errors: It CANT be handled(Stack overflow, OutOfMemory, Asserts)
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

	}

}
