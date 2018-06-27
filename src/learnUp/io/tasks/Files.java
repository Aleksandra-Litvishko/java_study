package learnUp.io.tasks; //копирование текстового файла с заменой пробелов дефисами. Используются байтовые потоки.

import java.io.*;

// Для того, чтобы воспользоваться программой, необходимо указать в командной строке имена исходного и целевого файлов. Например, java Files file1 file2
class Files {
	public static void main(String args[]) {

		if (args.length != 2) {
			System.out.println("Использование: FIles откуда куда");
		}
			int a;
			try {
				FileInputStream infile = new FileInputStream(args[0]);
				FileOutputStream tofile = new FileOutputStream(args[1]);
				try {
					do {
						a = infile.read();
						if (a == ' ')
							a = '-';
						if (a != -1)
							tofile.write(a);
					} while (a != -1);
				} catch (IOException exc) {
					System.out.println("Возникла ошибка ввода-вывода");
				} finally {
					try {
						if (infile != null)
							infile.close();
						if (tofile != null)
							tofile.close();
					} catch (IOException exc) {
						System.out.println("Возникла ошибка при закрытии файла");
					}
				}
			} catch (FileNotFoundException exc) {
				System.out.println("Файл не найден");
		}
	}
}
