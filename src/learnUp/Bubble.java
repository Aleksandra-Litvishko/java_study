package learnUp;

class Bubble {
	public static void main(String args[]) {
		int nums[] = {101, 5, 13, 0, -9, 144, 10008, 3, 10, -8000};
		
		int a, b, t;
		int size;
		
		size = 10;
		
		System.out.print("Исходный массив: ");
		for(int i = 0; i < 10; i++)
			System.out.print(nums[i] + " ");
			System.out.println();
			
			for(a = 1; a < size; a++) 
			for(b = size - 1; b >= a; b--) {
				
				if(nums[b - 1] > nums[b]) {
					t = nums[b - 1];
					nums[b - 1] = nums[b];
					nums[b] = t;
				}
			}
			System.out.print("Отсортированный массив: ");
			for(int i = 0; i < 10; i++)
				System.out.print(nums[i] + " ");
			System.out.println();
	}
}