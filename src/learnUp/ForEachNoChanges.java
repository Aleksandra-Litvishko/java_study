package learnUp;

class ForEachNoChanges { // циклы for-each предназначены только дл€ чтени€
	public static void main(String args[]) {
		int nums[] = {1,2,3,4,5,6,7,8};
		
		System.out.print("ћассив до изменени€: ");
		for(int i: nums) {
			System.out.print(i + " ");
			i *= i;
		}
		System.out.println();
		
		System.out.print("ћассив после изменени€: ");
		for(int i: nums) {
			System.out.print(i + " ");
		}
	}
}