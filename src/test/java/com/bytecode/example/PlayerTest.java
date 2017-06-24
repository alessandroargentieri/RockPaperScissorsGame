package com.bytecode.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @author argentieri
 * Test Class for the Player's methods
 */
public class PlayerTest {
	
	static IPlayer player;
	
	@BeforeClass
	public static final void init(){
		player = new PlayerImpl();
	}
	
	@Before
	public final void initScore(){
		player.resetScore();
	}
	
	@Test
	public final void whenPlayerScoreUpTwiceScoreIsTwo(){
		player.scoreUp();
		player.scoreUp();
		Assert.assertEquals(2, player.getScore());
	}

	@Test
	public final void whenPlayerScoreIsResetScoreIsZero(){
		player.scoreUp();
		player.scoreUp();
		player.resetScore();
		Assert.assertEquals(0, player.getScore());
	}
	
}
