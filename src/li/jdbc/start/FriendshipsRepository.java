package li.jdbc.start;

import java.sql.*;
import java.util.ArrayList;

public class FriendshipsRepository extends Repository<Friendship> {

	public FriendshipsRepository(String connectionString, String username, String password) {
		super(connectionString, username, password);
	}

	public void insertData(ArrayList<Friendship> friendships) {
		try (Connection conn = DriverManager.getConnection(connectionString, username, password);

				PreparedStatement ps = conn.prepareStatement(
						"INSERT INTO friendships \r\n" + "(userid1, userid2, timestamp) VALUES" + "(?,?,?)")) {
			for (Friendship friendship : friendships) {
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