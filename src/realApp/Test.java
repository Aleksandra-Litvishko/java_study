package realApp;

public class Test {
	public int i = 0;
	
	public void t() {
		
		this.i = 2;
		int i = 0;
		
		System.out.println(i);
		if (true) {
			int y = 0;
			System.out.println(i);
			if (true) {
				System.out.println(y);
				int x = 0;
			}
		}
		int x = 0;
		
	}
	
	public void b() {
		int i = 0;
		System.out.println(i);
	}
}
