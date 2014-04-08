package model;

public class Player {
	
	public String name;
	public long prize;
	
	
	public Player(String name, long prize) {
		super();
		this.name = name;
		this.prize = prize;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrize() {
		return prize;
	}
	
	public void setPrize(long prize) {
		this.prize = prize;
	}
	
	
}
