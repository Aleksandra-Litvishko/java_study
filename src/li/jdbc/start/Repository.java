package li.jdbc.start;

import java.util.ArrayList;

abstract public class Repository<T> {
	String username;
	String password;
	String connectionString;
	
	Repository(String connectionString, String username, String password) {
		this.connectionString = connectionString;
		this.username = username;
		this.password = password;
	}

	public abstract void insertData(ArrayList<T> data);
}

