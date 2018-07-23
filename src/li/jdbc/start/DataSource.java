package li.jdbc.start;

import java.io.*;
import java.util.ArrayList;

class DataSource {
	private String namesFileAddress;
	private String surnamesFileAddress;
	private String postsFileAddress;

	public DataSource(String namesFileAddress, String surnamesFileAddress, String postsFileAddress) {
		this.namesFileAddress = namesFileAddress;
		this.surnamesFileAddress = surnamesFileAddress;
		this.postsFileAddress = postsFileAddress;
	}

	public ArrayList<String> getNames() {
		ArrayList<String> names = new ArrayList<>();
		String name;

		try (BufferedReader br = new BufferedReader(new FileReader(namesFileAddress))) {

			while ((name = br.readLine()) != null) {
				names.add(name);
			}
		} catch (IOException exc) {
			exc.printStackTrace();
		}
		return names;
	}

	public ArrayList<String> getSurnames() {
		ArrayList<String> surnames = new ArrayList<>();
		String surname;

		try (BufferedReader br = new BufferedReader(new FileReader(surnamesFileAddress))) {

			while ((surname = br.readLine()) != null) {
				surnames.add(surname);
			}
		} catch (IOException exc) {
			exc.printStackTrace();
		}
		return surnames;
	}

	public ArrayList<String> getPosts() {
		ArrayList<String> posts = new ArrayList<>();
		String post;

		try (BufferedReader br = new BufferedReader(new FileReader(postsFileAddress))) {

			while ((post = br.readLine()) != null) {
				posts.add(post);
			}
		} catch (IOException exc) {
			exc.printStackTrace();
		}
		return posts;
	}
}