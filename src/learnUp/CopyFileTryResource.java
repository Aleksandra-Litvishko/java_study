package learnUp;

import java.io.*;

class CopyFileTryResource {
	public static void main(String args[]) {
		int i;
		
		try (FileInputStream fin = new FileInputStream("d:\\Java_Files\\bugss_for_contact_point.txt"); 
				FileOutputStream fout = new FileOutputStream("D:\\Java_Files\\copy_from_bugs_for_contact_point.txt")) {
			do {
				i = fin.read();
				if(i != -1) {
					fout.write(i);
				}
			}while(i != -1);
		}catch(IOException exc) {
			System.out.println("Возникла ошибка: " + exc);
			System.out.println(exc.getSuppressed());
		}
	}
}