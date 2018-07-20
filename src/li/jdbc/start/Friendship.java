package li.jdbc.start;

class Friendship {
	private int id1;
	private int id2;
	private String timestamp;
	
	public Friendship(int pairsId [], String timestamp) {
		setId1(pairsId[0]);
		setId2(pairsId[1]);
		this.timestamp = timestamp;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public int getId1() {
		return id1;
	}

	public void setId1(int id1) {
		this.id1 = id1;
	}

	public int getId2() {
		return id2;
	}

	public void setId2(int id2) {
		this.id2 = id2;
	}
}