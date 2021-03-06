package li.jdbc.start;

import java.sql.*;

public class DataBaseCreation {
	public void createDataBase() {
		try (Connection conn = DriverManager.getConnection(ConnectionString.URL.name + ConnectionString.CONNECT_STRING.name, ConnectionString.USER_NAME.name, ConnectionString.PASSWORD.name);
				Statement st = conn.createStatement()) {
			st.executeUpdate("CREATE DATABASE SocialNet");
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(ConnectionString.URL.name + ConnectionString.DB_NAME.name + ConnectionString.CONNECT_STRING.name, ConnectionString.USER_NAME.name, ConnectionString.PASSWORD.name);
				Statement st1 = conn.createStatement();
				Statement st2 = conn.createStatement();
				Statement st3 = conn.createStatement();
				Statement st4 = conn.createStatement()) {
			st1.executeUpdate(
					"CREATE TABLE Users (id INTEGER AUTO_INCREMENT NOT NULL, name VARCHAR(40) NOT NULL, surname VARCHAR(40) NOT NULL, birthday DATE, PRIMARY KEY(id))");
			st2.executeUpdate(
					"CREATE TABLE Friendships (userid1 INTEGER NOT NULL,userid2 INTEGER NOT NULL, timestamp DATETIME NOT NULL, FOREIGN KEY(userid1) REFERENCES Users(id), FOREIGN KEY(userid2) REFERENCES Users(id))");
			st3.executeUpdate(
					"CREATE TABLE Posts (id INTEGER AUTO_INCREMENT NOT NULL, userid INTEGER NOT NULL, text VARCHAR(1000) NOT NULL, timestamp DATETIME NOT NULL, PRIMARY KEY(id), FOREIGN KEY(userid) REFERENCES Users(id))");
			st4.executeUpdate(
					"CREATE TABLE Likes (postid INTEGER NOT NULL, userid INTEGER NOT NULL, timestamp DATETIME NOT NULL, FOREIGN KEY(postid) REFERENCES Posts(id), FOREIGN KEY(userid) REFERENCES Users(id))");
			System.out.println("DB was created...");
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
	}
}