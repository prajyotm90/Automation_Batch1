package exceptionHandling;

import oops.abstraction.RBI;

public class ExceptionHandling3 {
	public static void main(String[] args) {

		int a = 0;
		int b = 20;

		try {

			// 1. ArithmeticException
			System.out.println(b / a);

			// 2. StringIndexOutOfBoundsException
			String name = "Anand";
			System.out.println(name.charAt(6));

			// 3. ArrayIndexOutOfBoundsException
			String[] arr = { "Prajyot", "Sunil" };
			System.out.println(arr[2]);

			// 4. NullPointerException
			RBI rbi = null;
			rbi.creditCard();
		} catch (ArithmeticException e) {
			System.out.println("Recovery scenario 1");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Recovery scenario 2");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Recovery scenario 3");
		} catch (NullPointerException e) {
			System.out.println("Recovery scenario 4");
		} catch (Exception e) {
			System.out.println("Unknown exception");
		}

	}

}
