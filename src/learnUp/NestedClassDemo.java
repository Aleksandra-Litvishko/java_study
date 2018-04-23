package learnUp;

class Outer {
	int nums [];
	
	Outer(int n[]) {
		nums = n;
	}
	
	void Analyze () {
		Inner inOb = new Inner();
		
		System.out.println("Минимум: " + inOb.min());
		System.out.println("Максимум: " + inOb.max());
		System.out.println("Среднее: " + inOb.avg());
	}
	class Inner {
		int min() {
			int m = nums[0];
			
			for(int i = 1; i < nums.length; i++) {
				if(nums[i] < m) {
					m = nums[i];
				}
			}
			return m;
		}
		int max() {
			int m = nums[0];
			
			for(int i = 0; i < nums.length; i++) {
				if(nums[i] > m) {
					m = nums[i];
				}
			}
			return m;
		}
		int avg() {
			int a = 0;
			
			for(int i = 0; i < nums.length; i++) {
				a += nums[i];
			}
			return a/nums.length;
		}
     }
}
class NestedClassDemo {
	public static void main(String args[]) {
		  int x[]  = {1,2,3,4,5,6,7,8,9};
		  Outer nob = new Outer(x);
		 nob.Analyze();
	}
}