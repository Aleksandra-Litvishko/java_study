package li.java.tasks.collections;

import java.util.*;

public class HashSetDemo {
	public static void main(String [] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<>();
		
		hs.add("����");
		hs.add("�����");
		hs.add("�����");
		hs.add("���");
		hs.add("�����");
		hs.add("�������");
		hs.add("�����");
		
		System.out.println(hs);
	}
}