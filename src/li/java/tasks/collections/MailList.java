package li.java.tasks.collections;

import java.util.*;

class Address {
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;
	
	Address(String n, String s, String c, String st, String cd) {
		name = n;
		street = s;
		city = c;
		state = st;
		code = cd;
	}
	
	@Override
	public String toString() {
		return name + "\n" + street + "\n" + city + " " + state + " " + code;
	}
}

public class MailList {
	public static void main(String args[]) {
		LinkedList<Address> ml = new LinkedList<>();
		
		ml.add(new Address( "J.W.West", "11 Oak Ave",
				"Urbana" , "IL" , "á1801" ) );
		ml.add(new Address( "Ralph Baker" , "1142 Maple Lane",
		"Mahome t", "IL", "61853" ) );
		ml .add (new Address ( "Tom Carlton" , "867 Elm St",
		"Champaign" , "IL" , "61820" ));
		
		for(Address element: ml) {
			System.out.println(element + "\n");
			System.out.println();
		}
	}
}