package li.java.tasks.string;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class ExperienceWithString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a;
		String temp = "";

		a = scan.nextLine();
		scan.close();

//		for (int i = 0; i < a.length(); i++) {
//			if ((a.charAt(i) != ' ') & (a.charAt(i) != -1)) {
//				temp += a.charAt(i);
//			} else {
//				lines.add(temp);
//				temp = "";
//			}
//		}
		 List<String> lines = Arrays.asList(a.split(" "));
		 
		 System.out.println(lines);
	}
}