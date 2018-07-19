package li.jdbc.start;

import java.sql.*;

public class LikesRepository {
	private String connectionString;
	public LikesRepository(String connectionString) {
		this.connectionString = connectionString;
	}
}