package learnUp.io.tasks;

import java.io.*;

class FilesWithSymbols {
	private String from, to;

	FilesWithSymbols(String from, String to) {
		this.from = from;
		this.to = to;
	}

	boolean Copy() {
		int a;
		try (FileReader infile = new FileReader(from); FileWriter tofile = new FileWriter(to)) {
				do {
					a = infile.read();
					if (a == ' ') a = '-';
					if (a == -1) tofile.write(a);
				} while (a != -1);
			return true;
		} catch (IOException exc) {
			System.out.println("Возникла ошибка ввода-вывода");
			return false;
		}
	}
}