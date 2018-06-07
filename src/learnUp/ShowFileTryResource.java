package learnUp;

import java.io.*;

class ShowFileTryResource {
	public static void main(String args[]) {
		int i;

		try (FileInputStream fin = new FileInputStream("d:\\Java_Files\\bugs_for_contact_point.txt")) {
			do {
				i = fin.read();
				if (i != -1) {
					System.out.print((char) i);
				}
			} while (i != -1);
		} catch (FileNotFoundException exc) {
			System.out.println("Файл не найден");
		} catch (IOException exc) {
			System.out.println("Ошибка ввода-вывода");
		}
	}
}