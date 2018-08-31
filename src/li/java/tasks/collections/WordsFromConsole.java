package li.java.tasks.collections;

import java.util.*;

public class WordsFromConsole {
	public static void main(String[] args) {
		String line;
		Scanner scan = new Scanner(System.in);

		line = scan.nextLine();
		List<String> words = Arrays.asList(line.split(" "));
		
		MultifuncStringArray ms = new MultifuncStringArray(words);
		ms.FindWordWithMaxDiffSymbols();
		ms.FindWordWithMinDiffSymbols();
	}
}