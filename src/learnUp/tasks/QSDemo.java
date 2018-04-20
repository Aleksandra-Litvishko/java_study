package learnUp.tasks;

class QuickSort { // верси€ класса, реализующего быструю сортировку
	
	static void qsort(char items[]) { // организовать вызов фактического метода быстрой сортировки 
		qs(items, 0, items.length - 1);
	}
	
	private static void qs(char items[], int left, int right) { //рекурсивна€ верси€ метода быстрой сортировки символов
		int i, j;
		char x, y;
		
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
			}
		} while(i <= j);
		
		if(left < j) qs(items, left, j);
		if(i < right) qs(items, i, right);
	}
}

class QSDemo {
	public static void main(String args[]) {
		char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
		
		System.out.println("»сходный массив: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		
		System.out.println();
		
		QuickSort.qsort(a); //отсортировать массив
		
		System.out.print("ќтсортированный массив: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
}