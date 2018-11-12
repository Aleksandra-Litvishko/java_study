package li.java.patterns.Decorator;

public class Soy extends CondimentDecorator {
	Beverage beverage;
	
	public Soy(Beverage bev) {
		beverage = bev;
	}
	
	public String getDescription() {
		return beverage.getDescription() + " , Soy";
	}
	
	public double cost() {
		return beverage.cost() + 0.15;
	}
}
