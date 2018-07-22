package li.jdbc.start;

import java.time.LocalDate;

public class User {
	private String name;
	private String surname;
	private LocalDate birthDate;
	
	User (String name, String surname, LocalDate birthDate) {
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

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
}