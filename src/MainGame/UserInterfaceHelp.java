package MainGame;

import java.util.Scanner;

import EntityAbstract.Player;

public class UserInterfaceHelp 
{
	public UserInterfaceHelp()
	{
		
	}

	public Player createPlayer()
	{
		boolean done = true;
		
		String name = "";
		String description = "";
		boolean isAlive = false;
		boolean isLiving = false;
		
		Scanner scan = new Scanner(System.in).useDelimiter("\\n");
		System.out.println("Hello and welcome to the game.  To begin creating your player please type your name: ");
		do
		{
		try
		{
			name = scan.next();
			done = false;
		}
		catch(Exception e)
		{
			System.out.println("Sorry, that input is not valid. Please input a valid name: ");
		}
		}while(done);
		
		done = true;
		System.out.println("Now input a short description word for your character: ");
		do
		{
			try
			{
				description = scan.next();
				done = false;
				
				
				done = false;
			}
			catch(Exception e)
			{
				System.out.println("Sorry, that input is not valid. Please input a valid description: ");
			}
			
		}while(done);
		
		done = true;
		System.out.println("Now input whether or not you would like your character to be a 'living' being(zombie would not be living). 'true' for living and 'false' for undead: ");
		
		do
		{
			try
			{
				isLiving = scan.hasNextBoolean();
				done = false;
				
			}
			catch(Exception e)
			{
				System.out.println("Sorry, that input is not valid. Please input a valid answer(ie 'true' or 'false') and be careful to not have a space: ");
			}
		}while(done);
		
		
		System.out.println("Congratulation you have succefully created your player! Welcome to the world!");
		
		Player p = new Player(name, description, isLiving, true, 100);
		
		return p;
	}
	
	
}
