package li.java.patterns.Strategy;

public class Squeak implements QuackBehavior { //реализация поведения уток, которые умеют пищать
	public void quack() {
		System.out.println("Squeak");
	}
}
