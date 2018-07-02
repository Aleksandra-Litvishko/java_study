package learnUp;

import java.io.*;

public class Ktod { // простая утилита для ввода данных с клавиатуры и записи их на диск
	public static void main(String args[]) {

		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Признак конца ввода - строка \"стоп\"");

		try (FileWriter fw = new FileWriter("D:\\test.txt")) { // создание объекта FileWriter
			do {
				System.out.print(": ");
				str = br.readLine();

				if (str.compareTo("stop") == 0)
					break;

				str = str + "\r\n";
				fw.write(str); // запись текстовых строк в файл
			} while (str.compareTo("stop") == 0);
		} catch (IOException exc) {
			System.out.println("Возникла ошибка ввода-вывода: " + exc);
		}
	}
}