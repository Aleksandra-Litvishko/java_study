package li.java.patterns.Strategy;

public class MuteQuack implements QuackBehavior { //реализация поведения уток, которые не издают звуков
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
