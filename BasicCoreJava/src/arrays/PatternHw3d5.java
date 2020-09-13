package arrays;

public class PatternHw3d5 {

	public static void main(String[] args) {
		int d = 1;
		for (int i = 1; i <= 4; i++) {
			if (i == 1) {
				for (int c = 1; c <= 1; c++) {
					System.out.print(" " + d);
				}
				System.out.println("");
			} else if (i == 2) {
				for (int c = 1; c <= 2; c++) {
					System.out.print(" " + d);
				}
				System.out.println("");
			} else if (i == 3) {
				for (int c = 1; c <= 3; c++) {
					System.out.print(" " + d);
				}
				System.out.println("");
			} else {
				for (int c = 1; c <= 4; c++) {
					System.out.print(" " + d);
				}
				System.out.println("");
			}
		}

	}

}
