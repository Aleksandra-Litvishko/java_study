package li.jdbc.start;

import java.sql.*;
import java.util.ArrayList;

public class FriendshipsRepository {
	private String connectionString;

	public FriendshipsRepository(String connectionString) {
		this.connectionString = connectionString;
	}

	public void insertData(ArrayList<Friendship> friendships) {
		try (Connection conn = DriverManager.getConnection(connectionString);

				PreparedStatement ps = conn.prepareStatement(
						"INSERT INTO friendships \r\n" + "(userid1, userid2, timestamp) VALUES" + "(?,?,?)")) {
			for (Friendship friendship: friendships) {
				ps.setInt(1, friendship.getId1());
				ps.setInt(2, friendship.getId2());
				ps.setDate(3, java.sql.Date.valueOf(friendship.getTimestamp()));
				ps.executeUpdate();
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
	}
}