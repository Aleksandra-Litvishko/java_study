package learnUp.tasks;

class Stack1 {
	private char arr1[];
	private int putloc1, getloc1;
	
	Stack1(int size1) {
		arr1 = new char[size1];
		putloc1 = getloc1 = 1;
	}
	
	Stack1(Stack1 ob1) {
		putloc1 = ob1.putloc1;
		getloc1 = ob1.getloc1;
		arr1 = new char[ob1.arr1.length];
		
		for(int i = 0; i < putloc1; i++) {
			arr1[i] = ob1.arr1[i];
		}
	}
	
	Stack1(char a[]) {
		arr1 = new char[a.length];
		
		for(int i = 0; i < a.length; i++) {
			push1(a[i]);
		}
	}
	
	void push1(char ch) {
		if(putloc1 == arr1.length) {
			System.out.println("\nСтек заполнен");
			return;
		}
		arr1[putloc1] = ch;
		putloc1++;
		getloc1 = putloc1 - 1;
	}
	
	char pop1() {
		if(putloc1 == getloc1) {
			System.out.println("\nСтек пуст");
		    return 0;
		}
		if(getloc1 < 0) {
			return 0;
		}
		putloc1--;
		return arr1[getloc1--];
	}
}

class StackShowNew {
	public static void main(String args[]) {
		Stack1 alph2 = new Stack1(35);
		
		for(int i = 0; i < 30; i++) {
			alph2.push1((char) ('А' + i));
		}
		
		Stack1 alph3 = new Stack1(alph2);
		
		System.out.print("Содержимое alph3: ");
		for(int i = 0; i < 30; i++) {
			System.out.print(alph3.pop1());
		}
		
		System.out.print(" Содержимое alph2: ");
		for(int i = 0; i < 30; i++) {
			System.out.print(alph2.pop1());
		}
		
		char name [] = {'A', 'l', 'e', 'x'};
		Stack1 alph4 = new Stack1(name);
		
		System.out.print(" Содержимое alph4: ");
		for(int i = 0; i < 4; i++) {
			System.out.print(alph4.pop1());
		}
	}
}