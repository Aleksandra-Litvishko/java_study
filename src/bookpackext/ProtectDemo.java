package bookpackext; // использование модификатора protected

class ExtBook extends bookpack.Book {
	private String publisher;
	
	public ExtBook(String t, String a, int d, String p) {
		super(t, a ,d);
		publisher = p;
	}
	
	public void show() {
		super.show();
		System.out.println(publisher);
		System.out.println();
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String p) {
		publisher = p;
	}
	
	public String getTitle() { // следующие операторы допустимы, т.к. подклассы имеют доступ к членам подкласса, объявленным защищёнными
		return title;
	}
	
	public void setTitle(String t) {
		title = t;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String a) {
		author = a;
	}
	
	public int getDate() {
		return pubDate;
	}
	
	public void setDate(int d) {
		pubDate = d;
	}
}

class ProtectDemo {
	public static void main(String args[]) {
		ExtBook books[] = new ExtBook[5];
		
		books[0] = new ExtBook("Java: A Beginner's Guide", "Schildt", 2014, "Osborne/Mc Graw-Hill");
		books[1] = new ExtBook("Java: The Complete Reference", "Schildt", 2014, "Osborne/Mc Graw-Hill");
		books[2] = new ExtBook("The Art of Java", "Schildt and Holmes", 2003, "Osborne/Mc Graw-Hill");
		books[3] = new ExtBook("Red Storm Rising", "Clancy", 1986, "Putnam");
		books[4] = new ExtBook("On the Road", "Kerouac", 1955, "Viking");
	
		for(ExtBook x: books) {
		x.show();
	    }
	
		System.out.println("Showing all books by Schidlt");
		for(ExtBook x: books) {
			if(x.getAuthor() == "Schildt") {
				System.out.println(x.getTitle());
			    }
		    }
		//books[0].title = "test title" // ошибка: доступ запрещён! Так как класс ProtectDemo не наследуется от класса Book
    }
}