package functions;

public class FunctionParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(10, 20);
		sum(10, 20, 30);
		sum("abc",10);
		sum(10,"pqr");
		sum(20.34,10);
		

	}

	public static void sum(int a, int b) {
		System.out.println(a + b);
	}

	public static void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void sum(String a, int b) {
		System.out.println(a + b);
	}

	public static void sum(int a, String b) {
		System.out.println(a + b);
	}

	public static void sum(double a, int b) {
		System.out.println("Double: " + a + b);
	}

}
