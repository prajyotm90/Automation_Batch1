// No 4

package ifElseStatement;

public class Swapping {
	public static void main(String args[]) {

		int a = 20;
		int b = 10;

		System.out.println("old a is " + a); // 20
		System.out.println("old b is " + b); // 10
		int c;
		c = a + b;// c= 30
		b = c - b;// b= 20
		a = c - b;// a= 10

		System.out.println("\nnew a is " + a); // 10
		System.out.println("new b is " + b); // 20

		a = a + b; // a=10+20=30
		b = a - b; // b=30-20=10
		a = a - b; // a=30-10=20

		System.out.println("\n");
		System.out.println("no third variable used a " + a); // 20
		System.out.println("no third variable used b " + b); // 10

		c = b; // c=10
		b = a; // b=20
		a = c; // a=10

		System.out.println("\n reswap a is " + a); // 10
		System.out.println("reswap b is " + b); // 20
	}

}
