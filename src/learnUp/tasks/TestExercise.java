package learnUp.tasks;

class Test {
	int a;
	
	Test (int i) {
		a = i;
	}
		
	void swap (Test obj1,Test obj2) {
		Test test_obj = new Test(0);
		test_obj.a = obj1.a;
		obj1.a = obj2.a;
		obj2.a = test_obj.a;
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