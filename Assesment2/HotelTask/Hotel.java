package HotelTask;

import java.util.ArrayList;
import java.util.List;

// create the class of the Hotel
public class Hotel {

	// create the instance variables of the Hotel
	private String name;
	private String location;
	private int numberOfRooms;
	private List<String> facilitiesProvided;
	private boolean approved;
	private List<String> feedbacks;
	private double averageRating;
	
	// create the constructor of the class
	public Hotel(String name,String location,int numberOfRooms,List<String> facilitiesProvided,double averageRating)
	{
		this.name=name;
		this.location=location;
		this.numberOfRooms=numberOfRooms;
		this.facilitiesProvided=facilitiesProvided;
		this.approved=false;
		this.feedbacks=new ArrayList<>();
		this.averageRating=averageRating;
	}
	
	//setting the number of the rooms
	public void setNumberOfRooms(int numberOfRooms)
	{
	  this.numberOfRooms=numberOfRooms;	
	}
	
	// getting the name of the hotel
	public String getName()
	{
		return name;
	}
	
	// getting up the feedbacks
	public List<String> getFeedbacks() {
		return feedbacks;
	}

	// setting up the feedback
	public void setFeedbacks(List<String> feedbacks) {
		this.feedbacks = feedbacks;
	}

	// getting up the average rating
	public double getAverageRating() {
		return averageRating;
	}

	// setting up the avaerage rating
	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}

	// getting the location of the hotel
	public String getLocation()
	{
		return location;
	}
	
	// getting the numberOf the room
	public int getNumberOfRooms()
	{
		return numberOfRooms;
	}
	
	// getting the facilities provided by the hotel
	public List<String> getFaciLities()
	{
		return facilitiesProvided;
	}
	
	// setting up that hotel is approved
	public void setApproved(boolean approved)
	{
		this.approved=approved;
	}
	
	// getting the hotel is approved 
	public boolean isApproved()
	{
		return approved;
	}

	// add the feedback to the hotel
	public void addFeedback(String feedback)
	{
		feedbacks.add(feedback);
	}
}
