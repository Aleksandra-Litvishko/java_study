package li.java.patterns.Factory;

public abstract class PizzaStore {
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type) { // ����� ���������� � ������� � �������� �� �������� �������
		Pizza pizza;
		
		pizza = factory.createPizza(type); //����� ��������� new ���������� ������� ������ create ������� �������
		 
		 pizza.prepare();
		 pizza.bake();
		 pizza.cut();
		 pizza.box();
		 
		return pizza;
	}
	
	abstract Pizza createPizza(String type);
}
