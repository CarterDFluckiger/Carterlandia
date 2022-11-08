package EntityAbstract;


import MainGame.AbstractEntity;
import MainGame.Weapon;

public class Player extends AbstractEntity
{
	private int health;
	
	
	public Player(String getName, String givenDescription, boolean givenIsLiving, boolean givenIsAlive, int givenHealth) 
	{
		super(getName, givenDescription, givenIsLiving, givenIsAlive);
		health = givenHealth;	
	}
	
	public Player getPlayer()
	{
		return this;
	}
	
	public void setHealth(int h)
	{
		health = h;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	public void alterHealth(int h)
	{
		health += h;
	}
	
	public Weapon getWeapon()
	{
		return this.getWeapon();
	}	
}
