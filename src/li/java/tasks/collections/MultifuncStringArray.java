package li.java.tasks.collections;

import java.util.*;

public class MultifuncStringArray {
	List<String> words;

	public MultifuncStringArray(List<String> outWords) {
		words = outWords;
	}

	//найти слово с максимальным количеством повторяющихся символов
	public void FindWordWithMaxDiffSymbols() {
		int[] countOfRepetition = new int[words.size()];
		int counter;

		if (words.size() >= 1) {
			for(int i = 0; i < words.size(); i++) {
				counter = 0;
				for(int j = 0; j < words.get(i).length(); j++) {
					int len = words.get(i).length();
					String s = words.get(i).charAt(j) + "";
			        int newlen = words.get(i).replaceAll(s, "").length();
			        if((len - newlen) > counter) counter = (len - newlen);
			        if(j < words.get(i).length()-1) {
			        	countOfRepetition[i] = counter;
			        }
				}
			}
			int min;
			int max;
			min = max = countOfRepetition[0];
			int minIndex;
			int maxIndex;
			minIndex = maxIndex = 0;

			for (int i = 1; i < countOfRepetition.length; i++) {
				if (countOfRepetition[i] < min) {
					min = countOfRepetition[i];
					minIndex = i;
				}
				if (countOfRepetition[i] > max) {
					max = countOfRepetition[i];
					maxIndex = i;
				}
			}
			System.out.println("Слово с максимальным повторением символов: " + words.get(maxIndex) + " Количество повторяющихся символов: " + max);
		} else {
			System.out.println(
					"В строке менее одного слова. Найти слово, в котором число различных символов минимально, невозможно");
		}
	}
}