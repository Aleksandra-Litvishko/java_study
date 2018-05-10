package learnUp;

class FixedQueue implements ICharQ {
	private char q[];
	private int putloc, getloc; // индексы вставляемых и извлекаемых элементов;
	
	public FixedQueue(int size) {
		q = new char[size + 1];
		putloc = getloc = 0;
	}
	
	public void put(char ch) {
		if(putloc == q.length - 1) {
			System.out.println("Очередь заполнена");
		}
		putloc++;
		q[putloc] = ch;
	}
	
	public char get() {
		if(putloc == getloc) {
			System.out.println("Очередь пуста");
			return (char) 0;
		}
		getloc++;
		return q[getloc];
	}
}

class CircularQueue implements ICharQ {
	private char q[];
	private int putloc, getloc; // индексы вставляемых и извлекаемых элементов;
	
	public CircularQueue(int size) {
		q = new char[size + 1];
		putloc = getloc = 0;
	}
	public void put(char ch) { // очередь считается полной, если индекс putloc на единицу меньше индекса getloc или если индекс putloc указывает на конец массива, а getloc на начало
		if((putloc + 1 == getloc) | ((putloc == q.length - 1) & (getloc == 0))) {
			System.out.println("Очередь заполнена");
		}
		putloc++;
		if(putloc == q.length) { // перейти в начало массива
			putloc = 0;
		}
		q[putloc] = ch;
	}
	
	public char get() {
		if(putloc == getloc) {
			System.out.println(" - Очередь пуста");
			return (char) 0;
		}
		getloc++;
		
		if(getloc == q.length) { // перейти в начало массива
			getloc = 0;
		}
		return q[getloc];
	}
}