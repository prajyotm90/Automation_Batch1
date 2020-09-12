// No 7--> No 8 can be escapted please refer notes

package loops;

public class ForLoop {

	public static void main(String[] args) {

		// initialization; condition; increment/decrement;
		for (int i = 0; i < 10; i++) {
			System.out.println(i);

			if (i * 3 == 6)

			{
				break;
			}
		}

		String[] stds = { "Sneha", "Sanket", "Prajyot", "Amruta", "Jyoti" };
		
		for (int i = stds.length - 1; i >= 0; i--) {
			System.out.println(stds[i]);
		}
	}
}
