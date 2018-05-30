package Queues;

public class CircularQueue extends Queue implements ICharQ { //кольцевая очередь
	
	public CircularQueue(int size) {
		super(size);
	}
	public void put(char ch) throws QueueFullException { // очередь считается полной, если индекс putloc на единицу меньше индекса getloc или если индекс putloc указывает на конец массива, а getloc на начало
		if(putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
			throw new QueueFullException(q.length);
		}
		
		putloc++;
		if(putloc == q.length) { // перейти в начало массива
			putloc = 0;
		}
		q[putloc] = ch;
	}
	
	public char get() throws QueueEmptyException {
		if(getloc == putloc) {
			throw new QueueEmptyException();
		}
		
		getloc++;
		if(getloc == q.length) { // перейти в начало массива
			getloc = 0;
		}
		return q[getloc];
	}
	
	public void reset() {
		a = new char[q.length];
		putloc = getloc = 0;
		q = a;
	}
}
