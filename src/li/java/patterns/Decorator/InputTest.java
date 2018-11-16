package li.java.patterns.Decorator;
import java.io.*;

public class InputTest {
	public static void main(String args[]) {
		int c;
		try {
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\Aleksandra_Litvishko\\Courses\\Java_Files\\test.txt")));
			//объект FileInputStream декорируется сначала декоратором BufferedInputStream, затем LowerCaseInputStream
			while((c=in.read()) >= 0) {
				System.out.print((char) c);
			}
			in.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
