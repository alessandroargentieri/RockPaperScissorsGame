package com.bytecode.example;


/**
 * 
 * @author argentieri
 * 
 * Interface for the Player
 */
public interface IPlayer {
	
	void scoreUp();
	
	int getScore();
	
	int resetScore();
	
	void setName(String name);
	
	String getName();

}
