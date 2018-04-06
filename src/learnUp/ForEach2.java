package learnUp;

class ForEach2 {
	public static void main(String args[]) {
		int arr[] [] = new int[3][5];
		int sum = 0;
		int counter = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				arr[i] [j] = (i + 1) * (j + 1);
			}
		}
		System.out.println("Содержимое многомерного массива: ");
		System.out.println();
		
		for(int x[]: arr) {
			for(int y: x) {
				System.out.println("Значение" + y);
				counter++;
				if(counter == arr[0].length) {
					System.out.println();
					counter = 0;
				}
				sum += y;
			}
		}
		System.out.print("Сумма элементов многомерного массива: " + sum);
	}
}