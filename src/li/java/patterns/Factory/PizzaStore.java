package li.java.patterns.Factory;

public abstract class PizzaStore {
	
	public abstract Pizza createPizza(String t);
	
	public Pizza orderPizza(String type) { // ����� ���������� � ������� � �������� �� �������� �������
		Pizza pizza;
		
		pizza = createPizza(type); //����� ��������� new ���������� ������� ������ create ������� �������
		 
		 pizza.prepare();
		 pizza.bake();
		 pizza.cut();
		 pizza.box();
		 
		return pizza;
	}
}