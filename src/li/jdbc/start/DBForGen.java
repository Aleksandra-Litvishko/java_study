package li.jdbc.start;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DBForGen {
	public static void main(String args[]) {

		ArrayList<String> names = new ArrayList<>();
		String name;

		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Aleksandra_Litvishko\\files\\posts.txt"))) {
			while ((name = br.readLine()) != null){
				names.add(name);
			} 
		} catch (IOException exc) {
			exc.printStackTrace();
		}
		
			System.out.println(names.get(12));
			System.out.println();
			System.out.println(names.get(17));
			System.out.println();
			System.out.println(names.get(20));
	}
}