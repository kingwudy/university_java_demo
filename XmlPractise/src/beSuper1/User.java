package beSuper1;

public class User {
	private String username;
	private int score;
	public User(String username){
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
	public int getScore() {
		return score;
	}
	public void addScore() {
		score += 5;
	}

	
	
}
