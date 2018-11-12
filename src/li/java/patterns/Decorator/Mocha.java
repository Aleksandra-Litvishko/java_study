package li.java.patterns.Decorator;

public class Mocha extends CondimentDecorator {
	Beverage beverage;
	
	public Mocha(Beverage bev) {
		beverage = bev;
	}
	
	public String getDescription() {
		return beverage.getDescription() + " , Mocha";
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}
}
