package arrays;

public class PatternHw3d4 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			if (i == 1) {
				for (int c = 1; c < 2; c++) {
					System.out.print(" " + c);
				}
				System.out.println("");
			}

			else if (i == 2) {
				for (int c = 1; c < 3; c++) {
					System.out.print(" " + c);
				}
				System.out.println("");
			} else if (i == 3) {
				for (int c = 1; c < 4; c++) {
					System.out.print(" " + c);
				}
				System.out.println("");
			} else {
				for (int c = 1; c < 5; c++) {
					System.out.print(" " + c);
				}
				System.out.println("");
			}
		}

	}
}