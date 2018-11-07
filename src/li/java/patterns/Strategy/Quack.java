package li.java.patterns.Strategy;

public class Quack implements QuackBehavior { //реализация поведения уток, которые умеют крякать
	public void quack() {
		System.out.println("Quack");
	}
}
