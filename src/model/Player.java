package model;

import java.util.Date;

public class Player {
	
	private String name;
	private int score;
	private Date date;
	
	public Player() {
		
	}
	
	public Player(String name, int score, Date date) {
		this.name = name;
		this.score = score;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public Date getDate() {
		return date;
	}
}
