package Queues;

public class FixedQueue extends Queue implements ICharQ {

	public FixedQueue(int size) {
		super(size);
	}

	public void put(char ch) {
		if (putloc == q.length - 1) {
			System.out.println("Очередь заполнена");
		}
		putloc++;
		q[putloc] = ch;
	}

	public char get() {
		if (putloc == getloc) {
			System.out.println("\nОчередь пуста");
			return (char) 0;
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
