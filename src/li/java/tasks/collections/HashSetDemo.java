package li.java.tasks.collections;

import java.util.*;

public class HashSetDemo {
	public static void main(String [] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<>();
		
		hs.add("бета");
		hs.add("альфа");
		hs.add("гамма");
		hs.add("эта");
		hs.add("омега");
		hs.add("эпсилон");
		hs.add("омега");
		
		System.out.println(hs);
	}
}