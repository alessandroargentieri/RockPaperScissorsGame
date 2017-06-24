package com.bytecode.example;

/**
 * @author argentieri
 * 
 * Starting point for the sample application.
 */
public class MainBootApplication {

	/*The main here creates Players and Game entities and
	 * injects yhe players into the Game's constructor*/
	public static void main(String args[]){
		//create players from the interface
		IPlayer player1 = new PlayerImpl();
		IPlayer player2 = new PlayerImpl(Utils.gimmeTheName());
		
		System.out.println("Welcome to the game...");
		System.out.println("Choose a name for Player1...");
		
		//set Player name from the keyboard
		String p1Name = Utils.chooseName();
		player1.setName(p1Name);
		
		System.out.println("Have a good match " + player1.getName() + "!");
		System.out.println("Your opponent in this game will be " + player2.getName());
		
		//create and start a new game injecting the players
		Game game = new Game(player1, player2);
		game.started();
	}
}
