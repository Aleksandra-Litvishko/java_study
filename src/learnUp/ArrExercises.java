package learnUp;

class ArrExercises {
	public static void main(String args[]) {
		int arr [];
		arr = new int[15];
		int min, max;
		int sort, temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		min = max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("max è min: " + max + " " + min);
		
		for(int i = 0; i < arr.length; i++) {
			sort = i;
			for(int j = i + 1; j <arr.length; j++) {
				if(arr[j] < arr[sort]) {
					sort = j;
				}
			}
			temp = arr[i];
				arr[i] = arr[sort];
				arr[sort] = temp;
		}
		
		/* for(int i = 0; i < arr.length; i++) {
			for(int j = arr.length - 1; j > i; j--) {
				if(arr[j] > arr[j]) {
					sort = arr[i];
					arr[i] = arr[j];
					arr[j] = sort;
				}
			}
		} */
		
		for(int x: arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}