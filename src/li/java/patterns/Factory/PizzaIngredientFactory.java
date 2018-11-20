package li.java.patterns.Factory;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggie();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
