package MainGame;

import EntityAbstract.Player;

public interface Game 
{
	public Map getMap();
	public Weapon getWeapon();
	public Player getPlayer();
	public Game getGame();
	public void updateGame();
	public void endGame();
	
}
