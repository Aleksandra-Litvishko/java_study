package li.jdbc.start;

import java.sql.*;

public class DBConnect implements DBInterface {
	
	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection(URL + CONNECT_STRING, USER_NAME, PASSWORD);
				Statement st = conn.createStatement()) {
			System.out.println("+");
			st.executeUpdate("CREATE DATABASE SocialNet");
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(URL + DB_NAME + CONNECT_STRING, USER_NAME, PASSWORD);
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
			System.out.println("+");
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
	}
}