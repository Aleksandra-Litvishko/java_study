package learnUp;

import java.io.*;

class CopyFile {
	public static void main(String args[]) {
		int i;
		boolean append = false;
		FileInputStream fin = null;
		FileOutputStream fout = null;

		try { 
			fin = new FileInputStream("d:\\Java_Files\\neww.txt"); // попытка открытия файлов
			fout = new FileOutputStream("d:\\Java_Files\\target_doc.txt", append); // попытка открытия файлов
 
			do { // копирование файла
				i = fin.read();

				if (i != -1) {
					fout.write(i);
				}
			} while (i != 0);
		} catch (FileNotFoundException exc) {
			System.out.println("Исходный или целевой файл не найден");
		} catch (IOException exc) {
			System.out.println("Возникла ошибка ввода-вывода");
		} finally {
			if (fin != null & fout != null) {
				try {
					fin.close();
					fout.close();
				} catch (IOException exc) {
					System.out.println("Возникла ошибка при закрытии входного/выходного файла");
				}
			}
		}
	}
}