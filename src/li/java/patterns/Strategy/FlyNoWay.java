package li.java.patterns.Strategy;

public class FlyNoWay implements FlyBehavior { //реализация уток, которые не умеют летать
	public void fly() {
		System.out.println("I can't fly");
	}
}
