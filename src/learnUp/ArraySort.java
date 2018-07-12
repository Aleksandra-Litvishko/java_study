package learnUp;

public class ArraySort {
	public static void main(String args[]) {
		int[] arr = { 0, 5, 12, 125, -235, 56, 4342, 21356, 7, -8, 46 };
		int temp, min;

		// for (int i = 0; i < arr.length; i++) {
		// for (int j = arr.length - 1; j > i; j--) {
		// if (arr[j] < arr[j - 1]) {
		// temp = arr[j];
		// arr[j] = arr[j - 1];
		// arr[j - 1] = temp;
		// }
		// }
		// }

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}
}