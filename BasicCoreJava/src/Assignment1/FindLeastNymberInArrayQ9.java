//Find the least number in a array

package Assignment1;

public class FindLeastNymberInArrayQ9 {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 6, 78, 94, 0, 5, 3, 0, -3, 45 };
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Minimum is:  " + min);

	}

}
