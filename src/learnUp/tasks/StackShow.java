package learnUp.tasks;

class Stack {
	private char arr[];
	private int putloc, getloc;
	
	Stack(int size) {
		arr = new char[size];
		putloc = getloc = 1;
	}
	
	void push(char ch) {
		if(putloc == arr.length) {
			System.out.println("\nСтек заполнен");
			return;
		}
		arr[putloc] = ch;
		putloc++;
		getloc = putloc - 1;
	}
	
	char pop() {
		if(putloc == getloc) {
			System.out.println("\nСтек пуст");
		    return 0;
		}
		if(getloc < 0) {
			return 0;
		}
		putloc--;
		return arr[getloc--];
	}
}

class StackShow {
	public static void main(String args[]) {
		Stack alph = new Stack(35);
		
		for(int i = 0; i < 30; i++) {
			alph.push((char) ('А' + i));
		}
		
		System.out.print("Содержимое алфавита: ");
		for(int i = 0; i < 30; i++) {
			System.out.print(alph.pop());
		}
		
		for(int i = 0; i < 5; i++) {
			alph.push((char) ('А' + i));
		}
		
		System.out.print(" Содержимое алфавита: ");
		for(int i = 0; i < 10; i++) {
			System.out.print(alph.pop());
		}
	}
}