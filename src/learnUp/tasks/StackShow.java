package learnUp.tasks;

class Stack {
	private char arr[];
	private int putloc, getloc;

	Stack(int size) {
		arr = new char[size];
		putloc = getloc = 1;
	}

	void push(char ch) throws StackFullException {
		if (putloc == arr.length) {
			throw new StackFullException(arr.length);
		}
		arr[putloc] = ch;
		putloc++;
		getloc = putloc - 1;
	}

	char pop() throws StackEmptyException {
		if (putloc == getloc) {
			throw new StackEmptyException();
		}
		if (getloc < 0) {
			return 0;
		}
		putloc--;
		return arr[getloc--];
	}
}

class StackShow {
	public static void main(String args[]) {
		Stack alph = new Stack(35);

		for (int i = 0; i < 30; i++) {
			try {
				alph.push((char) ('А' + i));
			} catch (StackFullException e) {
				System.out.println(e);
			}
		}

		System.out.print("Содержимое алфавита: ");

		for (int i = 0; i < 35; i++) {
			try {
				System.out.print(alph.pop());
			} catch (StackEmptyException e) {
				System.out.println(e.getStackTrace());
			}
		}

		for (int i = 0; i < 8; i++) {
			try {
				alph.push((char) ('А' + i));
			} catch (StackFullException e) {
				System.out.println(e);
			}
		}
		System.out.print(" Содержимое алфавита: ");

		for (int i = 0; i < 10; i++) {
			try {
				System.out.print(alph.pop());
			} catch (StackEmptyException e) {
				System.out.println(e.getStackTrace());
			}
		}
	}
}