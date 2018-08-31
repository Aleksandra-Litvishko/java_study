package li.java.tasks.collections;

import java.io.FileInputStream;
import java.io.IOException;

public class Except {
	int a, b;

	public void exec() {
		FileInputStream fi = null;
		try {
			fi = new FileInputStream("Aleksandra Litvishko.newcopy.txt");
		} catch (IOException exc) {
			exc.printStackTrace();
		} finally {
			if (fi != null)
				try {
					fi.close();
				} catch (IOException exc) {
					exc.printStackTrace();
				}
		}
	}
}