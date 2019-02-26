package com.mycompany.a1;
import java.util.ArrayList;
import java.util.Iterator;

public class GameWorld {

	private ArrayList<GameObject> list;
	GameObjIterator iterator;
	public void init() 
	{
		//code here to create the initial game objects/setup
	}
	
	/*
	 * additional methods here to manipulate world objects and related game state data
	 */
	public GameWorld() {
		// TODO Auto-generated constructor stub
	}

	public void eliminate() {
		// TODO Auto-generated method stub
		
	}

	public class GameObjIterator implements Iterator<Object>
	{
		private int index;
		
		public GameObjIterator()
		{
			index = -1;
		}
		
		@Override
		public boolean hasNext()
		{
			if(list.size() <= 0)
				return false;
			if(index == list.size() -1)
			{
				index = -1;
				return false;
			}
			return true;
		
		}
		
		@Override
		public Object next()
		{
			index++;
			return list.get(index);
		}
		
		@Override
		public void remove()
		{
			list.remove(index);
			index--;
		}
		
		public void ResetIndex()
		{
			index = -1;
		}
		
		public Object current()
		{
			if(index >= 0)
			{
				if(index >= 0)
					return list.get(index);
			}
			return null;
		}
	}
}

