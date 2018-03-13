package tasks;

class DotExer {
	public static void main(String args[])
	throws java.io.IOException {
		char ch;
		int i = 0;
    
		System.out.println("Для остановки введите символ точки");
		
		do {
			ch = (char) System.in.read();
			
			if(ch == ' ') i++;
		} while (ch != '.');
		System.out.println("Пробелов: " + i);
	}
}