package learnUp.io.tasks;

import java.io.*;

class Files {

	String from, to;

	Files(String from, String to) {
		this.from = from;
		this.to = to;
	}
	
	boolean Copy() {
		int a;
		FileInputStream infile = null; 
		FileOutputStream tofile = null; 
		try {
			infile = new FileInputStream(from);
			tofile = new FileOutputStream(to);

			if (infile.read() != -1)
				do {
					a = infile.read();
					if (a == ' ')
						tofile.write('-');
					tofile.write(a);
				} while (a != -1);
			else
				return false;
			return true;
		} catch (FileNotFoundException exc) {
			System.out.println("Файл не найден");
			return false;
		} catch (IOException exc) {
			System.out.println("Возникла ошибка ввода-вывода");
			return false;
		} finally {
			try {
				if (infile != null)
					infile.close();
				if (tofile != null)
					tofile.close();
			} catch (IOException exc) {
				System.out.println("Возникла ошибка при закрытии файла");
				return false;
			}
		}
	}
}