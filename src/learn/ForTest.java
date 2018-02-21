package learn;

class ForTest {
	public static void main(String args[]) 
	throws java.io.IOException {
		int i;
		
		System.out.println("Для остановки нажмите q");
		
		for(i = 0;((char) System.in.read() == 'q'); i++) 
			System.out.println("Прогон # " + i);
	}
}