//Suppose there is an integer array holding following elements:
//1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1

//Write a program which prints which each number from array and the times it has been repeated in array
//For eg
//1- Repeated 3 times
//4- Repeated 6 times

package Assignment1;

public class RepeatTimesInArrayQ10 {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 5, 6, 3, 2, 4, 6, 7, 9, 4, 12, 3, 4, 6, 8, 9, 7, 6, 43, 2, 4, 7, 7, 5, 2, 1, 3, 4, 6,
				311, 1 };

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			int b = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (b == arr[j]) {
					sum += 1;

				}

			}
			System.out.println(arr[i] + " repeats- " + sum + " times");
		}

	}

}
