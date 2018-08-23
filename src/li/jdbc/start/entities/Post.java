package li.jdbc.start.entities;

import java.time.LocalDate;

public class Post { 
	private int userId;
	private String text;
	private LocalDate timestamp;
	
	public Post (int userId, String text, LocalDate timestamp) {
		this.setUserId(userId);
		this.setText(text);
		this.setTimestamp(timestamp);
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int postId) {
		this.userId = postId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDate getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}

}