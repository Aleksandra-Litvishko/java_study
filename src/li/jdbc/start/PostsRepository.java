package li.jdbc.start;

import java.sql.*;
import java.util.ArrayList;

public class PostsRepository {
	private String connectionString;
	private String user_name;
	private String password;
	
	public PostsRepository(String connectionString, String user_name, String password) {
		this.connectionString = connectionString;
		this.user_name = user_name;
		this.password = password;
	}
	
	public void insertData(ArrayList<Post> posts) {
		try (Connection conn = DriverManager.getConnection(connectionString, user_name, password);
				PreparedStatement ps = conn
						.prepareStatement("INSERT INTO posts \r\n" + "(userid, text, timestamp) VALUES" + "(?,?,?)")) {
			for (Post post : posts) {
				ps.setInt(1, post.getUserId());
				ps.setString(2, post.getText());
				ps.setDate(3,java.sql.Date.valueOf(post.getTimestamp()));
				ps.executeUpdate();
			}
			System.out.println("Data were added to Posts");
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
	}

	public ArrayList<Integer> getAllPostsIds() {
		ArrayList<Integer> PostIdList = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection(connectionString, user_name, password);
				Statement statement = conn.createStatement()) {

			ResultSet rs = statement.executeQuery("SELECT id FROM posts");
			rs.next();

			while (rs.next()) {
				int postId = rs.getInt(1);
				PostIdList.add(postId);
			}
			System.out.println("PostIds were saved");
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
		return PostIdList;
	}
}