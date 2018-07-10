package learnUp;

class MyThrd implements Runnable {
	Thread thr;
	boolean stopped; // останавливает поток при значении false
	boolean suspended; // приостанавливает поток при значении true
	
	MyThrd(String name) {
		thr = new Thread(this, name);
		suspended = false;
		stopped = false;
		thr.start();
	}
	
	public void run() {
		System.out.println(thr.getName() + " - запуск");
		try {
			for(int i = 1; i < 1000; i++) {
				System.out.print(i + " ");
				if((i%10) == 0) {
					System.out.println();
					Thread.sleep(250);
				}
				
				synchronized(this) { // этот синхронизированный блок примен€етс€ дл€ тестировани€ переменных suspended и stopped
					while(suspended) {
						wait();
					}
					if(stopped) break;
				}
						}
		} catch(InterruptedException exc) {
			System.out.println(thr.getName() + " - прерван");
		}
		System.out.println(thr.getName() + " - выход");
	} 

	synchronized void mystop() { //полна€ остановка приостановленного потока
		stopped = true;
		suspended = false;
		notify();
	}
	synchronized void mysuspend() { //приостановить поток
		suspended = true;
	}
	synchronized void myresume() { //возобновить поток
		suspended = false;
		notify();
	}
}

class Suspend {
	public static void main(String args[]) {
		MyThrd ob1 = new MyThrd("Child#1");
		
		try {
			Thread.sleep(1000); // чтобы поток ob1 начал своЄ выполнение
			
			ob1.mysuspend();
			System.out.println("ѕриостановка потока");
			Thread.sleep(1000);
			
			ob1.myresume();
			System.out.println("¬озобновление потока");
			Thread.sleep(1000);
			
			ob1.mysuspend();
			System.out.println("ѕриостановка потока");
			Thread.sleep(1000);
			
			ob1.myresume();
			System.out.println("¬озобновление потока");
			Thread.sleep(1000);
			
			ob1.mystop();
			System.out.println("ќстановка потока");
			
		} catch(InterruptedException exc) {
			exc.printStackTrace();
		}
		
		try {
			ob1.thr.join();
		}catch(InterruptedException exc) {
			exc.printStackTrace();
			System.out.println("ѕрерывание основного потока");
		}
		
		System.out.println("«авершение основного потока");
	} 
}

