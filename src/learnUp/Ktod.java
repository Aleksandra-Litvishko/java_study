package learnUp;

import java.io.*;

public class Ktod { // ������� ������� ��� ����� ������ � ���������� � ������ �� �� ����
	public static void main(String args[]) {

		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("������� ����� ����� - ������ \"����\"");

		try (FileWriter fw = new FileWriter("D:\\test.txt")) { // �������� ������� FileWriter
			do {
				System.out.print(": ");
				str = br.readLine();

				if (str.compareTo("stop") == 0)
					break;

				str = str + "\r\n";
				fw.write(str); // ������ ��������� ����� � ����
			} while (str.compareTo("stop") == 0);
		} catch (IOException exc) {
			System.out.println("�������� ������ �����-������: " + exc);
		}
	}
}