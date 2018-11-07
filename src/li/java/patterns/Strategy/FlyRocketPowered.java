package li.java.patterns.Strategy;

public class FlyRocketPowered implements FlyBehavior { //определяет поведение уток, летающих на ракете
	public void fly() {
		System.out.println("I'm flying with a rocket!");
	}
}