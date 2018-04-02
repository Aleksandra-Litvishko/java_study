package learnUp;

class QDem {
	char arr[];
	int putl;
	
	QDem(int size) {
		arr = new char[size+1];
		putl = 0;
	}
	
	void put(char i) {
		if(putl >= arr.length) {
		System.out.println("Выход за верхнюю границу массива!");
		return;
		}
		arr[putl] = i;
		putl++;
	}
	
	 void get(int j) {
		 System.out.print(arr[j]);
	}
}

class QDemoExp {
	public static void main(String args[]) {
		QDem obg = new QDem(40);
		
		for(int i = 0; i < 40; i++) {
			obg.put((char) ('A' + i));
		}
		
		System.out.print("Отображение записанных цифр ");
		for(int i = 0; i < 35; i++) {
			obg.get(i);
		}
		
		System.out.print("\nИиии ");
		obg.get(37);
	}
}