package li.java.tasks.collections;

import java.util.ArrayList;

public class MultifuncStringArray {
	ArrayList<String> words;
	
	public MultifuncStringArray(ArrayList<String> outWords) {
		words = outWords;
	}
	
	public void FindWordWithDifferentSymbols() {
		if(words.size() > 1) {
			int [] counter = new int[words.size()];
		for(int i = 0; i < words.size(); i++) {
		}
		} else {
			System.out.println("В строке менее одного слова. Найти слово, в котором число различных символов минимально, невозможно");
		}
	}
}