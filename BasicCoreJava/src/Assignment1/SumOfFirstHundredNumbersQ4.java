// Write a for loop to find the sum of first 100 numbers(1 to 100)

package Assignment1;

public class SumOfFirstHundredNumbersQ4 {

	public static void main(String[] args) {
		int num = 100;
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of first 100 numbers is: " + sum);

	}

}

