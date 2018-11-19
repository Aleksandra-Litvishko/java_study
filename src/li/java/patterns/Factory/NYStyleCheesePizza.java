package li.java.patterns.Factory;

public class NYStyleCheesePizza extends Pizza {
	NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}
}
