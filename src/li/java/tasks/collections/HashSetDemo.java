package li.java.tasks.collections;

import java.util.*;

public class HashSetDemo {
	public static void main(String [] args) {
		TreeSet<String> hs = new TreeSet<>();
		
		hs.add("бета");
		hs.add("альфа");
		hs.add("гамма");
		hs.add("эта");
		hs.add("омега");
		hs.add("бета");
		
		System.out.println(hs);
	}
}