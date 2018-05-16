package Queues;

public class DynQueue extends Queue implements ICharQ { // динамическая очередь

	public DynQueue(int size) {
		super(size);
	}

	public void put(char ch) {
		if (putloc == q.length - 1) {
			char t[] = new char[q.length * 2];

			for (int i = 0; i < q.length; i++) {
				t[i] = q[i];
			}
			q = t;
		}

		putloc++;
		q[putloc] = ch;
	}

	public char get() {
		if (getloc == putloc) {
			System.out.println(" - Очередь пуста");
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