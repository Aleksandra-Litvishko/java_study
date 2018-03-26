package learnUp; // нахождение минимального и максимального значения массива, улучшенная версия

class MinMax2{ 
	public static void main(String args[]) {
		int nums[] = {124, 253, -100, -3, 8, 101, 300, 3, 0, 189941}; 
		int min, max;
		
		min = max = nums[0];
		
		for(int i = 0; i < 10; i++) {
			if(nums[i] > max) max = nums[i];
			if(nums[i] < min) min = nums[i];
		}
		
		System.out.println("min и max: " + min + " " + max);
	}
}