package li.java.patterns.Factory;

public abstract class PizzaStore {
	
	public abstract Pizza createPizza(String t);
	
	public Pizza orderPizza(String type) { // метод обращается к фабрике с запросом на создание объекта
		Pizza pizza;
		
		pizza = createPizza(type); //вызов оператора new заменяется вызовом метода create объекта фабрики
		 
		 pizza.prepare();
		 pizza.bake();
		 pizza.cut();
		 pizza.box();
		 
		return pizza;
	}
}