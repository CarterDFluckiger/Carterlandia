package EntityAbstract;

import MainGame.AbstractEntity;
import MainGame.Weapon;

public class Entity extends AbstractEntity
{
	private int health;
	private String phrase;
	
	public Entity(String getName, String givenDescription, boolean givenIsLiving, boolean givenIsAlive, int givenHealth, String catchPhrase)
	{
		super( getName, givenDescription, givenIsLiving, givenIsAlive );
		health = givenHealth;
		phrase = catchPhrase;
	}
	
	public Entity getEntity()
	{
		return this;
	}
  
	public void setHealth( int h )
	{
		health = h;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	public void setPhrase( String s )
	{
		phrase = s;
	}
	
	public String getPhrase()
	{
		return phrase;
	}
	
	public Weapon getWeapon()
	{
		return this.getWeapon();
	}

}
