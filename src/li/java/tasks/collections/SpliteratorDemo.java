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
		
		//������� ����� tryAdvance() ��� ������ ����������� ���������� �������
		Spliterator<Double> spltitr = al.spliterator();
		
		System.out.println("���������� ���������� �������: ");
		while(spltitr.tryAdvance((n) -> System.out.println(n))) {
			System.out.println();
		}
		
		//������� ����� ��������� ������, ���������� ���������� �����
		//�������� �������� �� ���������� ������� al
		spltitr = al.spliterator();
		
		ArrayList<Double> sqrs = new ArrayList<>();
		while(spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));
		
		System.out.println("���������� ���������� ������� sqrs:\n");
		spltitr = sqrs.spliterator();
		spltitr.forEachRemaining((n) -> System.out.println(n));
		System.out.println();
	}
}
