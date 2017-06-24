package com.bytecode.example;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author argentieri
 * Java tests for Utils class methods
 */
public class UtilsTest {

	@Test
	public final void gimmeTheNameTestingResult(){
		java.util.List<String> listNames = Arrays.asList("Sara","Annabella","Marcello","Francesca","Eugenio");
		Assert.assertTrue(listNames.contains(Utils.gimmeTheName()));
	}
	
	@Test
	public final void choiceTestingResult(){
		java.util.List<String> listChoices = Arrays.asList("Rock","Paper","Scissors");
		Assert.assertTrue(listChoices.contains(Utils.choice()));
	}
	
	@Test
	public final void whenRockVsRockIsDraw(){
		Assert.assertEquals(0, Utils.referee("Rock", "Rock"));
	}
	
	@Test
	public final void whenRockVsPaperIsLoss(){
		Assert.assertEquals(2, Utils.referee("Rock", "Paper"));
	}
	
	@Test
	public final void whenRockVsScissorsIsWon(){
		Assert.assertEquals(1, Utils.referee("Rock", "Scissors"));
	}
	
	@Test
	public final void whenPaperVsRockIsWon(){
		Assert.assertEquals(1, Utils.referee("Paper", "Rock"));
	}
	
	@Test
	public final void whenPaperVsPaperIsDraw(){
		Assert.assertEquals(0, Utils.referee("Paper", "Paper"));
	}
	
	@Test
	public final void whenPaperVsScissorsIsLoss(){
		Assert.assertEquals(2, Utils.referee("Paper", "Scissors"));
	}
	
	@Test
	public final void whenScissorsVsRockIsLoss(){
		Assert.assertEquals(2, Utils.referee("Scissors", "Rock"));
	}
	
	@Test
	public final void whenScissorsVsPaperIsWon(){
		Assert.assertEquals(1, Utils.referee("Scissors", "Paper"));
	}
	
	@Test
	public final void whenScissorsVsScissorsIsDraw(){
		Assert.assertEquals(0, Utils.referee("Scissors", "Scissors"));
	}
	
	@Test
	public final void givenRockInputYouGetRock(){
		Assert.assertEquals("Rock", Utils.checkInput("rock"));
	}
	
	@Test
	public final void givenRockInputYouGetRock2(){
		Assert.assertEquals("Rock", Utils.checkInput("Rock"));
	}
	
	@Test
	public final void givenPaperInputYouGetPaper(){
		Assert.assertEquals("Paper", Utils.checkInput("paper"));
	}
	
	@Test
	public final void givenPaperInputYouGetPaper2(){
		Assert.assertEquals("Paper", Utils.checkInput("Paper"));
	}
	
	@Test
	public final void givenScissorsInputYouGetScissors(){
		Assert.assertEquals("Scissors", Utils.checkInput("scissors"));
	}
	
	@Test
	public final void givenScissorsInputYouGetScissors2(){
		Assert.assertEquals("Scissors", Utils.checkInput("Scissors"));
	}
	
	@Test
	public final void givenOtherInputYouGetEmptyString(){
		Assert.assertEquals("", Utils.checkInput("Scissorsee"));
	}
		
	@Test
	public final void whenP1MajorScoreisWinning(){
		IPlayer p1 = new PlayerImpl("P1");
		IPlayer p2 = new PlayerImpl("P2");
		p1.scoreUp();
		Assert.assertEquals("P1 is winning!", Utils.whoIsWinning(p1, p2));
	}
	
	@Test
	public final void whenP2MajorScoreisWinning(){
		IPlayer p1 = new PlayerImpl("P1");
		IPlayer p2 = new PlayerImpl("P2");
		p2.scoreUp();
		Assert.assertEquals("P2 is winning!", Utils.whoIsWinning(p1, p2));
	}
	
	@Test
	public final void whenP1ScoreEqualsP2ScoreIsDraw(){
		IPlayer p1 = new PlayerImpl("P1");
		IPlayer p2 = new PlayerImpl("P2");
		p1.scoreUp();
		p2.scoreUp();
		Assert.assertEquals("Draw!", Utils.whoIsWinning(p1, p2));
	}
	
	
	
	
}
