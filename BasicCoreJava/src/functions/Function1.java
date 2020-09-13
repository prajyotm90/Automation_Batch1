//No 16

package functions;

public class Function1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		sum1(10, 10);
		sum1(60, 52);
		message("Sneha", 28);

	}

	public static void message(String str, int age) {
		System.out.println("Name is: " + str + " age is " + age);

	}

	public static void sum() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}

	public static void sum1(int z, int m) {

		System.out.println(z + m);
	}

}
