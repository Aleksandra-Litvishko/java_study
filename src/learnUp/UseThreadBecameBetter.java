package learnUp;

class NewMyThread implements Runnable { // усовершенствованна€ верси€ UseThread
	Thread thr;
	String name; //  в этой переменной хранитс€ ссылка на поток
	
	NewMyThread(String name) {
		this.name = name;
		thr = new Thread(this, name); // им€ присваиваетс€ потоку при его создании
				thr.start(); // начало выполнени€ потока
	}
	
	public void run() {
		System.out.println(name + " - запуск");
		try {
			for(int count = 0;count < 10; count++) {
				Thread.sleep(400);
				System.out.println("¬ " + name + " , счЄтчик: " + count);
			}
		}catch(InterruptedException exc) {
			System.out.println(name + " прерван");
		}
		System.out.println(name + " - завершение");
	}
}
 class UseThreadBecameBetter {
	 public static void main(String args[]) {
		 NewMyThread nmt = new NewMyThread("Child#1");
		 
		 for(int i = 0; i < 50; i++ ) {
				System.out.print(".");
				try {
			Thread.sleep(100);
				} catch(InterruptedException exc) {
					System.out.println("ѕрерывание основного потока");
				}
			}
			System.out.println("«авершение основного потока");
		}
	 }