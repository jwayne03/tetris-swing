package model;

import java.util.Date;

public class Player {

	private String name;
	private String password;

	/**
	 * Default Constructor
	 */
	public Player() {

	}

	/**
	 * Player constructor that receives two parameters that is the name and password
	 * to check the login
	 * 
	 * @param name     String
	 * @param password String
	 */
	public Player(String name, String password) {
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + password;
	}
}
