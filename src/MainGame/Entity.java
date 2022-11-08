package MainGame;

public interface Entity
{
	public String getName();
	public String getDescription();
	
	public boolean getLiving();
	public boolean getAlive();
	public void setAlive(boolean e);
	public Weapon getWeapon();
	public Entity getEntity();
}
