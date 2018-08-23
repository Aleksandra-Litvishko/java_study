package li.jdbc.start.repositories;

import java.sql.*;
import java.util.ArrayList;

import li.jdbc.start.entities.User;

public class UsersRepository extends Repository<User> {
	
	public UsersRepository(String connectionString, String username, String password) {
		super(connectionString, username, password);
	}
	
	@Override()
	public void insertData(ArrayList<User> users) {
		try (Connection conn = DriverManager.getConnection(connectionString, username, password);
				PreparedStatement ps = conn
						.prepareStatement("INSERT INTO users \r\n" + "(name, surname, birthday) VALUES" + "(?,?,?)")) {
			for (User user : users) {
				ps.setString(1, user.getName());
				ps.setString(2, user.getSurname());
				ps.setDate(3,java.sql.Date.valueOf(user.getBirthDate()));
				ps.executeUpdate();
			}
			System.out.println("Data were added to Users");
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
	}

	public ArrayList<Integer> getAllIds() {
		ArrayList<Integer> idList = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection(connectionString, username, password);
				Statement statement = conn.createStatement()) {

			ResultSet rs = statement.executeQuery("SELECT id FROM users");
			rs.next();

			while (rs.next()) {
				int id = rs.getInt(1);
				idList.add(id);
			}
			System.out.println("UsersIds were saved");
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
		return idList;
	}

}