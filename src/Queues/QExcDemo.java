package Queues;

class QExcDemo {
	public static void main(String args[]) {
		FixedQueue fq = new FixedQueue(10);
		
		char ch;
		
		try { // переполнение очереди
			for(int i = 0; i < 11; i++) {
				System.out.print("Попытка сохранения: " + (char) ('A' + i) +" ");
				fq.put((char) ('A' + i));
				System.out.println("- ОК");
			}
		}
		catch(QueueFullException exc) {
			System.out.println(exc);
		}
		
		System.out.println(" ");
		
		try {
			for(int i = 0; i < 11; i++) {
				System.out.print("Попытка извлечения: ");
				ch = fq.get();
				System.out.print(ch);
				System.out.println(" - ОК");
			}
		}
		catch(QueueEmptyException exc) {
			System.out.println(exc);
		}
	}
}