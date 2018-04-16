package learnUp;

class FSDemo {
	private int a[];
	private int errval;
	public int length;
	
	public FSDemo (int size, int errv) {
		a = new int[size];
		length = size;
		errval = errv;
	}
	
	public boolean put (int index, int val) {
		if(indexOk(index)) {
			a[index] = val;
			return true;
		}
		return false;
		
	}private boolean indexOk(int index) {
		if(index >= 0 & index < a.length) {
			return true;
		}
		return false;
	}
	
	public int get(int index) {
		if(indexOk(index)) {
			return a[index];
		}
		return errval;
	}
	
}

class FailSoftArray {
	public static void main(String args[]) {
		FSDemo fs = new FSDemo(5, -1);
		int x;
		
		System.out.println("Обработка ошибок без вывода отчёта.");
		
		for(int i = 0; i < (fs.length * 2); i++) {
			fs.put(i, i*10);
		}
		
		for(int i = 0; i < (fs.length * 2); i++) {
			x = fs.get(i);
			if(x != -1) {
				System.out.print(x + " ");
			    }
			}
		
		System.out.println("");
		
		System.out.println("\nОбработка ошибок с выводом отчёта.");
		for(int i = 0; i < (fs.length * 2); i++) {
			if(!fs.put(i, i*10)) {
				System.out.println("Индекс " + i + " вне допустимого диапазона");
			}
		}
		for(int i = 0; i < (fs.length * 2); i++) {
			x = fs.get(i);
			if(x != -1) {
				System.out.print(x + " ");
			}
			else {
				System.out.println("Индекс " + i + " вне допустимого диапазона");
			}
		}
	}
}