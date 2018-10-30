package li.java.tasks.multithreading;

import java.util.concurrent.Semaphore;
 
public class SimpleSemaphore {
 
    public static void main(String[] args) {
         
    	Semaphore sem = new Semaphore(1);
        CommonResource res = new CommonResource();
        new Thread(new CountThread(sem, res, "CountThread 1")).start();
        new Thread(new CountThread(sem, res, "CountThread 2")).start();
        new Thread(new CountThread(sem ,res, "CountThread 3")).start();
    }
}
class CommonResource{
     
    int x=0;  
}
 
class CountThread implements Runnable{
 
	CommonResource res;
    Semaphore sem;
    String name;
    CountThread(Semaphore sem, CommonResource res, String name){
    	this.sem = sem;
    	this.res = res;
        this.name=name;
    }
      
    public void run(){
         
        try{
        	System.out.println("Поток " + name + " ожидает разрешение");
        	sem.acquire();
            res.x=1;
            for (int i = 1; i < 5; i++){
                System.out.println(this.name + ": " + res.x);
                res.x++;
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){System.out.println(e.getMessage());}
        System.out.println("Поток " + name + " освобождает разрешение");
        sem.release();
    }
}