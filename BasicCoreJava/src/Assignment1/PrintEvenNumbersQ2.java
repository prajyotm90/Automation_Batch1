// Write a for loop to print even numbers between 1 to 100
package Assignment1;

public class PrintEvenNumbersQ2 {

	public static void main(String[] args) {
		int num = 100;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
