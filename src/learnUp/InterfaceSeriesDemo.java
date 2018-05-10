package learnUp;

interface Series { // объявление интерфейса
	int getNext();
	void reset();
	void setStart(int x);
}

class ByThrees implements Series {
	int start;
	int val;
	
	ByThrees() {
		start = 0;
		val = 0;
	}
	
	public int getNext() {
		val += 3;
		return val;
	}
	
	public void reset() {
		start = 0;
		val = 0;
	}
	
	public void setStart(int x) {
		val = x;
		start = x;
	}
}

class ByTwos implements Series { // реализация интерфейса Series
	private int val;
	private int prev; // класс, реализующий интерфейс, может содержать дополнительные переменные
	
	ByTwos() {
		val = 0;
		prev = -2;
	}

	public int getNext() {
		prev = val;
		val += 2;
		return val;
	}
	
	public void reset() {
		val = 0;
		prev = -2;
	}
	
	public void setStart(int x) {
		val = x;
		prev = x - 2;
	}
	
	int getPrevious() { // класс, реализующий интерфейс, может содержать дополнительные методы 
		return prev;
	}
}

class InterfaceSeriesDemo {
	public static void main(String args[]) {
		ByTwos ob = new ByTwos();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Следующее значение: " + ob.getNext());
		}
		
		System.out.println("\nСброс");
		ob.reset();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Следующее значение: " + ob.getNext());
		}
		
		System.out.println("\nНачальное значение: 100");
		ob.setStart(100);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Следующее значение: " + ob.getNext());
		}
	}
}