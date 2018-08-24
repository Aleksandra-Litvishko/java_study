package li.java.tasks.collections;

import java.util.*;

public class SpliteratorDemo {
	public static void main(String [] args) {
		ArrayList<Double> vals = new ArrayList<>();
		
		vals.add(1.0);
		vals.add(2.0);
		vals.add(3.0);
		vals.add(4.0);
		vals.add(5.0);
		
		System.out.println("Содержимое списочного массива vals:\n");
		Spliterator<Double> splitr = vals.spliterator();
		while(splitr.tryAdvance((n) -> System.out.println(n)));
		System.out.println();
	}
}