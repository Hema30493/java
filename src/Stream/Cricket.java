package Stream;

public class Cricket {
	private String playerName;
	private boolean isBatsman;
	private int age;
	private int playerScore;
	private int playerWicket;
	public void setplayerName(String playerName) {
		this.playerName=playerName;
	}
	public String getplayerName() {
		return playerName;
	}
	public void setisBatsman(boolean isBatsman) {
		this.isBatsman=isBatsman;
	}
	public boolean getisBatsman() {
		return isBatsman;
	}
	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}

	public void setplayerScore(int playerScore) {
		this.playerScore=playerScore;
	}
	public int getplayerScore() {
		return playerScore;
	}

	public void setplayerWicket(int playerWicket) {
		this.playerWicket=playerWicket;
	}
	public int getplayerWicket() {
		return playerWicket;
	}
	public Cricket(String playerName,boolean isBatsman,int age,int playerScore,int playerWicket) {
		this.playerName=playerName;
		this.isBatsman=isBatsman;
		this.age=age;
		this.playerScore=playerScore;
		this.playerWicket=playerWicket;
	}
	public String toString() {
		return playerName+isBatsman+age+playerScore+playerWicket;
	}


}
