package li.java.patterns.Iterator;

import java.util.Iterator;

public class DinnerMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;

	public DinnerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("Vegetarian BLT","Bacon with lettuce & tomato and...", true, 2.99);
		addItem("BLT","Bacon with lettuce & tomato and...",false,2.99);
		addItem("Soup of the day","Soup with a side of potato salad",false,3.29);
		addItem("Hotdog","with relish,onions,tooped with cheese",false,305);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.out.println("Sorry, menu is full! Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
	
	public Iterator createIterator() {
		return (Iterator) new DinnerMenuIterator(menuItems);
	}
}
