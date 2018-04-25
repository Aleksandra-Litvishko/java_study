package learnUp;

class QDe {
	private char arr[];
	private int putloc, getloc;
	
	QDe(int size) {
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
		if(putloc == getloc) {
			System.out.println("\nОчередь пуста");
		    return 0;
		}
		return arr[getloc++];
	}
}

class QDemoExpNew {
	public static void main(String args[]) {
		QDe alph = new QDe(35);
		
		for(int i = 0; i < 32; i++) {
			alph.put((char) ('А' + i));
		}
		
		System.out.print("Содержимое алфавита: ");
		for(int i = 0; i < 32; i++) {
			System.out.print(alph.get());
		}
	}
}