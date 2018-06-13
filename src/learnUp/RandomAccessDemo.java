package learnUp;

import java.io.*;

class RandomAccessDemo {
	public static void main(String args[]) {
		double data[] = { 19.4, 10.1, 123.54, 33.0, 87.9, 74.25 };
		double d;

		try (RandomAccessFile raf = new RandomAccessFile("D:\\Java_Files.new.txt", "rw")) { // �������� ����� �
																							// ������������ ��������
			for (int i = 0; i < data.length; i++) {
				raf.writeDouble(data[i]);
			}

			raf.seek(0); // ��������� ��������� ����� � ������� ������ seek() (����� ������ �������� ����
							// double)
			d = raf.readDouble();
			System.out.println("������ ��������: " + d);

			raf.seek(8);
			d = raf.readDouble();
			System.out.println("������ ��������: " + d);

			raf.seek(8 * 3);
			d = raf.readDouble();
			System.out.println("�������� ��������: " + d);

			System.out.println();

			System.out.println("������ �������� � ��������� ����������� ��������: "); // ��������� �������� ����� ����

			for (int i = 0; i < data.length; i += 2) {
				raf.seek(8 * i);
				System.out.print(raf.readDouble() + " ");
			}
		} catch (IOException exc) {
			System.out.println("�������� ������ �����-������: " + exc);
		}
	}
}