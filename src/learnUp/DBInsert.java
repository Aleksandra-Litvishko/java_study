package learnUp;

import java.sql.*;

public class DBInsert implements DBInterface {
	public static void main(String args[]) {
		try (Connection conn = DriverManager.getConnection(URL + DB_NAME + CONNECT_STRING, USER_NAME, PASSWORD);
				PreparedStatement ps = conn
						.prepareStatement("INSERT INTO users \r\n" + "(name, surname, birthday) VALUES" + "(?,?,?)")) {
			for (int i = 0; i <= 1000; i++) {
				ps.setString(1, DBGenData.genName());
				ps.setString(2, DBGenData.genSurname());
				ps.setDate(3, java.sql.Date.valueOf(DBGenData.genBirthDate()));
				ps.executeUpdate();
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
	}
}