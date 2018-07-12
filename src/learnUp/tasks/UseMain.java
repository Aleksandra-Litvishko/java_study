package learnUp.tasks;

class UseMain  { // управление основным потоком
	public static void main(String args[]) {
		Thread thr;
		
		thr = Thread.currentThread(); // получить основной поток
		
		System.out.println("Имя основного потока: " + thr.getName()); // отобразить имя основного потока
		System.out.println("Приоритет основного потока: " + thr.getPriority()); // отобразить приоритет основного потока
		System.out.println();
		
		System.out.println("Установка имени и приоритета основного потока"); //установить имя и приоритет основного потока
		thr.setName("Thread #1");
		thr.setPriority(Thread.NORM_PRIORITY + 3);
		System.out.println();
		
		System.out.println("Новое имя основного потока: " + thr.getName());
		System.out.println("Новый приоритет основного потока: " + thr.getPriority());
	}
}