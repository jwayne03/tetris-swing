package model;

import java.util.Date;

public class Score {

	private Player player;
	private int score;
	private Date date;
	
	public Score(Player player, int score, Date date) {
		this.player = player;
		this.score = score;
		this.date = date;
	}
}
