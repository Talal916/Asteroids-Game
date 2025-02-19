package com.mycompany.a1;

public class EnemyShip extends MoveableGameObject{

	private int size;
	private int missileCount;

	public EnemyShip()
	{
		size = (rand.nextInt(2)+1)*10;
		missileCount  = 2;
		setColor(255,255,0); //enemy ships are yellow

	}
	
	public int getSize()
	{
		return size;
		
	}
	
	public int getMissileCount()
	{
		return missileCount;
	}
	
	public Missile fire()
	{
		missileCount--;
		Missile bogey = new Missile(getDirection(),getLocation(),false);
		System.out.println("A missile has been fired from an Enemy Ship!");

		return bogey;
	}
	
	
	
	public String toString()
	{
		String parentDesc = super.toString();
		String myDesc = " size = "+size + " || Missiles Left: "+missileCount;
		String retval = "Non-Player Ship: "+ parentDesc+myDesc;
		
		return retval;
	}
	@Override
	public void Move()
	{
		super.Move();
	}

}
