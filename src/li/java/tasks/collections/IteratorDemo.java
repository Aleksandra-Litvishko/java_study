package li.java.tasks.collections;

import java.util.*;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();

		al.add("F");
		al.add("B");
		al.add("D");
		al.add("E");
		al.add("C");
		al.add("Z");
		al.add("A");
		al.add("G");

		System.out.print("Исходное содержимое списочного массива al: ");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();

		// изменить перебираемые элементы
		ListIterator<String> litr = al.listIterator();
		while (litr.hasNext()) {
			String element = litr.next();
			litr.set(element + "+");
		}

		System.out.print("Изменённый список: ");
		itr = al.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();

		System.out.print("Изменённый в обратном порядке список: ");
		while (litr.hasPrevious()) {
			String element = litr.previous();
			System.out.print(element + " ");
		}
	}
}