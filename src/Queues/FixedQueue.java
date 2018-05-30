package Queues;

public class FixedQueue extends Queue implements ICharQ {

	public FixedQueue(int size) {
		super(size);
	}

	public void put(char ch) throws QueueFullException {
		if (putloc == q.length - 1) {
			throw new QueueFullException(q.length);
		}
		putloc++;
		q[putloc] = ch;
	}

	public char get() throws QueueEmptyException {
		if (putloc == getloc) {
			throw new QueueEmptyException();
		}
		getloc++;
		return q[getloc];
	}

	public void reset() {
		a = new char[q.length];
		putloc = getloc = 0;
		q = a;
	}
}
