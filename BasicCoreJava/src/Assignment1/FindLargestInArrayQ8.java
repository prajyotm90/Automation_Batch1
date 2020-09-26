//) Find the greatest number in a array

package Assignment1;

public class FindLargestInArrayQ8 {

	public static void main(String[] args) {
		int arr[] = { 110, 50, 70, 80, 90, 41, 22, 11 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max is:: " + max);
	}

}
