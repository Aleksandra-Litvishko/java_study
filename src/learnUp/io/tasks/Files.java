package learnUp.io.tasks;

import java.io.*;

class Files {
	public static void main(String args[]) {

		int a;
		FileInputStream infile;
		FileOutputStream tofile;

		if (args.length < 2) {
			System.out.println("������� ������ � �������: Files from_file to_file");
			return;
		}
		try {
			infile = new FileInputStream(args[0]);
			tofile = new FileOutputStream(args[1]);
			try {
					do {
						a = infile.read();
						if (a == ' ')tofile.write('-');
						else if(a!= -1) tofile.write(a);
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
			System.out.println(exc.getMessage());
			
		}
	}
}
