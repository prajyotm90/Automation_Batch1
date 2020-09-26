////Write a for loop which prints numbers from 1 to 100 
//but if the number is divisible by 5, it prints 'divisible by 5 followed by that number'

package Assignment1;

public class PrintNumbersExceptDivideBy5 {

	public static void main(String[] args) {
		PrintNumbersExceptDivideBy5 d = new PrintNumbersExceptDivideBy5();
		d.logic();
	}

	public void logic() {
		int num = 100;
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.println("Divisible by 5: " + i);
			} else {
				System.out.println(i);
			}
		}

	}

}
