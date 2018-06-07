package learnUp;

import java.io.*;

class CopyFile {
	public static void main(String args[]) {
		int i;
		boolean append = false;
		FileInputStream fin = null;
		FileOutputStream fout = null;

		try { 
			fin = new FileInputStream("d:\\Java_Files\\neww.txt"); // ������� �������� ������
			fout = new FileOutputStream("d:\\Java_Files\\target_doc.txt", append); // ������� �������� ������
 
			do { // ����������� �����
				i = fin.read();

				if (i != -1) {
					fout.write(i);
				}
			} while (i != 0);
		} catch (FileNotFoundException exc) {
			System.out.println("�������� ��� ������� ���� �� ������");
		} catch (IOException exc) {
			System.out.println("�������� ������ �����-������");
		} finally {
			if (fin != null & fout != null) {
				try {
					fin.close();
					fout.close();
				} catch (IOException exc) {
					System.out.println("�������� ������ ��� �������� ��������/��������� �����");
				}
			}
		}
	}
}