package MainGame;

public abstract class AbstractEntity implements Entity
{
	private String name;
	private String description;
	private boolean isLiving;
	private boolean isAlive;
	
	public AbstractEntity(String getName, String givenDescription, boolean givenIsLiving, boolean givenIsAlive)
	{
		name = getName;
		description = givenDescription;
		isLiving = givenIsLiving;
		isAlive = givenIsAlive;
	}
	
	@Override
	public Entity getEntity()
	{
		return this; 
	}
	

	@Override
	public String getName() 
	{
		return name;
	}

	@Override
	public String getDescription() 
	{
		return description;
	}

	@Override
	public boolean getLiving() 
	{
		return isLiving;
	}

	@Override
	public boolean getAlive() 
	{
		return isAlive;
	}
	
	@Override
	public void setAlive(boolean e)
	{
		isAlive = e;
	}

}
