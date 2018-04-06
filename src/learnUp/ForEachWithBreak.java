package learnUp;

class ForEachWithBreak {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		System.out.print("—одержимое массива: ");
		for(int x: arr) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		System.out.print("Ёлементы массива, которые суммируютс€: ");
		for(int x: arr) {
			System.out.print(x + " ");
			sum += x;
			if(x == 5) break;
		}
		System.out.println();
		
		System.out.println("—умма элементов массива из предыдущей строки: " + sum);
	}
}