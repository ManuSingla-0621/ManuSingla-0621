package BrickNewTask;

import java.util.ArrayList;

public class MiddleWare  {

	private ArrayList<Brick> bricks;
	private String message;
	private Location location;
	private String commentString;
	
	public MiddleWare(ArrayList<Brick> bricks,String messageString,Location location,String comments)
	{
		this.bricks=bricks;
		this.message=messageString;
		this.location=location;
		this.commentString=comments;
	}
	
	// add the brick
	public void addBrick()
	{
		bricks.add(new Brick(message, location, commentString));
	}
	
	// remove the brick
	public void removeBrick()
	{
		
	}
	
	// add the comments on the brick
	public void addComment()
	{
		
	}
	
	// delete a brick
	public void deleteBrick()
	{
		
	}
	
	// edit the comment on the brick
	public void editCommentOnBrick()
	{
		
	}
}
