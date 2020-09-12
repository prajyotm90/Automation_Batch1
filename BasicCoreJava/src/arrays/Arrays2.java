// No 6

package arrays;

public class Arrays2 {

	public static void main(String args[]) {
		String[] stds = { "Sneha", "Sanket", "Prajyot", "Amruta", "Jyoti" };
		System.out.println(stds[2]);

		for (int i = stds.length - 1; i >= 0; i--) {
			System.out.println(stds[i]);
		}

		int[] ids = { 1, 2, 3, 4, 5 };
		{
			System.out.println(ids[0]);
		}
	}

}
