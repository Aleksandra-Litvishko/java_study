package learnUp;

class QDemoExp {
	public static void main(String args[]) {
		int arr[] = {169, 0, 13, 146666, 47, 68903, -139586};
		int min, max;
		int ch = 0;
		
		System.out.println("Исходный массив: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		
		min = max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < arr[i-1]) {
				min = arr[i];
			}
			if(arr[i] > arr[i - 1]) {
				max = arr[i];
			}
		}
		System.out.println("\nmin и max: " + min + " " + max);
	
		
		System.out.println("\nОтсортированный массив: ");
		for(int i = 1; i < arr.length; i++) {
			for(int j = arr.length - 1; j >= i; j--) {
				if(arr[j] < arr[j - 1]) {
					ch = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] =  ch;
				}
			}
		} 
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}
}