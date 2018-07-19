package li.jdbc.start;

import java.sql.*;
import java.util.ArrayList;

public class UsersRepository {
	private String connectionString;

	public UsersRepository(String connectionString) {
		this.connectionString = connectionString;
	}

	public void insertData(ArrayList<User> users) {
		try (Connection conn = DriverManager.getConnection(connectionString);
				PreparedStatement ps = conn
						.prepareStatement("INSERT INTO users \r\n" + "(name, surname, birthday) VALUES" + "(?,?,?)")) {
			for (User user : users) {
				ps.setString(1, user.getName());
				ps.setString(2, user.getSurname());
				ps.setDate(3, java.sql.Date.valueOf(user.getBirthDate()));
				ps.executeUpdate();
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
	}

	public ArrayList<Integer> getAllIds() {
		ArrayList<Integer> idList = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection(connectionString);
				Statement statement = conn.createStatement()) {

			ResultSet rs = statement.executeQuery("SELECT id FROM users");
			rs.next();

			while (rs.next()) {
				int id = rs.getInt(1);
				idList.add(id);
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
		return idList;
	}
}