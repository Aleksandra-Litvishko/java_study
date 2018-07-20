package li.jdbc.start;

import static li.jdbc.start.DataGeneration.*;

import java.util.ArrayList;

public class GeneratorApp {
	public static void main(String[] args) {
		String dBconnectionString = ConnectionString.URL.name() + ConnectionString.DB_NAME.name() + ConnectionString.CONNECT_STRING.name() + ConnectionString.USER_NAME.name() + ConnectionString.PASSWORD.name();
		
		ArrayList<User> users = generateUsers(100);
		UsersRepository userRepository = new UsersRepository(dBconnectionString);
		userRepository.insertData(users);
		setIdList(userRepository.getAllIds());
		
		ArrayList<Friendship> friendships = generateFriendships(1000);
		FriendshipsRepository friendshipRepository = new FriendshipsRepository(dBconnectionString);
		friendshipRepository.insertData(friendships);
	}
}