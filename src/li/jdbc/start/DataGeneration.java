package li.jdbc.start;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class DataGeneration {
	private static int intId1;
	private static int intId2;
	private static ArrayList<Integer> userIdList = new ArrayList<>();
	private static ArrayList<Integer> postIdList = new ArrayList<>();
	private static ArrayList<String> usersPairsIdList = new ArrayList<>();
	private static ArrayList<String> usersPostsIdList = new ArrayList<>();
	

	private static String[] name = { "Cathleen", "Janie", "Terra", "Mccullough", "Powers", "Edwards", "Woodard",
			"Harding", "Burgess", "Shana", "Flynn", "Lilia", "Lynnette", "Yates", "Claudia", "Craft", "Valeria", "Lynn",
			"Cassie", "Megan", "Lynch", "Karin", "Rocha", "Dalton", "Crystal", "Melanie", "Donaldson", "Sawyer",
			"Shannon", "Vilma", "Johnson", "Elva", "Macias", "Best", "Stokes", "Grimes", "Landry", "Tami", "Lynda",
			"Trudy", "Huber", "Etta", "Joanna", "Georgette", "Chambers", "Kline" };

	private static String[] surname = { "Carrillo", "Armstrong", "Miranda", "Hogan", "Good", "Moore", "Daniel",
			"Randall", "Wolfe", "Higgins", "Delgado", "Simmons", "Delacruz", "Blankenship", "Giles", "Black", "Briggs",
			"Byers", "Glover", "Jimenez", "Marks", "Prince", "Vaughn", "White", "Copeland", "Flowers", "Cleveland",
			"Hood", "Casey", "Huff", "Zamora", "Hays", "Kent", "Hickman", "Battle", "Bennett", "Richards", "Keller",
			"Finch", "Rivera", "Lowery", "Guzman", "Perry", "Burks", "Cohen", "Whitfield", "Craft", "Levy" };

	private static String[] postText = {
			"Абсурд имеет смысл только в той мере, в какой с ним не соглашаются. (Камю А.)",
			"Если мы рассматриваем человека таким, какой он есть, мы делаем его хуже, чем он есть. Но если мы рассматриваем его таким, каким он должен быть, мы даем ему стать таким, каким он мог бы стать (Мэй Р.)",
			"Постепенно человек утрачивает свою форму и становится шаром. И став шаром, человек утрачивает все свои желания. (Хармс Д.)",
			"Я и есть мир. Но мир — это не я. (Хармс Д.)",
			"В грязном падении человеку остается только одно: не оглядываясь, падать. Важно только делать это с интересом и энергично. (Хармс Д.)",
			"Я полагаю, что там, где есть жизнь, есть и безумие. (Витакер К.)",
			"Жизнь каждого человека есть путь к самому себе, попытка пути, намек на тропу. Ни один человек никогда не был самим собой целиком и полностью; каждый, тем не менее, стремится к этому, один глухо, другой отчетливей, каждый как может (Гессе Г.)",
			"Ценность имеют только те мысли, которыми мы живем (Гессе Г.)",
			"Свобода человека в современном мире похожа на свободу человека, разгадывающего кроссворд: теоретически, он может вписать любое слово, но на самом деле он должен вписать только одно, чтобы кроссворд решился (Эйнштейн А.)",
			"Если у проблемы не существует решения, возможно, это не проблема, а данность, с которой следует научиться жить. (Перес Ш.)",
			"Некоторые люди не умеют сходить с ума — у них ужасно скучные жизни (Буковски Ч.)" };

	private static int genIndex(ArrayList<?> arr) {
		int random_number = 0 + (int) (Math.random() * arr.size() - 1);
		return random_number;
	}

	private static int genIndex(String arr[]) {
		int random_number = 0 + (int) (Math.random() * arr.length - 1);
		return random_number;
	}

	private static String generateName() {
		return name[genIndex(name)];
	}

	private static String generateSurname() {
		return surname[genIndex(surname)];
	}

	private static LocalDate generateBirthDate() {
		Random random = new Random();
		int minDay = (int) LocalDate.of(1940, 1, 1).toEpochDay();
		int maxDay = (int) LocalDate.of(2005, 1, 1).toEpochDay();
		long randomDay = minDay + random.nextInt(maxDay - minDay);

		LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
		return randomBirthDate;
	}

	private static String generatePost() {
		return postText[genIndex(postText)];
	}

	public static int generateId(ArrayList<?> arr) {
		int n = (int) arr.get(genIndex(arr));

		return n;
	}
	
	public static void setUserIdList(ArrayList<Integer> newIdList) {
		userIdList = newIdList;
	}

	public static void setPostIdList(ArrayList<Integer> newPostIdList) {
		postIdList = newPostIdList;
	}

	public static int[] generateUniqueIdPairs(ArrayList<?> arr) {
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

	public static int[] generateUniqueIdPairs(ArrayList<?> arr1, ArrayList<?> arr2) {
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

	public static ArrayList<User> generateUsers(int count) {
		ArrayList<User> users = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			User user = new User(generateName(), generateSurname(), generateBirthDate());
			users.add(user);
		}
		return users;
	}

	public static ArrayList<Friendship> generateFriendships(int count) {
		ArrayList<Friendship> friendships = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			Friendship friendship = new Friendship(generateUniqueIdPairs(userIdList), generateBirthDate());
			friendships.add(friendship);
		}
		return friendships;
	}

	public static ArrayList<Post> generatePosts(int count) {
		ArrayList<Post> posts = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			Post post = new Post(generateId(userIdList), generatePost(), generateBirthDate());
			posts.add(post);
		}
		return posts;
	}

	public static ArrayList<Like> generateLikes(int count) {
		ArrayList<Like> likes = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			Like like = new Like(generateId(userIdList), generateId(postIdList), generateBirthDate());
			likes.add(like);
		}
		return likes;
	}
}