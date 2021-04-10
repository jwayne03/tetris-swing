package model;

import java.util.Comparator;
import java.util.Date;

public class Score {

	private String player;
	private String score;
	private Date date;

	/**
	 * Constructor that has the name of the player, score and the date of the day
	 * that the user has played, this data is used to show all the data to the
	 * JTable
	 * 
	 * @param player String
	 * @param score  String
	 * @param date   Date
	 */
	public Score(String player, String score, Date date) {
		this.player = player;
		this.score = score;
		this.date = date;
	}

	@Override
	public String toString() {
		return player + "," + score + "," + date;
	}

	public String getPlayer() {
		return player;
	}

	public String getScore() {
		return score;
	}

	public Date getDate() {
		return date;
	}

}
