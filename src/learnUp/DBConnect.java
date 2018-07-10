package learnUp;

import java.sql.*;

public class DBConnect {
	public static final String URL = "jdbc:mysql://localhost:3306/";
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_NAME = "world";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "qwerty123";

	public static void main(String[] args) {
		
		Connection conn = null;
		try {
		conn = DriverManager.getConnection(URL + DB_NAME +"?autoReconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", USER_NAME, PASSWORD);
		Statement st = conn.createStatement();
		st.executeUpdate("");
		} catch(SQLException exc) {
			exc.printStackTrace();
		}
		finally{
			if(conn != null) {
				try {
					conn.close();
				}catch(SQLException exc) {
					exc.printStackTrace();
				}
			}
		}
	}
}