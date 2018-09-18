package li.java.tasks.collections;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
	public static void main(String args[]) {
		ArrayList<Double> al = new ArrayList<>();
		
		al.add(1.0);
		al.add(2.0);
		al.add(3.0);
		al.add(4.0);
		al.add(5.0);
		al.add(6.0);
		
		//вызвать метод tryAdvance() для вывода содержимого списочного массива
		Spliterator<Double> spltitr = al.spliterator();
		
		System.out.println("Содержимое списочного массива: ");
		while(spltitr.tryAdvance((n) -> System.out.println(n))) {
			System.out.println();
		}
		
		//создать новый списочный массив, содержащий квадратные корни
		//числовых значений из списочного массива al
		spltitr = al.spliterator();
		
		ArrayList<Double> sqrs = new ArrayList<>();
		while(spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));
		
		System.out.println("Содержимое списочного массива sqrs:\n");
		spltitr = sqrs.spliterator();
		spltitr.forEachRemaining((n) -> System.out.println(n));
		System.out.println();
	}
}
