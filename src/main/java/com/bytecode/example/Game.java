package com.bytecode.example;

/**
 * 
 * @author argentieri
 * Class representing the life cycle of the entire game.
 * 
 */
public class Game {

	private IPlayer player1, player2;	
	
	protected Game(IPlayer p1, IPlayer p2){
		player1 = p1;
		player2 = p2;
	}
	
	/**
	 * void implementing the life cycle of the game */
	protected void started(){
	
		System.out.println("Start game");
		boolean isBoredToPlay = false;
		player1.resetScore();
		player2.resetScore();
		String p1Choice, p2Choice;
		
		/* here starts the lifecycle of the game*/
		while(!isBoredToPlay){
			
			System.out.println("Write one among these: Rock, Paper, Scissors...");
			p1Choice = Utils.getInput();
			p2Choice = Utils.choice();
			
			System.out.println(player2.getName() + ", instead, chose " + p2Choice);
			
			
			int point = Utils.referee(p1Choice, p2Choice);
			if(point == 1){
				player1.scoreUp();
				System.out.println(player1.getName() + " score up!");
			}else if (point == 2){
				player2.scoreUp();
				System.out.println(player2.getName() + " score up!");
			}else{
				System.out.println("Draw!");
			}
			
			System.out.println("-----------------SCORE------------------");
			System.out.println(player1.getName() + ": " + player1.getScore() + "    "
						+ player2.getName() + ": " + player2.getScore());
			
			System.out.println(Utils.whoIsWinning(player1, player2));
			
			System.out.println("If you want to stop playing write 'stop' else press enter...");
			isBoredToPlay = Utils.wannaStop();
		}
		//finish the game
		finish();
	}
	
	
	
	
	/*void which stops the game*/
	private void finish(){
		System.out.println("Thanks for having played!");
		player1.resetScore();
		player2.resetScore();
	}
}
