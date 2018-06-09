package learnUp;

import java.io.*;

class RWData {
	public static void main(String args[]) {
		int i = 0;
		double d = 1023.56;
		boolean b = true;

		try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("D:\\Java_Files\\javaData.txt"))) {
			System.out.println("Записано: " + i);
			dataOut.writeInt(i);
			System.out.println("Записано: " + d);
			dataOut.writeDouble(d);
			System.out.println("Записано: " + b);
			dataOut.writeBoolean(b);
			System.out.println("Записано: " + b);
			dataOut.writeDouble(12.2 * 7.4);
		} catch (IOException exc) {
			System.out.println("Ошибка при записи");
		}

		try (DataInputStream dataIn = new DataInputStream(new FileInputStream("D:\\Java_Files\\javaData.txt"))) {
			i = dataIn.readInt();
			System.out.println("\nПрочитано: " + i);
			d = dataIn.readDouble();
			System.out.println("Прочитано: " + d);
			b = dataIn.readBoolean();
			System.out.println("Прочитано: " + b);
			d = dataIn.readDouble();
			System.out.println("Прочитано: " + d);
		} catch (IOException exc) {
			System.out.println("Ошибка при чтении");
		}
	}
}