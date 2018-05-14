package Queues;

class FixedQueue extends BaseQueue {
	private char q[], a[];
	private int putloc, getloc; // индексы вставляемых и извлекаемых элементов;
	
	public FixedQueue(int size) {
		super(size+1);
		q = new char[size + 1];
		putloc = getloc = 0;
	}
	
	@Override()
	public void put(char ch) {
		if(putloc == q.length - 1) {
			System.out.println("Очередь заполнена");
		}
		putloc++;
		q[putloc] = ch;
	}
	
	@Override()
	public char get() {
		if(putloc == getloc) {
			System.out.println("Очередь пуста");
			return (char) 0;
		}
		getloc++;
		return q[getloc];
	}
	
	@Override()
	public void reset() {
		a = new char[q.length];
		putloc = getloc = 0;
		q = a;
	}
	
	public static void copy(FixedQueue ob, FixedQueue ob1) {
		
	}
}
