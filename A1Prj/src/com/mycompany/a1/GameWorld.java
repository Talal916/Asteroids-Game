package com.mycompany.a1;
import java.util.Random; 
import java.util.Vector;

public class GameWorld {

	
	
	private Vector<GameObject> gameObjs = new Vector<GameObject>();
	
	private int score;
	private int elapsedTime;
	private int playerLives;
	private boolean endGame;
	
	
	
	public PlayerShip findPS()
	{
		for(int i=0; i < gameObjs.size(); i++)
		{
			if(gameObjs.get(i) instanceof PlayerShip)
			{
				return (PlayerShip) gameObjs.get(i);
			}
		}
		System.out.println("No Player Ship found!");
		return null;
	}
	
	
	public MissileLauncher findML()
	{
		for(int i=0; i < gameObjs.size(); i++)
		{
			if(gameObjs.get(i) instanceof MissileLauncher)
			{
				return (MissileLauncher) gameObjs.get(i);
			}
		}
		System.out.println("No Missile Launcher found!");
		return null;
	}
	
	public EnemyShip findES()
	{
		for(int i=0; i < gameObjs.size(); i++)
		{
			if(gameObjs.get(i) instanceof EnemyShip)
			{
				return (EnemyShip) gameObjs.get(i);
			}
		}
		System.out.println("No Enemy Ship found!");
		return null;
	}
	
	public Asteroid findAst() //finds Asteroid and returns index of Asteroid
	{
		for(int i=0; i < gameObjs.size(); i++)
		{
			if(gameObjs.get(i) instanceof Asteroid)
			{
				return (Asteroid) gameObjs.get(i);
			}
		}
		System.out.println("No Asteroid found!");
		return null;
	}
	
	public Missile findMissile() //finds Asteroid and returns index of Asteroid
	{
		for(int i=0; i < gameObjs.size(); i++)
		{
			if(gameObjs.get(i) instanceof Missile)
			{
				return (Missile) gameObjs.get(i);
			}
		}
		System.out.println("No Missile found!");
		return null;
	}
	
	
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
			PlayerShip s = new PlayerShip();
			gameObjs.add(s);
			System.out.println("A Player Ship has been created and added to game world!");
			break;
			
			
			 
		}
		
	}
	
	

	public void changeSpeed(char c) {
		if(findPS() != null)
		{
			findPS().changeSpeed(c); //finds player ship, and changes speed
		}
	}

	public void turnPS(char c) {
		if(findPS() != null)
		{
			findPS().turnPS(c); //finds player ship, and changes dir
		}		
	}

	public void turnML() {
		if(findML() != null)
		{
			findML().turn(); //finds missile launcher, turns it
		}			
	}

	public void firePMissile() {
		if(findML() != null)
		{
			findPS().fireMissile(); //finds missile launcher, fires PS missile
		}			
	}

	public void fireEMissile() {
		if(findES() != null)
		{
			findES().fire();; //finds ES, fires missile
		}			
	}

	public void resetPos() {
		if(findPS() != null)
		{
			findPS().resetPos(); //finds PS and resets position to center of screen		
		}		
	}
		
	

	public void loadPMissile() {
		if(findPS() != null)
		{
			findPS().reloadMissiles(); //finds PS and reloads PS missiles
		}		
	}

	public void removeAsteroid() {
		if(findAst() != null)
		{
			gameObjs.remove(findAst()); //finds first asteroid and removes that asteroid
		}		
	}		
	

	public void missileStrikePS() {
		if(findPS() != null && findMissile() != null)
		{
			gameObjs.remove(findPS());
			gameObjs.remove(findMissile());
		}
		System.out.println("Sorry, a missile struck your ship and destroyed it!");		
	}

	public void asteroidStrikePS() {
		if(findPS() != null && findAst() != null)
		{
			gameObjs.remove(findPS());
			gameObjs.remove(findAst());
			playerLives--;
		}		
	}

	public void NPSStrikePS() {
		if(findES() != null && findPS() != null)
		{
			gameObjs.remove(findPS());
			gameObjs.remove(findES());
			playerLives--;
		}				
	}

	public void asteroidCollision() {
		if(findAst() != null)
		{
			gameObjs.remove(findAst());
			gameObjs.remove(findAst());
		}
		
	}

	public void asteroidStrikeNPS() {
		if(findES() != null && findAst() != null)
		{
			gameObjs.remove(findES());
			gameObjs.remove(findAst());
		}				
	}

	public void clkTick() {
     /*
      * Things to do when clock ticks-
      * - move objects, check fuel levels of missiles
      * - have spaceshipp blink
      * -tick the clock
      */
		elapsedTime++;
		
		for(int i=0; i < gameObjs.size(); i++)
		{
			if(gameObjs.get(i) instanceof IMoveable)
			{
				((IMoveable) gameObjs.get(i)).move(); //finding each moveable object and moving it
				if(gameObjs.get(i) instanceof Missile)
					if(((Missile)gameObjs.get(i)).getFuel() == 0)
						gameObjs.remove(i); //if object is missile and fuel level is 0, remove it.
			}
			else if(gameObjs.get(i) instanceof SpaceStation)
			{
				((SpaceStation) gameObjs.get(i)).blinkCounter(); //increase blink counter on space ship
			}
		}
	}

	public void printGameState() {
		System.out.println("Score: "+ score);
		System.out.println("Missiles Left: "+findPS().getMissileCount());
		System.out.println("Game Time: " + elapsedTime +"\n");
	}

	public void printGameMap() {
		for(int i=0; i <  gameObjs.size(); i++)
		{
			System.out.println(gameObjs.get(i));
		}
		
	}




}

