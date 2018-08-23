package li.jdbc.start;

import li.jdbc.start.entities.*;
import li.jdbc.start.repositories.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

import li.jdbc.start.entities.User;

public class DataGeneration {
	private int intId1;
	private int intId2;
	private ArrayList<Integer> userIdList = new ArrayList<>();
	private ArrayList<Integer> postIdList = new ArrayList<>();
	private ArrayList<String> usersPairsIdList = new ArrayList<>();
	private ArrayList<String> usersPostsIdList = new ArrayList<>();
	DataSource data;
	
	DataGeneration(String namesFileAddress, String surnamesFileAddress, String postsFileAddress) {
		this.data = new DataSource(namesFileAddress, surnamesFileAddress, postsFileAddress);
	}
	
	private int genIndex(ArrayList<?> arr) {
		int random_number = 0 + (int) (Math.random() * arr.size() - 1);
		return random_number;
	}
	
	public int generateId(ArrayList<?> arr) {
		int n = (int) arr.get(genIndex(arr));

		return n;
	}

	private String generateName() {
		return data.getNames().get(genIndex(data.getNames()));
	}

	private String generateSurname() {
		return data.getSurnames().get(genIndex(data.getSurnames()));
	}

	private LocalDate generateBirthDate() {
		Random random = new Random();
		int minDay = (int) LocalDate.of(1940, 1, 1).toEpochDay();
		int maxDay = (int) LocalDate.of(2005, 1, 1).toEpochDay();
		long randomDay = minDay + random.nextInt(maxDay - minDay);

		LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
		return randomBirthDate;
	}
	
	private LocalDate generateTimestamp() {
		Random random = new Random();
		int minDay = (int) LocalDate.of(2015, 1, 1).toEpochDay();
		int maxDay = (int) LocalDate.of(2015, 12, 31).toEpochDay();
		long randomDay = minDay + random.nextInt(maxDay - minDay);

		LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
		return randomBirthDate;
	}

	private String generatePost() {
		return data.getPosts().get(genIndex(data.getPosts()));
	}

	public void setUserIdList(ArrayList<Integer> newIdList) {
		userIdList = newIdList;
	}

	public void setPostIdList(ArrayList<Integer> newPostIdList) {
		postIdList = newPostIdList;
	}

	public ArrayList<User> generateUsers(int count) {
		ArrayList<User> users = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			User user = new User(generateName(), generateSurname(), generateBirthDate());
			users.add(user);
		}
		return users;
	}

	public ArrayList<Friendship> generateFriendships(int count) {
		ArrayList<Friendship> friendships = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			Friendship friendship = new Friendship(generateUniqueIdPairs(userIdList), generateTimestamp());
			friendships.add(friendship);
		}
		return friendships;
	}

	public ArrayList<Post> generatePosts(int count) {
		ArrayList<Post> posts = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			Post post = new Post(generateId(userIdList), generatePost(), generateTimestamp());
			posts.add(post);
		}
		return posts;
	}

	public ArrayList<Like> generateLikes(int count) {
		ArrayList<Like> likes = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			Like like = new Like(generateId(userIdList), generateId(postIdList), generateTimestamp());
			likes.add(like);
		}
		return likes;
	}
	
	public int[] generateUniqueIdPairs(ArrayList<?> arr) {
		int n[] = new int[2];

		do {
			intId1 = generateId(arr);
			intId2 = generateId(arr);
		} while (intId1 == intId2);

		String id1 = Integer.toString(intId1);
		String id2 = Integer.toString(intId2);
		String st = id1 + "_" + id2;
		String st1 = id2 + "_" + id1;

		Boolean isExist = false;

		for (int i = 0; i < usersPairsIdList.size(); i++) {
			if ((usersPairsIdList.get(i).equals(st) || usersPairsIdList.get(i).equals(st1))) {
				isExist = true;
			}
		}

		if (!isExist) {
			usersPairsIdList.add(st);
			usersPairsIdList.add(st1);
			n[0] = intId1;
			n[1] = intId2;
		} else {
			return generateUniqueIdPairs(arr);
		}
		return n;
	}

	public int[] generateUniqueIdPairs(ArrayList<?> arr1, ArrayList<?> arr2) {
		int n[] = new int[2];

		intId1 = generateId(arr1);
		intId2 = generateId(arr2);

		String id1 = Integer.toString(intId1);
		String id2 = Integer.toString(intId2);
		String st = id1 + "_" + id2;

		Boolean isExist = false;

		for (int i = 0; i < usersPostsIdList.size(); i++) {
			if (usersPostsIdList.get(i).equals(st)) {
				isExist = true;
			}
		}

		if (!isExist) {
			usersPostsIdList.add(st);
			n[0] = intId1;
			n[1] = intId2;
		} else {
			return generateUniqueIdPairs(arr1, arr2);
		}
		return n;
	}
}