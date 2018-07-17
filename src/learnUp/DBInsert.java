package learnUp;

import java.sql.*;
import static learnUp.DBGenData.*;

public class DBInsert implements DBInterface {
	public static void main(String args[]) {
		try (Connection conn = DriverManager.getConnection(URL + DB_NAME + CONNECT_STRING, USER_NAME, PASSWORD);
				PreparedStatement ps = conn
						.prepareStatement("INSERT INTO users \r\n" + "(name, surname, birthday) VALUES" + "(?,?,?)")) {
			for (int i = 0; i <= 10; i++) {
				ps.setString(1, genName());
				ps.setString(2, genSurname());
				ps.setDate(3, java.sql.Date.valueOf(genBirthDate()));
				ps.executeUpdate();
			}
			ResultSet rs = ps.executeQuery("SELECT id, name, surname, birthday FROM users");
			rs.next();

			while (rs.next()) {
				int id = rs.getInt(1);
				getID(id);
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(URL + DB_NAME + CONNECT_STRING, USER_NAME, PASSWORD);
				PreparedStatement ps = conn.prepareStatement(
						"INSERT INTO friendships \r\n" + "(userid1, userid2, timestamp) VALUES" + "(?,?,?)")) {
			for (int i = 0; i <= 10; i++) {
				int n, s;
				do {
					n = genID();
					s = genID();
				} while (n == s);

				ps.setInt(1, DBGenData.genID());
				ps.setInt(2, DBGenData.genID());
				ps.setDate(3, java.sql.Date.valueOf(DBGenData.genBirthDate()));
				ps.executeUpdate();
			}
			ResultSet rs = ps.executeQuery("SELECT id, name, surname, birthday FROM users");
			rs.next();

			while (rs.next()) {
				int id = rs.getInt(1);
				DBGenData.getID(id);
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
	}
}