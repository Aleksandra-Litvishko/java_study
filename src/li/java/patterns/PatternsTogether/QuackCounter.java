package li.java.patterns.PatternsTogether;

public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuack = 0;
	
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
	
	public void quack() {
		duck.quack();
		numberOfQuack++;
	}
	
	public static int getQuacks() {
		return numberOfQuack;
	}
}
