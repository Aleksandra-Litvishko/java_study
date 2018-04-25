package learnUp.tasks;

class QueueNew {
	private char arr[];
	
	private int putloc, getloc;
	
	QueueNew(int size) {
		arr = new char[size];
		putloc = 0;
		getloc = -1;
	}
	
	void put(char ch) {
		if(putloc == arr.length) {
			System.out.println("\nОчередь заполнена");
			return;
		}
		arr[putloc] = ch;
		putloc++;
		getloc++;
	}

	char pop() {
		if (putloc == getloc || getloc < 0) {
			System.out.print("Queue is empty");
			return (char) 0;
		}
		putloc--;
		return arr[getloc--];
	}
	
}

class QueueExercise {
	public static void main(String args[]) {
		QueueNew alph = new QueueNew(35);
		
		for(int i = 0; i < 32; i++) {
			alph.put((char) ('А' + i));
		}
		
		System.out.print("Содержимое алфавита: ");
		for(int i = 0; i < 3; i++) {
			System.out.print(alph.pop());
		}
		
		for(int i = 0; i < 3; i++) {
			alph.put((char) ('А' + i));
		}
		

		System.out.print("Содержимое алфавита: ");
		for(int i = 0; i < 32; i++) {
			System.out.print(alph.pop());
		}
	}
}