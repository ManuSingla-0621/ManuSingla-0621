package BrickNewTask;

// create a location of the  city and country where wall are places
public class Location {

	// instance variable of city and string
	private String cityString;
	private String countryString;
	private int walls;
	
	// create the location constructor to set up the values in the instance variabels
	public Location(String cityString,String countryString,int walls)
	{
		this.cityString=cityString;
		this.countryString=countryString;
		this.walls=walls;
	}
}
