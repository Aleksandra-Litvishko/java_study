package li.java.tasks.collections;

import java.util.*;

public class MultifuncStringArray {
	List<String> words;

	public MultifuncStringArray(List<String> outWords) {
		words = outWords;
	}

	// найти слово с максимальным количеством повторяющихся символов
	public void FindWordWithMaxDiffSymbols() {
		int[] countOfRepetition = new int[words.size()];
		int counter;

		if (words.size() >= 1) {
			for (int i = 0; i < words.size(); i++) {
				counter = 1;
				for (int j = 0; j < words.get(i).length(); j++) {
					int len = words.get(i).length();
					String s = words.get(i).charAt(j) + "";
					int newlen = words.get(i).replaceAll(s, "").length();
					if ((len - newlen) > counter)
						counter = (len - newlen);
					if (j < words.get(i).length() - 1) {
						countOfRepetition[i] = counter;
					}
				}
			}
			int max;
			max = countOfRepetition[0];
			int maxIndex = 0;

			for (int i = 1; i < countOfRepetition.length; i++) {
				if (countOfRepetition[i] > max) {
					max = countOfRepetition[i];
					maxIndex = i;
				}
			}
			System.out.println("Слово с максимальным повторением символов: " + words.get(maxIndex)
					+ " Количество повторяющихся символов: " + max);
		} else {
			System.out.println(
					"Строка не содержит слов. Найти слово, в котором число различных символов минимально, невозможно");
		}
	}

	// найти слово, состоящее только из различных символов
	public void FindWordWithMinDiffSymbols() {
		int[] countOfRepetition = new int[words.size()];
		int counter;

		if (words.size() >= 1) {
			for (int i = 0; i < words.size(); i++) {
				counter = 1;
				for (int j = 0; j < words.get(i).length(); j++) {
					int len = words.get(i).length();
					String s = words.get(i).charAt(j) + "";
					int newlen = words.get(i).replaceAll(s, "").length();
					if ((len - newlen) > counter)
						counter = (len - newlen);
					if (j < words.get(i).length() - 1) {
						if (countOfRepetition[i] == 0)
							countOfRepetition[i] = 1;
						countOfRepetition[i] = counter;
					}
				}
			}

			for (int i = 0; i < countOfRepetition.length; i++) {
				if (countOfRepetition[i] == 0)
					countOfRepetition[i] = 1;
			}
			int min;
			min = countOfRepetition[0];
			int minIndex = 0;

			for (int i = 1; i < countOfRepetition.length; i++) {
				if (countOfRepetition[i] < min) {
					min = countOfRepetition[i];
					minIndex = i;
				}
			}
			System.out.println("Первое слово без повторения символов: " + words.get(minIndex));
		} else {
			System.out.println(
					"Строка не содержит слов. Найти слово, в котором число различных символов минимально, невозможно");
		}
	}

	// найти слово, состоящее только из цифр. Если их несколько, вернуть второе из
	// них
	public void FindSecondWordOnlyFromDigits() {
		if (words.size() >= 1) {
			for (int i = 0; i < words.size(); i++) {
				char [] digits =  
				for (int j = 0; j < words.get(i).length(); j++) {
					
				}
			}
		} else {
			System.out.println(
					"Срока не содержит слов. Найти слово, в котором число различных символов минимально, невозможно");
		}
	}
}