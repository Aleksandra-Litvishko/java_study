package li.jdbc.start;

import java.sql.*;
import static li.jdbc.start.DataGeneration.*;

public class DBInsert implements ConnectionInformation {
	public static void main(String args[]) {
		try (Connection conn = DriverManager.getConnection(URL + DB_NAME + CONNECT_STRING, USER_NAME, PASSWORD);
				PreparedStatement ps = conn
						.prepareStatement("INSERT INTO users \r\n" + "(name, surname, birthday) VALUES" + "(?,?,?)")) {
			for (int i = 0; i <= 1000; i++) {
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
			for (int i = 0; i <= 1000; i++) {
				int n[] = new int[2];
				n = getPairId();
				System.out.println(n[0]);
				System.out.println(n[1]);
				ps.setInt(1, n[0]);
				ps.setInt(2, n[1]);
				ps.setDate(3, java.sql.Date.valueOf(genBirthDate()));
				ps.executeUpdate();
			}
			
//			ResultSet rs = ps.executeQuery("SELECT id, name, surname, birthday FROM users");
//			rs.next();
//
//			while (rs.next()) {
//				int id = rs.getInt(1);
//				DBGenData.getID(id);
//			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
	}
}