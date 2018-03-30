package learnUp; // использование переменной length для копирования массива

class ACopy {
	public static void main(String args[]) {
		int nums1[] = new int[10];
		int [] nums2 = new int[10];
		
		for(int i = 0; i < nums1.length; i++) {
			nums1[i] = i;
		}
		
		if(nums2.length >= nums1.length) {
			for(int i = 0; i < nums1.length; i++) {
				nums2[i] = nums1[i];
			}
		}
		
		System.out.print("nums2: ");
		
		for(int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + " ");
		}
	}
}