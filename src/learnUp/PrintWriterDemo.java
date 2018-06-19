package learnUp;

import java.io.*;

public class PrintWriterDemo { // Использование класса PrintWriter
	public static void main(String args[]) {
		PrintWriter pw = new PrintWriter(System.out, true); // создание объекта типа PrintWriter, связанного с потоком System.out

		int i = 17;
		double d = 19.78;

		pw.println(i);
		pw.println(d);
		pw.println(i + " " + d + " = " + (i + d));
	}
}