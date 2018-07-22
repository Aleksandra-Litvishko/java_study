package li.jdbc.start;

import java.sql.*;
import java.util.ArrayList;

public class FriendshipsRepository {
	private String connectionString;
	private String user_name;
	private String password;


	public FriendshipsRepository(String connectionString, String user_name, String password) {
		this.connectionString = connectionString;
		this.user_name = user_name;
		this.password = password;
	}

	public void insertData(ArrayList<Friendship> friendships) {
		try (Connection conn = DriverManager.getConnection(connectionString, user_name, password);

				PreparedStatement ps = conn.prepareStatement(
						"INSERT INTO friendships \r\n" + "(userid1, userid2, timestamp) VALUES" + "(?,?,?)")) {
			for (Friendship friendship: friendships) {
				ps.setInt(1, friendship.getId1());
				ps.setInt(2, friendship.getId2());
				ps.setDate(3, java.sql.Date.valueOf(friendship.getTimestamp()));
				ps.executeUpdate();
			}
			System.out.println("Data were added to Friendships");
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
	}
}