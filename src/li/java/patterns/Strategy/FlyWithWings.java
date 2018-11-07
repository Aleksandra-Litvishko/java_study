package li.java.patterns.Strategy;

public class FlyWithWings implements FlyBehavior { //реализация поведения уток, которые умеют летать 
	public void fly() {
		System.out.println("I'm flying!");
	}
}
