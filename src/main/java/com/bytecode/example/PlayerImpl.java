package com.bytecode.example;

/**
 * 
 * @author argentieri
 * Concrete class representing each player
 */
public class PlayerImpl implements IPlayer{
	
	private int score;
	private String name;
	
	public PlayerImpl(){}
	
	public PlayerImpl(String name){
		this.name = name;
	}

	/**
	 * method which augment the score of the player
	 */
	public void scoreUp(){
		score++;
	}
	
	/**
	 * getter method for the Score
	 */
	public int getScore(){
		return score;
	}
			
	/**
	 * method which reset the player's score
	 */
	public int resetScore() {
		score = 0;
		return score;
	}

	/**
	 * setter method for the Player's name
	 */
	public void setName(String name) {
		this.name = name;
		
	}

	/**
	 * getter method for the Player's name
	 */
	public String getName() {
		return name;
	}

}
