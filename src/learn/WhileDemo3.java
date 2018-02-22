package learn;

class WhileDemo3 {
	public static void main(String args[]) 
	throws java.io.IOException {
		while((char) System.in.read() != 's')
			System.out.println("Я не остановлюсь, пока ты не нажмёшь кое-что!");
	}
}