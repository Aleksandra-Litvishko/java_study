package learnUp;

import java.io.*;

class ShowFile { // отображение текстового файла;
	public static void main(String args[]) {
		int i;
		FileInputStream fin;

		try {
			fin = new FileInputStream("d:\\Java_Files\\bugs_for_contact_point.txt"); //
		} catch (FileNotFoundException exc) {
			System.out.println("Файл не найден");
			return;
		}

		try {
			do {
				i = fin.read();
				if (i != -1)
					System.out.print((char) i);
			} while (i != -1);
		} catch (IOException exc) {
			System.out.println("Ошибка при чтении файла");
		}

		try {
			fin.close();
		} catch (IOException exc) {
			System.out.println("Ошибка при закрытии файла");
		}
	}
}