package MainGame;

public interface Map 
{
	public Map getMap();
	public String getName();
	public void printMap();
	public void updateMap();
	public void readInMap(String stringMap);
	public String getDescription();
	public void getKey();
}
