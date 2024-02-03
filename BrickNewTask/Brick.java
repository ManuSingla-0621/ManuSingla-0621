package BrickNewTask;


// create a class of the brick
public class Brick {

	// instance variable of the Brick
	private String messageOnBrick;
	private Location location;
	private String comments;
	private boolean isVisible;
	
	// creating the constructor of the class to setting up the value
	public Brick(String messageOnBrick,Location location,String commentString)
	{
		this.messageOnBrick=messageOnBrick;
		this.location=location;
		this.comments=commentString;
	}
	
	// setters and getters method 
	
	// return weather that walls is visible or not
	public boolean isVisibleOrNot()
	{
		return isVisible;
	}
	
	// return the message on the brick
    public String getMessage()
    {
    	return messageOnBrick;
    }
    
    // setting up the visibility on the brick
    public void setVisible(boolean visible)
    {
       isVisible=visible;
    }
    
    // adding the comments on the brick
    public void addComments(String comments)
    {
    	this.comments=comments;
    }
}
