package MainGame;

import EntityAbstract.Player;

public class ActualGame implements Game
{
	private Player p;
	private Map m;
	
	public ActualGame(Player p, Map m)
	{
		this.p = p;
		this.m = m;
	}

	@Override
	public Map getMap() 
	{
		return m;
	}

	@Override
	public Weapon getWeapon() 
	{
		return p.getWeapon();
	}

	@Override
	public Player getPlayer() 
	{
		return p;
	}

	@Override
	public Game getGame()
	{
		return this;
	}

	@Override
	public void updateGame() 
	{
		m.updateMap();
		//Need to add an update player
	}

	@Override
	public void endGame() 
	{
		

	}
	
	
	
}
