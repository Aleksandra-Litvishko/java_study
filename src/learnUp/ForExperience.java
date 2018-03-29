package learnUp; // сортировка пузырьком как я сделала

class ForExperience {
	public static void main(String args[]) {
		int arr[] = {1, -109, 13, 10009, 23, -800, 0, 98, 100, 12, 145, 14};
		
		int min, max;
		int sort;
		int counter = 0;
		
		System.out.print("Исходный массив: ");
		
		for(int i = 0; i < 12; i++ )
		    System.out.print(arr[i] + " ");
		System.out.println();
		
		min = max = arr[0];
		
		for(int i = 0; i < 12; i++) {
			if(arr[i] < min) min = arr[i];
			if(arr[i] > max) max = arr[i];
		}
		System.out.println("min и max: " + min + " " + max);
			
			for(int b = 1; b < 12; b++) {
				for(int i = 11; i >= b; i--) {
				if(arr[i-1] > arr[i]) {
					sort = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = sort;	
				}
				counter++;
			 }
			}
			System.out.print("Отсортированный массив: ");
			
			for(int i = 0; i < 12; i++ )
			    System.out.print(arr[i] + " ");
			System.out.println();
			
	System.out.println("Количество проходов: " + counter);
	}
}