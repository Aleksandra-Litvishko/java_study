package learnUp;

class ArrSort {
	public static void main(String args[]) {
		int arr[] = new int[10];
		int min, min_i, tmp;
		min = min_i = tmp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*100);
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = min;
			min_i = i;
			
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] < min) {
					min = arr[j];
					min_i = j;
				}
			}
			if(i != min_i) {
				tmp = arr[i];
				arr[i] = arr[min];
				arr[min] = tmp;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}