package li.jdbc.start;

import java.sql.*;

public class DBForGen {
	public static void main(String args[]) {

		try (Connection conn = DriverManager.getConnection(ConnectionString.URL.name + ConnectionString.DB_NAME.name + ConnectionString.CONNECT_STRING.name ,ConnectionString.USER_NAME.name, ConnectionString.PASSWORD.name);
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery("SELECT * FROM users")) {
			while (rs.next()) {
				System.out.println(rs.getRow() + " " + rs.getString("name"));
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
	}
}