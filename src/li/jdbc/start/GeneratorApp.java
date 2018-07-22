package li.jdbc.start;

import static li.jdbc.start.DataGeneration.*;

import java.util.ArrayList;

public class GeneratorApp {
	public static void main(String[] args) {
		String dBconnectionString = ConnectionString.URL.name + ConnectionString.DB_NAME.name + ConnectionString.CONNECT_STRING.name;
		
		DataBaseCreation database = new DataBaseCreation();
		database.createDataBase();
		
		ArrayList<User> users = generateUsers(100);
		UsersRepository userRepository = new UsersRepository(dBconnectionString, ConnectionString.USER_NAME.name, ConnectionString.PASSWORD.name);
		userRepository.insertData(users);
		setUserIdList(userRepository.getAllIds());
		
		ArrayList<Friendship> friendships = generateFriendships(100);
		FriendshipsRepository friendshipRepository = new FriendshipsRepository(dBconnectionString, ConnectionString.USER_NAME.name, ConnectionString.PASSWORD.name);
		friendshipRepository.insertData(friendships);
		
		ArrayList<Post> posts = generatePosts(100);
		PostsRepository postRepository = new PostsRepository(dBconnectionString, ConnectionString.USER_NAME.name, ConnectionString.PASSWORD.name);
		postRepository.insertData(posts);
		setPostIdList(postRepository.getAllPostsIds());
		
		ArrayList<Like> likes = generateLikes(100);
		LikesRepository likeRepository = new LikesRepository(dBconnectionString, ConnectionString.USER_NAME.name, ConnectionString.PASSWORD.name);
		likeRepository.insertData(likes);
	}
}