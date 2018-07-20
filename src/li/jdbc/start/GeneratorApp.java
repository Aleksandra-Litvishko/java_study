package li.jdbc.start;

import static li.jdbc.start.DataGeneration.*;

import java.util.ArrayList;

public class GeneratorApp {

	public static void main(String[] args) {
		
		
		ArrayList<User> users = generateUsers(100);
		UsersRepository userRepository = new UsersRepository(ConnectionString.URL.name() + ConnectionString.DB_NAME.name() + ConnectionString.CONNECT_STRING.name() + ConnectionString.USER_NAME.name() + ConnectionString.PASSWORD.name());
		userRepository.insertData(users);
		setIdList(userRepository.getAllIds());
		
		ArrayList<Friendship> friendships = generateFriendships(1000);
		FriendshipsRepository friendshipRepository = new FriendshipsRepository(ConnectionString.URL.name() + ConnectionString.DB_NAME.name() + ConnectionString.CONNECT_STRING.name() + ConnectionString.USER_NAME.name() + ConnectionString.PASSWORD.name());
		friendshipRepository.insertData(friendships);
	}
}

