package li.java.tasks.collections;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
	public static void main(String args[]) {
		//создание двухсторонней очереди
		ArrayDeque<String> ad = new ArrayDeque<>();
		
		//использование класса для организации стека
		ad.push("A");
		ad.push("B");
		ad.push("D");
		ad.push("E");
		ad.push("F");
		
		System.out.println("Извлечение из стека: ");
		while(ad.peek() != null) {
			System.out.print(ad.pop() + " ");
		}
	}
}
