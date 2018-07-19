package li.jdbc.start;

public interface DBInterface {
	String URL = "jdbc:mysql://localhost:3306/";
	String DRIVER = "com.mysql.cj.jdbc.Driver";
	String CONNECT_STRING = "?autoReconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	String DB_NAME = "SocialNet";
	String USER_NAME = "root";
	String PASSWORD = "qwerty123";

}