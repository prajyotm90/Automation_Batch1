// No 15

package arrays;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] data = { { "un", "pw" }, { "u1", "p1" }, { "u2", "p2" }, { "u3", "p3" } };

		System.out.print("");

		for (int r = 0; r < data.length; r++) {
			
			for (int c = 0; c < data[r].length; c++) {
				if(data[r][c]==data[1][0]) {
					System.out.println("------");
				}
				System.out.print
				(data[r][c]+" ");
			}
			System.out.println("");
		}

	}

}
