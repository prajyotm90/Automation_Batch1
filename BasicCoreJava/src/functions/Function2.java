//No 17

package functions;

public class Function2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int add = sum(10, 20);
		int add1 = sum(30, 40);
		System.out.println(add + add1);

		System.out.println(eligibility(50, 60));

	}

	public static int sum(int a, int b) {
		int sum = a + b;
		return sum;

	}

	public static boolean eligibility(int maths, int evs) {
		if (maths >= 40 || evs >= 30) {
			return true;
		} else {
			return false;
		}

	}
}
