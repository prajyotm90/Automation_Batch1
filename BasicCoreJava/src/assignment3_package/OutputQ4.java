package assignment3_package;

public class OutputQ4 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SomeClass obj = null;
		try {
			obj.someMethod();
			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
