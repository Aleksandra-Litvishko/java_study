package li.java.tasks.collections;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String args[]) {
		//������� ������������� ��������� ���� TreeSet
		TreeSet<String> ts = new TreeSet<>();
		
		//������ �������� � ����������� ��������� ���� TreeSet
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		
		System.out.println(ts);
		//treeSet ��������� I NavigableSet, �.�. � �� �������� ������ �� I NavigableSet
		System.out.println(ts.subSet("B", "F"));
	}
}
