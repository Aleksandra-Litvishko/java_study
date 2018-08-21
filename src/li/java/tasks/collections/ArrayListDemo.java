package li.java.tasks.collections;

import java.util.*;

class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<>();
		
		System.out.println("��������� ������ �������: " + al.size());
		
		al.add("C");
		al.add("B");
		al.add("A");
		al.add("E");
		al.add("F");
		al.add("D");
		
		System.out.println("������ ���������� ������� ����� ����� ���������: " + al.size());
		System.out.println("���������� ���������� �������: " + al);
		
		al.remove(2);
		al.remove("F");
		
		System.out.println("������ ���������� ������� ����� �������� ���������: " + al.size());
		System.out.println("���������� ���������� �������: " + al);
	}
}