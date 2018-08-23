package li.jdbc.start.entities;

import java.time.LocalDate;

public class Like {
	private int userId;
	private int postId;
	private LocalDate timestamp;
	
	public Like(int userId, int postId, LocalDate timestamp) {
		this.setUserId(userId);
		this.setPostId(postId);
		this.setTimestamp(timestamp);
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public LocalDate getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}
}