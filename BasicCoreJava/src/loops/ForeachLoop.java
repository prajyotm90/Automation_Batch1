// No 9

package loops;

public class ForeachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stds = { "Sneha", "Sanket", "Prajyot", "Amruta", "Jyoti" };

		// foreach or enhanced for loop
		// this loop will always print values in increment order only

		for (String abc : stds)
			// above loop is equal to for(int i=0;i<10;i++) and will work only in increment order
			System.out.println(abc);

	}

}
