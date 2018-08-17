package li.java.tasks.collections;

import java.util.*;

public class ApplesAndOrangesWithGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {

		ArrayList<Apple> apples = new ArrayList<>();

		for (int i = 0; i < 3; i++) apples.add(new Apple());
		//apples.add(new Orange()); ошибка компиляции
		for(Apple c: apples) System.out.println(c);
	}
}