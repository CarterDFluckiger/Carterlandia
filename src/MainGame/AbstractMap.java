package MainGame;

import java.util.Scanner;

public class AbstractMap implements Map
{
	private String name;
	private String description;
	private String stringMap;
	private String[][] map = new String[10][10];
	
	public AbstractMap(String givenName, String givenDescription, String givenMap)
	{
		name = givenName;
		description = givenDescription;
		stringMap = givenMap;
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
	public void printMap()
	{
		for(int j = 0; j < 10; j++)
		{
			System.out.println();
			for(int i = 0; i < 10; i++)
			{
				System.out.print(map[j][i] + " ");
			}
		}
		System.out.println();
	}
	@Override
	public void readInMap(String stringMap)
	{
		Scanner scan = new Scanner(stringMap);
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				map[i][j] = scan.next();
			}
		}
	}
	@Override
	public Map getMap()
	{
		return this;
	}

	@Override
	public void updateMap() 
	{
		
	}
	
	@Override
	public void getKey()
	{
		System.out.println("| = wall"
				+ "\n" + "- = wall" + "\n" + "X = ");
	}
	
}
