package learnUp; // сортировка пузырьком как надо

class BubbleForExperience {
	public static void main(String args[]) {
		
		int arr[] = {1, 123, 12, -1000, 800, 0, -851, 8623, 91, 5};
		int newar[] = {0, 8, 90, 65, 87, -100, 76, 580, 192030, 2342, 12, 15};
		
		int t, t1;
		int counter = 0;
		int counter1 = 0;
		
		
		System.out.print("Исходный массив: ");
		
		for(int i = 0; i < 9; i++)
			 System.out.print(arr[i] + " ");
		System.out.println();
		
		for(int b = 9; b > 0; b--)
		for(int i = 0; i < b; i++) {
			if(arr[i] > arr[i + 1]) {
				t = arr[i + 1];
				arr[i + 1] = arr[i];
				arr[i] = t;
			}
		}
		
		System.out.print("Отсортированный массив: ");
		
		for(int i = 0; i < 9; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		
		System.out.print("Исходный массив: ");
		
		for(int i = 0; i < 12; i++) 
			System.out.print(newar[i] + " ");
		System.out.println();
		
		for(int a = 11; a > 0; a--) {
			counter1++;
			for(int b = 0; b < a; b++) {
				if(newar[b] > newar[b + 1]) {
					t1 = newar[b];
					newar[b] = newar[b + 1];
					newar[b + 1] = t1;
					counter++;
				}
			}
		}
System.out.print("Отсортированный массив: ");
		
		for(int i = 0; i < 12; i++)
			System.out.print(newar[i] + " ");
		System.out.println();
System.out.println("Количество проходов: " + (counter + counter1));
	}
}