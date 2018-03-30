package learnUp; // присваивание ссылок на массивы

class AssignARef {
	public static void main(String args[]) {
		
		int nums1[] = new int[10];
		int [] nums2 = new int[10];
		
		System.out.print("Массив nums1: ");
		
		for(int i = 0; i < 10; i++) {
			nums1[i] = i;
			System.out.print(nums1[i] + " ");
		}
		System.out.println();
		
		System.out.print("Массив nums2: ");
		
		for(int i = 0; i < 10; i++) {
			nums2[i] = -i;
			System.out.print(nums2[i] + " ");
		}
		System.out.println();
		
		nums2 = nums1;
		
		System.out.print("Массив nums2 после присвоения: ");
		
		for(int i = 0; i < 10; i++) {
			System.out.print(nums2[i] + " ");
		}
		System.out.println();
		
		nums2[3] = 11;
		
		System.out.print("Массив nums1 после изменения массива nums2: ");
		
		for(int i = 0; i < 10; i++) {
			System.out.print(nums1[i] + " ");
		}
	}
}