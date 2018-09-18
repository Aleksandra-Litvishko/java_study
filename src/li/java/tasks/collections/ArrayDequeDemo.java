package li.java.tasks.collections;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
	public static void main(String args[]) {
		//�������� ������������� �������
		ArrayDeque<String> ad = new ArrayDeque<>();
		
		//������������� ������ ��� ����������� �����
		ad.push("A");
		ad.push("B");
		ad.push("D");
		ad.push("E");
		ad.push("F");
		
		System.out.println("���������� �� �����: ");
		while(ad.peek() != null) {
			System.out.print(ad.pop() + " ");
		}
	}
}
