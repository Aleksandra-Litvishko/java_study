package learnUp; // сортировка пузырьком

class Bubble {
	public static void main(String args[]) {
		int nums[] = {1010000, 5, 13, 0, -9, 144, 10008, 3, 10, 8000, 1, 4};
		
		int a, b, t;
		int counter = 0;
		
		System.out.print("Исходный массив: ");
		for (int i = 0; i < 12; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();

		for (a = 1; a < 12; a++) {
			for (b = 11; b >= a; b--) {
				
				if(nums[b - 1] > nums[b]) {
					t = nums[b - 1];
					nums[b - 1] = nums[b];
					nums[b] = t;
				}
				counter++;
			}
		}
		System.out.print("Отсортированный массив: ");
		for (int i = 0; i < 12; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();

		System.out.println("Количество проходов: " + (counter));
		
	}
}