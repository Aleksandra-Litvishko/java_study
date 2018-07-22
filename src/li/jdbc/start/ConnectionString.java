package li.jdbc.start;

public enum ConnectionString {
	 URL("jdbc:mysql://localhost:3306/"),
	 DRIVER("com.mysql.cj.jdbc.Driver"), 
	 CONNECT_STRING("?autoReconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"), 
	 DB_NAME("SocialNet"), 
	 USER_NAME("root"), 
	 PASSWORD("qwerty123");
	
	 public final String name;

	 ConnectionString(String s) {
         name = s;
     }

}