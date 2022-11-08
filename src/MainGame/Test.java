package MainGame;

import java.util.Random;
import java.util.Scanner;

import MainGame.Weapon;
import MainGame.Entity;
import EntityAbstract.Player;

public class Test {

	public static void main(String[] args) 
	{
		
			
					String map = "- - - - - - - - - -"
						+ "\n" + "| X X X X X X X X |"
						+ "\n" + "| X X X X X X X X |"
						+ "\n" + "| X X X X X X X X |"
						+ "\n" + "| X X X X X X X X |"
						+ "\n" + "| X X X X X X X X |"
						+ "\n" + "| X X X X X X X X |"
						+ "\n" + "| X X X X X X X X |"
						+ "\n" + "| X X X X X X X X |"
						+ "\n" + "- - - - - - - - - -";
		
		
		AbstractMap m = new AbstractMap("Iowa", "Flat", map);
		m.readInMap(map);
		m.printMap();
		
		UserInterfaceHelp y = new UserInterfaceHelp();
		Player p = y.createPlayer();
	
		 
		do
		{
			
		}while(false);
		
	}
}
