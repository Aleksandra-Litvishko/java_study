package Queues;

public class Queue {
	protected char q[], a[];
	protected int putloc, getloc;
	
	public Queue(int size) {
		q = new char[size + 1];
		putloc = getloc = 0;
	}
	
	public static void copyTo(Queue ob, Queue ob1) {

		if (ob.q.length > ob1.q.length ) {
			for (int i = 0; i < ob1.q.length; i++) {
				ob1.q[i] = ob.q[i];
			}
			System.out.println(
					"Массив скопирован не полностью, т.к. размер целевого массива меньше размера исходного массива");
		}

		if (ob1.q.length >= ob.q.length) {
			for (int i = 0; i < ob.q.length; i++) {
				ob1.q[i] = ob.q[i];
			}
		}

		ob1.putloc = ob1.q.length - 1;
		ob1.getloc = 0;

		ob.putloc = ob.q.length - 1;
		ob.getloc = 0;
	}
}