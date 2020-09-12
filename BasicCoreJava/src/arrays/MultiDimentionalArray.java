// No 14

package arrays;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] data = new String[6][2];

		// Row 1
		data[0][0] = "Username";
		data[0][1] = "Password";

		// Row 2
		data[1][0] = "usr1";
		data[1][1] = "pwd1";

		// Row 3
		data[2][0] = "usr2";
		data[2][1] = "pwd2";

		// Row 4
		data[3][0] = "usr3";
		data[3][1] = "pwd3";

		for (int r = 0; r < 4; r++) {
			System.out.println("\n");
			for (int c = 0; c < 2; c++) {
				System.out.println(data[r][c]);
			}
		}

	}

}
