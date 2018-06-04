package learnUp;

import java.io.*;

class ReadBytes { // чтение байтов с клавиатуры в массив
	public static void main(String args[]) throws IOException {
		byte data[] = new byte[10];

		System.out.println("Введите что-нибудь: ");
		
			System.in.read(data); // прочитать массив байтов, введённых с клавиатуры

			System.out.println("Вы ввели: ");

			for (int i = 0; i < data.length; i++) {
				System.out.print((char) data[i]);
			}
		}
	}
