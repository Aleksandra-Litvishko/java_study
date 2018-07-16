package learnUp;

import java.sql.*;

public class DBInsert implements DBInterface {
	public static void main(String args[]) {
		try (Connection conn = DriverManager.getConnection(URL + DB_NAME + CONNECT_STRING, USER_NAME, PASSWORD);
				PreparedStatement ps = conn
						.prepareStatement("INSERT INTO users \r\n" + "(name, surname, birthday) VALUES" + "(?,?,?)")) {
			for (int i = 0; i <= 10; i++) {
				ps.setString(1, DBGenData.genName());
				ps.setString(2, DBGenData.genSurname());
				ps.setDate(3, java.sql.Date.valueOf(DBGenData.genBirthDate()));
				ps.executeUpdate();
			}
			ResultSet rs = ps.executeQuery("SELECT id, name, surname, birthday FROM users");
			rs.next();
//			Array x = rs.getArray("id"); 

			while (rs.next()) {
				int id = rs.getInt(1);
				String fname = rs.getString(2);
				String sname = rs.getString(3);
				String bdate = rs.getString(4);
				System.out.println(id + " " + fname + " " + sname + " " + bdate);
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
	}
}