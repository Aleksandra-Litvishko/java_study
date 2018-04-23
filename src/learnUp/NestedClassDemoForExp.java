package learnUp;

class Outer1 {
	int x[];
	
	Outer1 (int nums1[]) {
		x = nums1;
	}
	
	void Analyze1() {
		Inner1 inob1 = new Inner1();
		System.out.println("Объём комнаты: " + inob1.sp());
	}
	
	class Inner1 {
		int a1 = 1;
		int sp() {
			for(int i = 0; i < x.length; i++) {
				a1 *= x[i];
			}
			return a1;
		}
	}
}
class NestedClassDemoForExp {
	public static void main(String args[]) {
		int arr1[] = {1, 2, 3};
		Outer1 outob = new Outer1(arr1);
		
		outob.Analyze1();
	}
}
