package learnUp;

import java.io.*;

class ReadLines { // чтение символьных строк с консоли с использованием класса BufferedReader
	public static void main(String args[]) throws IOException { 
		String st;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("¬водите текстовые строки. ќстановить ввод - строка \"stop\"");
		do {
			st = br.readLine(); // чтение текстово строки с помощью ReadLine()
			System.out.println(st);
		} while (! st.equals("stop"));
	}
}