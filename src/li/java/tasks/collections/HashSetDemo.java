package li.java.tasks.collections;

import java.util.*;

public class HashSetDemo {
	public static void main(String [] args) {
		TreeSet<String> hs = new TreeSet<>();
		
		hs.add("����");
		hs.add("�����");
		hs.add("�����");
		hs.add("���");
		hs.add("�����");
		hs.add("����");
		
		System.out.println(hs);
	}
}