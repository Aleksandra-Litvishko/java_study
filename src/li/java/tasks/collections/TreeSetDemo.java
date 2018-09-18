package li.java.tasks.collections;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String args[]) {
		//создать древововидное множество типа TreeSet
		TreeSet<String> ts = new TreeSet<>();
		
		//ввести элементы в древовидное множество типа TreeSet
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		
		System.out.println(ts);
		//treeSet реализует I NavigableSet, т.о. в нём доступны методы из I NavigableSet
		System.out.println(ts.subSet("B", "F"));
	}
}
