package li.jdbc.start;

import java.sql.*;

public class PostsRepository {
	private String connectionString;
	public PostsRepository(String connectionString) {
		this.connectionString = connectionString;
	}
}