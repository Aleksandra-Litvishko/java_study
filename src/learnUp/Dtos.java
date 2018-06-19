package learnUp;

import java.io.*;

public class Dtos { // простая утилита для чтения данных с диска и вывода их на экран (используя
					// символьные потоки (в т.ч. PrintReader)
	public static void main(String args[]) {
		String str;

		try (BufferedReader br = new BufferedReader(new FileReader("C:\\test.txt"))) {

			while ((str = br.readLine()) != null) {
				System.out.print(str + " ");
			}
		} catch (IOException exc) {
			System.out.println("Возникла ошибка ввода-вывода: " + exc);
		}
	}
}