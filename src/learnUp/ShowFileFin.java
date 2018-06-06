package learnUp;

import java.io.*;

class ShowFileFin {
	public static void main(String args[]) {
		int i;
		FileInputStream fin = null;

		try {
			fin = new FileInputStream("d:\\Java_Files\\bugs_for_contact_point.txt");
			do {
				i = fin.read();
				if (i != -1) {
					System.out.print((char) i);
				}
			} while (i != -1);
		} catch (IOException exc) {
			System.out.println("Возникла ошибка ввода-вывода: " + exc);
		} finally {
			if (fin != null) {
				try {
					fin.close();
				} catch (IOException exc) {
					System.out.println("Возникла ошибка при закрытии файла.");
				}
			}
		}
	}
}