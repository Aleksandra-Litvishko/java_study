package learnUp;

import java.io.*;

class ReadBytes { // ������ ������ � ���������� � ������
	public static void main(String args[]) throws IOException {
		byte data[] = new byte[10];

		System.out.println("������� ���-������: ");

		System.in.read(data); // ��������� ������ ������, �������� � ����������

		System.out.println("�� �����: ");

		for (int i = 0; i < data.length; i++) {
			System.out.print((char) data[i]);
		}
	}
}