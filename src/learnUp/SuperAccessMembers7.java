package learnUp; // использование ключевого слова super для предотвращения сокрытия имён

class A {
	int i;
}

class B extends A {
	int i; // эта переменная i скрывает переменную i из суперкласса
	
	B (int a, int b) {
		super.i = a; // i из суперкласса
		i = b; // i из подкласса
	}
	
	void show () {
		System.out.println("i в суперклассе: " + super.i);
		System.out.println("i в подклассе: " + i);
	}
}

class SuperAccessMembers7 {
	public static void main(String args[]) {
		B ob = new B(1, 2);
		
		ob.show();
	}
}