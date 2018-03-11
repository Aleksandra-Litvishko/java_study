package learn;

class IfInRead {
	public static void main(String args[])
	throws java.io.IOException {
		int i;
		System.out.println("Для завершения нажмите q");
		
		for(i = 1; (char) System.in.read() != 'q'; i++)
			System.out.println("Прогон #" + i);
	}
}