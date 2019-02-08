package com.mycompany.a1;

import com.codename1.ui.Form;

public class Game extends Form {
	
	private GameWorld gw;
	
	public Game()
	{
		gw = new GameWorld();
		gw.init();
		play();
		
	}
	
	private void play()
	{
		/* 
		 * code here to accept and execute user commands
		 * that operate on the game world
		 */
		
		//Scanner to accept keyboard commands 
			//invoke appropriate method in GameWorld 
			//to manipulate and display data and game state values in game model
		
		
	}
	
	

}
