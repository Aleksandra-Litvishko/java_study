package learnUp;

import java.io.*;

class ReadLines { // ������ ���������� ����� � ������� � �������������� ������ BufferedReader
	public static void main(String args[]) throws IOException { 
		String st;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("������� ��������� ������. ���������� ���� - ������ \"stop\"");
		do {
			st = br.readLine(); // ������ �������� ������ � ������� ReadLine()
			System.out.println(st);
		} while (! st.equals("stop"));
	}
}