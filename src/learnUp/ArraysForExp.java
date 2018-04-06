package learnUp;

class ArraysForExp {
	public static void main(String args[]) {
		int arr[] = {1, 0, 199, -59105, 147, 14959768};
		int min, max;
		int change;
		
		System.out.print("Исходный массив: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		min = max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < arr[i - 1]) {
				min = arr[i];
			}
			if(arr[i] > arr[i - 1]) {
				max = arr[i];
			}
		}
		System.out.println("min и max: " + min + " " + max);
		
		System.out.println("Отсортированный массив: ");
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = arr.length - 1; j >= i; j--) {
				if(arr[j] < arr[j - 1]) {
					 change = arr[j];
					 arr[j] = arr[j - 1];
					 arr[j - 1] = change;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}