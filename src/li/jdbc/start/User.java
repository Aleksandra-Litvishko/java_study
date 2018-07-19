package li.jdbc.start;

public class User {
	private String name;
	private String surname;
	private String birthDate;
	
	User (String name, String surname, String birthDate) {
		this.setName(name);
		this.setSurname(surname);
		this.setBirthDate(birthDate);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
}