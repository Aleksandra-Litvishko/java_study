package learnUp.tasks;

import Queues.*;

class IQDemo {
	public static void main(String args[]) {
		FixedQueue q1 = new FixedQueue(10);
		CircularQueue q4 = new CircularQueue(10);
		DynQueue q2 = new DynQueue(5);
		CircularQueue q3 = new CircularQueue(10);
		
		ICharQ iQ;
		
		char ch;
		iQ = q1;
		
		for(int i = 0; i < 10; i++) {
			iQ.put((char) ('A' + i));
		}
		
		System.out.println("C��������� ������������� ������� q1: ");
		for(int i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		
		System.out.println();
		
		iQ = q4;
		
		System.out.println("C��������� �������� ������� q4: ");
		for(int i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		System.out.println();
		
		Queue.copyTo(q1, q4);
		
		iQ = q1;
		
		System.out.println("C��������� ������������� ������� q1: ");
		for(int i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		System.out.println();
		
		iQ = q4;
		
		System.out.println("C��������� �������� ������� q4: ");
		for(int i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		
		System.out.println();
		
		iQ = q2;
		for(int i = 0; i < 10; i++) {
			iQ.put((char) ('Z' - i));
		}
		
		System.out.println("C��������� ������������ �������: ");
		for(int i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		
		System.out.println();
		
		iQ = q3;
		for(int i = 0; i < 10; i++) {
			iQ.put((char) ('A' + i));
		}
		
		System.out.println("C��������� ��������� �������: ");
		for(int i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		
		System.out.println();
		
		// ��������� ������ �������� � ��������� �������
		for(int i = 10; i < 20; i++)  {
			iQ.put((char) ('A' + i));
		}
		
		System.out.println("C��������� ��������� �������: ");
		for(int i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		
		System.out.println("\n���������� � ������������� ������" + " ��������� �������: ");
		for(int i = 0; i < 20; i++)  {
			iQ.put((char) ('A' + i));
			ch = iQ.get();
			System.out.print(ch);
		}
	}
}