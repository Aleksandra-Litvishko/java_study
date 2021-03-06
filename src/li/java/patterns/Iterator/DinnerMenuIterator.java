package li.java.patterns.Iterator;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator {
	MenuItem[] items;
	int position = 0;

	public DinnerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	public Object next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}

	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else
			return true;
	}

	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException("You can't remove an item you've done at least one next()");
		}
		if (items[position - 1] != null) {
			for (int i = position - 1; i < (items.length - 1); i++) {
				items[position] = items[position + 1];
			}
			items[items.length - 1] = null;
		}
	}
}
