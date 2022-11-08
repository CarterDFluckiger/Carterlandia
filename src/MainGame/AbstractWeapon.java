package MainGame;

import java.util.Random;

public class AbstractWeapon implements Weapon
{
	private String name;
	private int weaponDamage;
	private final static double DAMAGE_MULTIPLIER = 1.5;
	
	public AbstractWeapon(String givenName, int givenWeaponDamage)
	{
		name = givenName;
		weaponDamage = givenWeaponDamage;
	}

	@Override
	public Weapon getWeapon() {
		return this;
	}
	
	@Override
	public String getName()
	{
		return name;
	}
	
	@Override
	public double getWeaponDamage()
	{
		return weaponDamage;
	}
	
	@Override
	public double getDamageDone()
	{
		double finalDamage = weaponDamage;
		Random rand = new Random();
		int random = rand.nextInt(10);
		
		if(random == 0)
		{
			finalDamage = (weaponDamage * DAMAGE_MULTIPLIER);
		}
		
		return finalDamage;
	}
}