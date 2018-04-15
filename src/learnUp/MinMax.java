package learnUp; // нахождение минимального и максимального значения массива

class MinMax {
	public static void main(String args[]) {
		int nums[] = new int[10];
		int min, max;
		
		nums[0] = 124;
		nums[1] = 253;
		nums[2] = -100;
		nums[3] = -3;
		nums[4] = 8;
		nums[5] = 101;
		nums[6] = 300;
		nums[7] = 3;
		nums[8] = 0;
		nums[9] = 189941;
		
		min = max = nums[0];
		
		for(int i: nums) {
			if(i < min) min = i;
			if(i > max) max = i;
		}
		
		System.out.println("min и max: " + min + " " + max);
	}
}