package li.jdbc.start;

import java.util.ArrayList;

import li.jdbc.start.entities.*;
import li.jdbc.start.repositories.*;

public class GeneratorApp {
	public static void main(String[] args) {
		String dBconnectionString = ConnectionString.URL.name + ConnectionString.DB_NAME.name + ConnectionString.CONNECT_STRING.name;
		
		DataGeneration dataGeneration = new DataGeneration("./filesWithData/names.txt",
				"./filesWithData/surnames.txt",
				"./filesWithData/posts.txt");
		
		DataBaseCreation database = new DataBaseCreation();
		database.createDataBase();
		
		ArrayList<User> users = dataGeneration.generateUsers(100);
		UsersRepository userRepository = new UsersRepository(dBconnectionString, ConnectionString.USER_NAME.name, ConnectionString.PASSWORD.name);
		userRepository.insertData(users);
		dataGeneration.setUserIdList(userRepository.getAllIds());
		
		ArrayList<Friendship> friendships = dataGeneration.generateFriendships(100);
		FriendshipsRepository friendshipRepository = new FriendshipsRepository(dBconnectionString, ConnectionString.USER_NAME.name, ConnectionString.PASSWORD.name);
		friendshipRepository.insertData(friendships);
		
		ArrayList<Post> posts = dataGeneration.generatePosts(100);
		PostsRepository postRepository = new PostsRepository(dBconnectionString, ConnectionString.USER_NAME.name, ConnectionString.PASSWORD.name);
		postRepository.insertData(posts);
		dataGeneration.setPostIdList(postRepository.getAllPostsIds());
		
		ArrayList<Like> likes = dataGeneration.generateLikes(100);
		LikesRepository likeRepository = new LikesRepository(dBconnectionString, ConnectionString.USER_NAME.name, ConnectionString.PASSWORD.name);
		likeRepository.insertData(likes);
	}
}