package li.jdbc.start.repositories;

import java.sql.*;
import java.util.ArrayList;

import li.jdbc.start.entities.Like;

public class LikesRepository extends Repository<Like>{
	
	public LikesRepository(String connectionString,String username, String password) {
		super(connectionString, username, password);
	}
	
	public void insertData(ArrayList<Like> likes) {
		try (Connection conn = DriverManager.getConnection(connectionString, username, password);
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