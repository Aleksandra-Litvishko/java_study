package learnUp;

import java.util.ArrayList;

public class DBGenData {
	private static int minIndex = 0;
	private static int maxIndex = 39;
	private static ArrayList<Integer> idList = new ArrayList<>();
	private static int idArray[] = {}; 

	private static String[] name = { "Cathleen", "Janie", "Terra", "Mccullough", "Powers", "Edwards", "Woodard",
			"Harding", "Burgess", "Shana", "Flynn", "Lilia", "Lynnette", "Yates", "Claudia", "Craft", "Valeria", "Lynn",
			"Cassie", "Megan", "Lynch", "Karin", "Rocha", "Dalton", "Crystal", "Melanie", "Donaldson", "Sawyer",
			"Shannon", "Vilma", "Johnson", "Elva", "Macias", "Best", "Stokes", "Grimes", "Landry", "Tami", "Lynda",
			"Trudy", "Huber", "Etta", "Joanna", "Georgette", "Chambers", "Kline" };
	private static String[] surname = { "Carrillo", "Armstrong", "Miranda", "Hogan", "Good", "Moore", "Daniel",
			"Randall", "Wolfe", "Higgins", "Delgado", "Simmons", "Delacruz", "Blankenship", "Giles", "Black", "Briggs",
			"Byers", "Glover", "Jimenez", "Marks", "Prince", "Vaughn", "White", "Copeland", "Flowers", "Cleveland",
			"Hood", "Casey", "Huff", "Zamora", "Hays", "Kent", "Hickman", "Battle", "Bennett", "Richards", "Keller",
			"Finch", "Rivera", "Lowery", "Guzman", "Perry", "Burks", "Cohen", "Whitfield", "Craft", "Levy" };
	private static String[] birth_date = { "1975-09-05", "2006-05-28", "1941-06-25", "2001-10-08", "1927-10-19",
			"1961-10-30", "2012-08-17", "1987-05-18", "1901-10-03", "1971-04-09", "1918-03-16", "1955-07-23",
			"1971-04-19", "1957-08-17", "1962-02-27", "1945-05-02", "2001-11-11", "1957-07-05", "1933-09-10",
			"1976-11-03", "1945-07-09", "1987-06-06", "1952-06-07", "1961-04-06", "1926-07-01", "1931-03-24",
			"1980-06-26", "1915-09-26", "1975-09-06", "1914-11-08", "1922-11-07", "1994-08-15", "1929-12-10",
			"1985-11-17", "1981-09-27", "1946-07-11", "1943-08-27", "2004-07-14", "1931-09-05", "2004-11-06",
			"1953-02-01", "1988-08-02", "1974-03-04", "1941-04-03", "1981-04-30", "1925-06-20" };

	private static int genIndex() {
		int random_number = minIndex + (int) (Math.random() * maxIndex);
		return random_number;
	}

	public static String genName() {
		return name[genIndex()];
	}

	public static String genSurname() {
		return surname[genIndex()];
	}

	public static String genBirthDate() {
		return birth_date[genIndex()];
	}

	public static void getID(int n) {
		idList.add(n);
	}
	public static int returnIDList() {
		int randomNumber = minIndex + (int) (Math.random() * idList.size());
		int n = idList.get(randomNumber);
		return n;
	}
}