package learnUp;

class MyThrd implements Runnable {
	Thread thr;
	boolean stopped, suspended;
	
	MyThrd(String name) {
		thr = new Thread(this, name);
	}
	
	public void run() {
		
	}
	
	synchronized void mystop() {
		stopped = true;
		suspended = false;
		notify();
	}
	synchronized void mysuspend() {
		suspended = true;
	}
	synchronized void myresume() {
		suspended = false;
		notify();
	}
	
}

class Suspend {
	public static void main(String args[]) {
		
	} 
}

