package learnUp.tasks;

import java.io.*;

class CompFiles {
	public static void main(String args[]) {
		int i, a;
		int counter = 0;

		try (FileInputStream f1 = new FileInputStream("D:\\Java_Files\\new.txt");
				FileInputStream f2 = new FileInputStream("D:\\Java_Files\\newcopy.txt")) {
			do {
				i = f1.read();
				a = f2.read();
				counter++;
				
				System.out.println("i: " + i + ", " + "a: " + a);

				if ((i != a) & (i != (a + 32)) & (i != (a - 32))) { 
					System.out.println("���������� ������ ����������, ������� � " + counter + " �������");
					break;
					
					//char b = Character.toLowerCase(a);
				} 
				if(i == -1) {
					System.out.println("���������� ������ ���������");
				}
			} while (i != -1 && a != -1);
		} catch (FileNotFoundException exc) {
			System.out.println("���� �� ������ �� ������");
		} catch (IOException exc) {
			System.out.println("��������� ������ �����-������");
		}
	}
}