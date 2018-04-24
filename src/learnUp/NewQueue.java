package learnUp;

class QueueNew {
	private char arr[];
	private int putloc, getloc;
	
	QueueNew(int size) {
		arr = new char[size+1];
		putloc = getloc = 0;
	}
	
	void put(char ch) {
		if(putloc == arr.length) {
			System.out.println("\nОчередь заполнена");
			return;
		}
		arr[putloc] = ch;
		putloc++;
	}
	
	char get() {
		if (putloc == getloc) {
			System.out.print("Queue is empty");
			return (char) 0;
		}
		
		return arr[getloc++];
	}
	
}

class NewQueue {
	public static void main(String args[]) {
		QueueNew alph = new QueueNew(35);
		
		for(int i = 0; i < 32; i++) {
			alph.put((char) ('А' + i));
		}
		
		System.out.print("Содержимое алфавита: ");
		for(int i = 0; i < 32; i++) {
			System.out.print(alph.get());
		}
	}
}