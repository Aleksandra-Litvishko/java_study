package li.java.tasks.collections;

import java.util.*;

public class MultifuncStringArray {
	List<String> words;

	public MultifuncStringArray(List<String> outWords) {
		words = outWords;
	}

	// ����� ����� � ������������ ����������� ������������� ��������
	public void FindWordWithMaxDiffSymbols() {
		int countOfWords = words.size();
		int[] countOfRepetition = new int[countOfWords];
		
		if (countOfWords >= 1) {
			// �����
			for (int i = 0; i < countOfWords; i++) {

				String word = words.get(i);
				int counter = 1;
				int len = word.length();
				
				for (int j = 0; j < len; j++) {
					
					String s = Character.toString(word.charAt(j));
					int newlen = word.replaceAll(s, "").length();
					
					if ((len - newlen) > counter) {
						counter = (len - newlen);
					}
					
					if (j < len - 1) {
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
			System.out.println("����� � ������������ ����������� ��������: " + words.get(maxIndex)
					+ " ���������� ������������� ��������: " + max);
		} else {
			System.out.println(
					"������ �� �������� ����. ����� �����, � ������� ����� ��������� �������� ����������, ����������");
		}
	}

	// ����� �����, ��������� ������ �� ��������� ��������
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
			if (min > 1)
				System.out.println("����� ��� ���������� �������� �����������");
			else
				System.out.println("������ ����� ��� ���������� ��������: " + words.get(minIndex));
		} else {
			System.out.println(
					"������ �� �������� ����. ����� �����, � ������� ����� ��������� �������� ����������, ����������");
		}
	}

	// ����� �����, ��������� ������ �� ����. ���� �� ���������, ������� ������ ��
	// ���
	public void FindSecondWordOnlyFromDigits() {
		if (words.size() >= 1) {
			for (int i = 0; i < words.size(); i++) {
				for (int j = 0; j < words.get(i).length(); j++) {

				}
			}
		} else {
			System.out.println(
					"����� �� �������� ����. ����� �����, � ������� ����� ��������� �������� ����������, ����������");
		}
	}
}