package learnUp;

import java.io.*;

class SymbolsStreamForConsoleInput { // ������������� ������ BufferedReader ��� ������ ������ � �������
	public static void main(String args[]) throws IOException {
		char data[] = new char[10];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("������� �������. ��������� ����� - ������ �����");
		
		br.read(data);
		
		for(char i: data) {
		System.out.println(i);
		}
	}
}