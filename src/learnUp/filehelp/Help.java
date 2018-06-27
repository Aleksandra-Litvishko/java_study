package learnUp.filehelp;

import java.io.*;

class Help {
	String helpfile;

	Help(String fname) {
		helpfile = fname;
	}

	boolean Helpon(String what) {
		int ch;
		String topic, info;

		try (BufferedReader readed = new BufferedReader(new FileReader("D:\\helpfile.txt"))) {
			do {
				ch = readed.read();
				if (ch == '#') {
					topic = readed.readLine();
					if (what.compareTo(topic) == 0) {
						do {
							info = readed.readLine();
							if (info != null) {
								System.out.print(info + " ");
							}
						} while ((info != null) && info.compareTo("") != 0);
						return true;
					}
				}
			} while (ch != -1);
		} catch (IOException exc) {
			System.out.println("Возникла ошибка ввода-вывода" + exc);
			return false;
		}
		return false;
	}

	String getSelection() {
		String topic = "";

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Укажите тему: ");
			topic = br.readLine();
		} catch (IOException exc) {
			System.out.println("Ошибка при чтении с консоли");
		}
		return topic;
	}
}