package Queues;

class IQDemo {
	public static void main(String args[]) {
		DynQueue from = new DynQueue(5);
		FixedQueue to = new FixedQueue(10);
		
		for(int i = 0; i < 5; i++) {
			from.put((char) ('A' + i));
			System.out.print((char) ('A' + i));
		}
		
		System.out.println("");
		
		BaseQueue.copy(from, to);

		for(int i = 0; i < 10; i++ ) {
			System.out.print(to.get());
		}

	}
}