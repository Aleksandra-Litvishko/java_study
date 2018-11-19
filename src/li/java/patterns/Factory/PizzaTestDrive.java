package li.java.patterns.Factory;

public class PizzaTestDrive {
	public static void main(String args[]) {
		PizzaStore nystore = new NYStylePizzaStore();
		PizzaStore chicagoStore = new ChicagoStylePizzaStore();
		
		Pizza pizza = nystore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}
}
