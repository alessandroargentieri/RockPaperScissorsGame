package com.bytecode.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author argentieri
 *
 * Utils class containing some static methods
 */
public class Utils {
	
	static final Scanner s = new Scanner(System.in);
	static final java.util.List<String> possibleInputs = Arrays.asList("rock","paper","scissors");
	
	
	/* it calculates a random int between a min and a max number */
	private static int randInt(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}
	
	/**
	 * Static method returning opponent's random name
	 * @return randomName
	 */
	protected static String gimmeTheName(){
		java.util.List<String> listNames = Arrays.asList("Sara","Annabella","Marcello","Francesca","Eugenio");
		return listNames.get(randInt(0,4));
	}
	
	/**
	 * Static method returning opponent's random choice
	 * @return choice
	 */
	protected static String choice(){
		java.util.List<String> listChoices = Arrays.asList("Rock","Paper","Scissors");
		return listChoices.get(randInt(0,2));
	}
	
	/**
	 * Method which returns 1 if the Player1 has scored up, 2 if the Player2 has scored up, 0 otherwise.
	 * @param p1Choice
	 * @param p2Choice
	 * @return
	 */
	protected static int referee(String p1Choice, String p2Choice){
		String merged = p1Choice + p2Choice;
		int result = 0;  //0: draw, 1: p1 won, 2: p2 won
		if("RockRock".equals(merged)){
			result = 0;
		}else if("RockPaper".equals(merged)){
			result = 2;
		}else if("RockScissors".equals(merged)){
			result = 1;
		}else if("PaperRock".equals(merged)){
			result = 1;
		}else if("PaperPaper".equals(merged)){
			result = 0;
		}else if("PaperScissors".equals(merged)){
			result = 2;
		}else if("ScissorsRock".equals(merged)){
			result = 2;
		}else if("ScissorsPaper".equals(merged)){
			result = 1;
		}else if("ScissorsScissors".equals(merged)){
			result = 0;
		}
		return result;
	}
	
	/**
	 * method which allows the user to enter the name
	 * @return input
	 */
	protected static String getInput(){
		String input = "";
		while("".equals(input)){
			input = s.nextLine();
			input = checkInput(input);
		}
		return input;
	}
	
	/**
	 * method which returns the option selected [Rock, Paper, Scissors]
	 * @param input
	 * @return [Rock, Paper, Scissors, ""]
	 */
	protected static String checkInput(String input){
		if("rock".equals(input.toLowerCase()))
			 return "Rock";
		else if("paper".equals(input.toLowerCase()))
			 return "Paper";
		else if("scissors".equals(input.toLowerCase()))
			 return "Scissors";
		else 
			System.out.println("Please enter a valid value... [Rock, Paper, Scissors]");
		return "";
	}
	
	/**
	 * methods which returns the Name of the User Player
	 * @return input
	 */
	protected static String chooseName(){
		String input = "";
		while(input==null || "".equals(input)){
			input = s.nextLine();
			if(input==null || "".equals(input)){
				System.out.println("Please enter a valid name...");
			}
		}
		return input;
	}
	
	/**
	 * methods which returns if the player want to stop playing
	 * @return isBoredToPlay
	 */
	protected static boolean wannaStop(){
		 String input = s.nextLine();
		 if("stop".equals(input.toLowerCase()))
			 return true;
		 return false;
	}
	
	
	/**
	 * Static method which returns the player who is in advantage for this game
	 * @param scoreP1
	 * @param scoreP2
	 * @return whoIsWinning
	 */
	protected static String whoIsWinning(IPlayer p1, IPlayer p2){
		String who;
		if(p1.getScore() > p2.getScore()){
			who = p1.getName() + " is winning!";
		}else if(p1.getScore() < p2.getScore()){
			who = p2.getName() + " is winning!";
		}else{
			who = "Draw!";
		}
		return who;
	}
	

}
