package model;

import java.util.Date;

public class Score {

	private String player;
	private String score;
	private Date date;
	
	public Score(String player, String score, Date date) {
		this.player = player;
		this.score = score;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return player + " " + score + " " + date;
	}
}
