package learnUp.tasks;

class QuickSort { // верси€ класса, реализующего быструю сортировку
	
	static void qsort(int items[]) { // организовать вызов фактического метода быстрой сортировки 
		qs(items, 0, items.length - 1);
	}
	
	public static void console(int items[], int ii) {

		for(int i = 0; i < items.length; i++) {
			System.out.print(items[i]);
		}
		System.out.print(" ");
		System.out.print(ii);
		
		System.out.println();
		
	}
	
	private static void qs(int items[], int left, int right) { //рекурсивна€ верси€ метода быстрой сортировки символов
		int i, j;
		int x, y;
		
		i = left; j = right;
		x = items[(left + right)/2];

		do {
			while((items[i] < x) && (i < right)) {
				i++;
			}
			while((x < items[j]) && (j > left)) {
				j--;
			}
			
			if(i <= j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++; j--;
				console(items, x);
			} 
		} while(i <= j);
		
		if(left < j) qs(items, left, j);
		if(i < right) qs(items, i, right);
	}
}

class QSDemo {
	public static void main(String args[]) {
		int a[] = {8,6,3,1,4,2,5,7,9};
		
		System.out.println("»сходный массив: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}

		System.out.println();
		System.out.println();
		
		QuickSort.qsort(a); //отсортировать массив
		
		System.out.print("ќтсортированный массив: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
}