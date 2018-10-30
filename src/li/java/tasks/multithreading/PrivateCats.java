package li.java.tasks.multithreading;

import java.util.concurrent.Semaphore;

class Cat extends Thread {
	Semaphore sem;
	int id;
	int num = 0;

	public Cat(Semaphore sem, int id) {
		this.sem = sem;
		this.id = id;
		start();
	}

	public void run() {
		try {
			while (num < 3) {
				sem.acquire();

				System.out.println("Кот или кошечка " + id + " гуляет на крыше");
				sleep(500);
				num++;
				
				System.out.println("Кот или кошечка " + id + "ушёл(ла)");
				sem.release();
				sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class PrivateCats {
	public static void main(String args[]) {
		Semaphore sem = new Semaphore(2);
		
		Cat cat1 = new Cat(sem, 1);
		Cat cat2 = new Cat(sem, 2);
		Cat cat3 = new Cat(sem, 3);
	}
}
