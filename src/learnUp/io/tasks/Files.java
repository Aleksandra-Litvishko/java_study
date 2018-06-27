package learnUp.io.tasks; //����������� ���������� ����� � ������� �������� ��������. ������������ �������� ������.

import java.io.*;

// ��� ����, ����� ��������������� ����������, ���������� ������� � ��������� ������ ����� ��������� � �������� ������. ��������, java Files file1 file2
class Files {
	public static void main(String args[]) {

		if (args.length != 2) {
			System.out.println("�������������: FIles ������ ����");
		}
			int a;
			try {
				FileInputStream infile = new FileInputStream(args[0]);
				FileOutputStream tofile = new FileOutputStream(args[1]);
				try {
					do {
						a = infile.read();
						if (a == ' ')
							a = '-';
						if (a != -1)
							tofile.write(a);
					} while (a != -1);
				} catch (IOException exc) {
					System.out.println("�������� ������ �����-������");
				} finally {
					try {
						if (infile != null)
							infile.close();
						if (tofile != null)
							tofile.close();
					} catch (IOException exc) {
						System.out.println("�������� ������ ��� �������� �����");
					}
				}
			} catch (FileNotFoundException exc) {
				System.out.println("���� �� ������");
		}
	}
}
