package learnUp;

class JoinThreads {
	public static void main(String args[]) {
		MyStThread child1 = new MyStThread("Child№1");
		MyStThread child2 = new MyStThread("Child№2");
		MyStThread child3 = new MyStThread("Child№3");
		
		try {
		child1.thr.join(); // ожидание до тех пор, пока указанный метод не завершится
		child2.thr.join(); // ожидание до тех пор, пока указанный метод не завершится
		child3.thr.join(); // ожидание до тех пор, пока указанный метод не завершится
		} catch (InterruptedException exc) {
			System.out.println("Прерывание основного потока");
		}
			System.out.println("Завершение основного потока");
	}
}