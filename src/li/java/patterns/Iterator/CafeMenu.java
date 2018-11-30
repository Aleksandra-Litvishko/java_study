package li.java.patterns.Iterator;

import java.util.Iterator;
import java.util.Hashtable;

public class CafeMenu implements Menu {
	Hashtable menuItems;
	
	CafeMenu() {
		menuItems = new Hashtable();
		
		addItem("Vegetarian BLT","Bacon with lettuce & tomato and...", true, 2.99);
		addItem("BLT","Bacon with lettuce & tomato and...",false,2.99);
		addItem("Soup of the day","Soup with a side of potato salad",false,3.29);
		addItem("Hotdog","with relish,onions,tooped with cheese",false,305);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem =new MenuItem(name,description,vegetarian,price);
		menuItems.put(menuItem.getName(),menuItem);
	}
	
	public Iterator createIterator() {
		return menuItems.values().iterator();
	}
}
