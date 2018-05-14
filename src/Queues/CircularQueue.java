package Queues;

class CircularQueue extends BaseQueue { //кольцевая очередь
	private char q[], a[];
	private int putloc, getloc; // индексы вставляемых и извлекаемых элементов;
	
	public CircularQueue(int size) {
		super(size+1);
		q = new char[size + 1];
		putloc = getloc = 0;
	}
	
	@Override()
	public void put(char ch) { // очередь считается полной, если индекс putloc на единицу меньше индекса getloc или если индекс putloc указывает на конец массива, а getloc на начало
		if(putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
			System.out.println("Очередь заполнена");
			return;
		}
		
		putloc++;
		if(putloc == q.length) { // перейти в начало массива
			putloc = 0;
		}
		q[putloc] = ch;
	}
	
	@Override()
	public char get() {
		if(getloc == putloc) {
			System.out.println(" - Очередь пуста");
			return (char) 0;
		}
		
		getloc++;
		if(getloc == q.length) { // перейти в начало массива
			getloc = 0;
		}
		return q[getloc];
	}
	
	@Override()
	public void reset() {
		a = new char[q.length];
		putloc = getloc = 0;
		q = a;
	}
}
