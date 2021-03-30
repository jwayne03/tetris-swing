package model;

import java.util.Date;

public class Score {

	private String player;
	private int score;
	private Date date;
	
	public Score(String player, int score, Date date) {
		this.player = player;
		this.score = score;
		this.date = date;
	}
}
