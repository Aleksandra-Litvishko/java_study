package Queues;

class DynQueue extends BaseQueue { // динамическая очередь
	private char q[], a[];
	private int putloc, getloc;

	public DynQueue(int size) {
		super(size+1);
		q = new char[size + 1];
		putloc = getloc = 0;
	}

	@Override()
	public void put(char ch) {
		if (putloc == q.length - 1) {
			char t[] = new char[q.length * 2];

			setSize(t.length);
			for (int i = 0; i < q.length; i++) {
				t[i] = q[i];
			}
			q = t;
		}

		putloc++;
		q[putloc] = ch;
	}

	@Override()
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