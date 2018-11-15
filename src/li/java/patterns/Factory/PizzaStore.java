package li.java.patterns.Factory;

public abstract class PizzaStore {
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type) { // метод обращается к фабрике с запросом на создание объекта
		Pizza pizza;
		
		pizza = factory.createPizza(type); //вызов оператора new заменяется вызовом метода create объекта фабрики
		 
		 pizza.prepare();
		 pizza.bake();
		 pizza.cut();
		 pizza.box();
		 
		return pizza;
	}
	
	abstract Pizza createPizza(String type);
}
