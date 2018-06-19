package learnUp;

import java.io.*;

class SymbolsStreamForConsoleInput { // использование класса BufferedReader для чтения данных с консоли
	public static void main(String args[]) throws IOException {
		char data[] = new char[10];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Введите символы. Окончание ввода - символ точки");
		
		br.read(data);
		
		for(char i: data) {
		System.out.println(i);
		}
	}
}