package learnUp.tasks;

class Test {
	int a;
	Test (int i) {
		a = i;
	}
	
	void Swap(Test o1, Test o2) {
		Test obj = new Test(0);
		Test obj1 = new Test(0);
		
		obj.a = o1.a;
		o2.a = obj.a;
		
		obj1.a = o2.a;
		o1.a = obj1.a;
	}
}

class TestExercise {
	public static void main(String args[]) {
		Test ob = new Test(2);
		Test ob1 = new Test(1);
		
		System.out.println(ob.a);
		System.out.println(ob1.a);
	}
}