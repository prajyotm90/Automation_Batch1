//Make an integer array. Write a for loop to print the integer array in reverse.

package Assignment1;

public class IntegerArrayQ6 {
	public static void main(String[] args) {
		int num[] = { 10, 20, 30, 40, 50 };
		for (int i = num.length - 1; i >=0; i--) {
			System.out.println(num[i]);
		}
	}
}
