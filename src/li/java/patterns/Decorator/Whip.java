package li.java.patterns.Decorator;

public class Whip extends CondimentDecorator {
	Beverage beverage;
	
	public Whip(Beverage bev) {
		beverage = bev;
	}
	
	public String getDescription() {
		return beverage.getDescription() + " , Whip";
	} 
	
	public double cost() {
		return beverage.cost() + 0.1;
	}
}
