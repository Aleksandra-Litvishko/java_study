package learnUp.tasks;

class Test {
	int a;
	
	Test (int i) {
		a = i;
	}
		
	static void swap (Test obj1,Test obj2) {
		int t;
		t = obj1.a;
		obj1.a = obj2.a;
		obj2.a = t;
	}
}

class TestExercise {
	public static void main(String args[]) {
		Test ob = new Test(0);
		Test ob1 = new Test(1);
		
		Test.swap(ob, ob1);
		
		System.out.println(ob.a);
		System.out.println(ob1.a);
	}
}