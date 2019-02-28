package com.mycompany.a1;
import java.util.Random;
import java.util.Vector;

public class GameWorld {

	
	
	private Vector<GameObject> gameObjs = new Vector<GameObject>();
	
	private int score;
	private int elapsedTime;
	private int playerLives;
	private boolean endGame;
	
	
	public void init() 
	{
		score = 0;
		elapsedTime = 0;
		playerLives = 3;
		endGame = false;
		//code here to create the initial game objects/setup
	}
	
	/*
	 * additional methods here to manipulate world objects and related game state data
	 */
	public GameWorld() {
		init();
	
	}

	public void eliminate() {
		// TODO Auto-generated method stub
		
	}

	
	
	public void addObj(char c) {
		// TODO Auto-generated method stub
		switch(c)
		{
		case 'a': 
			Asteroid  a = new Asteroid();
			gameObjs.add(a);
			System.out.println("An Asteroid has been created and added to game world!");
			break;
		case 'y':
			EnemyShip y = new EnemyShip();
			gameObjs.add(y);
			System.out.println("An Enemy Ship has been created and added to game world!");
			break;
		case 'b':
			SpaceStation b = new SpaceStation();
			gameObjs.add(b);
			System.out.println("A SpaceShip has been created and added to game world!");
			break;
		case 's':
			//add ps
			
			
			
			 
		}
		
	}
	
	public void addNewAsteroid() {
		// TODO Auto-generated method stub
		
	}

	public void addNPS() {
		// TODO Auto-generated method stub
		
	}

	public void addPS() {
		// TODO Auto-generated method stub
		
	}

	public void changeSpeed(char c) {
		// TODO Auto-generated method stub
		
	}

	public void turnPS(char c) {
		// TODO Auto-generated method stub
		
	}

	public void turnML() {
		// TODO Auto-generated method stub
		
	}

	public void firePMissile() {
		// TODO Auto-generated method stub
		
	}

	public void fireEMissile() {
		// TODO Auto-generated method stub
		
	}

	public void resetPos() {
		// TODO Auto-generated method stub
		
	}

	public void loadPMissile() {
		// TODO Auto-generated method stub
		
	}

	public void removeObj(char c) {
		// TODO Auto-generated method stub
		
	}

	public void missileStrikePS() {
		// TODO Auto-generated method stub
		
	}

	public void asteroidStrikePS() {
		// TODO Auto-generated method stub
		
	}

	public void NPSStrikePS() {
		// TODO Auto-generated method stub
		
	}

	public void asteroidCollision() {
		// TODO Auto-generated method stub
		
	}

	public void asteroidStrikeNPS() {
		// TODO Auto-generated method stub
		
	}

	public void clkTick() {
		// TODO Auto-generated method stub
		
	}

	public void printGameState() {
		// TODO Auto-generated method stub
		
	}

	public void printGameMap() {
		// TODO Auto-generated method stub
		
	}

	public void addSS() {
		// TODO Auto-generated method stub
		
	}


}

