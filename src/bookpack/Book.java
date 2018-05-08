package bookpack;

public class Book {
	private String title;
	private String author;
	private int pubDate;
	
	public Book (String t, String a, int p) {
		title = t;
		author = a;
		pubDate = p;
	}
	
	public void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
	}
}