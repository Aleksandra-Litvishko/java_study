package li.java.tasks.collections;

import java.util.*;

public class SpliteratorDemo {
	public static void main(String [] args) {
		ArrayList<Double> vals = new ArrayList<>();
		Double temp;
		
		vals.add(1.0);
		vals.add(2.0);
		vals.add(3.0);
		vals.add(4.0);
		vals.add(5.0);
		
		for(Double x:vals) {
			System.out.print(x + " ");
		}
		System.out.println();
		
//		System.out.println("Содержимое списочного массива vals:\n");
//		Spliterator<Double> splitr = vals.spliterator();
//		while(splitr.tryAdvance((n) -> System.out.println(n)));
//		System.out.println();
		
		for(int i = 1; i < vals.size()-1;i++) {
			vals.set(i, vals.get(i+1));
		}
		
		for(Double x:vals) {
			System.out.print(x + " ");
		}
	}
}