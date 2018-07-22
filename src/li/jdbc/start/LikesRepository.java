package li.jdbc.start;

import java.sql.*;
import java.util.ArrayList;

public class LikesRepository {
	private String connectionString;
	private String userName;
	private String password;
	
	public LikesRepository(String connectionString,String userName, String password) {
		this.connectionString = connectionString;
		this.userName = userName;
		this.password = password;
	}
	
	public void insertData(ArrayList<Like> likes) {
		try (Connection conn = DriverManager.getConnection(connectionString, userName, password);
				PreparedStatement ps = conn
						.prepareStatement("INSERT INTO likes \r\n" + "(postid, userid, timestamp) VALUES" + "(?,?,?)")) {
			for (Like like : likes) {
				ps.setInt(1, like.getPostId());
				ps.setInt(2, like.getUserId());
				ps.setDate(3,java.sql.Date.valueOf(like.getTimestamp()));
				ps.executeUpdate();
			}
			System.out.println("Data were added to Likes");
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
	}
}