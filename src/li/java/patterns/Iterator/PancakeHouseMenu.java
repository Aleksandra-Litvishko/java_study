package li.java.patterns.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
	ArrayList menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList();
		
		addItem("K&B Pancake Breakfast","pancakes with eggs...",true,2.99);
		addItem("Regular Pancake Breakfast","pancakes with fried eggs,sausage",true,2.99);
		addItem("Blueberry Pancakes","pancakes made with fresh blueberries",true,3.49);
		addItem("Waffles","+ blueberries or strawberries",true,3.59);
	}
	
	public void addItem(String name,String description,boolean vegetarian,double price) {
		MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
		menuItems.add(menuItem);
	}
	
	public Iterator createIterator() {
		return (Iterator) menuItems.iterator();
	}
}
