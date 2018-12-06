package li.java.patterns.PatternsTogether;

public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuack = 0;
	Observable observable;
	
	public QuackCounter(Quackable duck) {
		this.duck = duck;
		observable = new Observable(this);
	}
	
	public void quack() {
		duck.quack();
		notifyObservers();
		numberOfQuack++;
	}
	
	public static int getQuacks() {
		return numberOfQuack;
	}
	
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);	
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}
}
