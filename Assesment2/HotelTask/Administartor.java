package HotelTask;

// create the class of the Administrator which is extends from the User
public class Administartor extends User{
	
	// create the constructor of the administrator class
	public Administartor(String userName,String userPassword,int userAge,char userGender,int userID)
	{
		super(userName,userPassword,userAge,userGender,userID,UserRole.Administrator);
	}
	
	// approving the hotel
	public void approveHotelDetails(Hotel hotel)
	{
		hotel.setApproved(true);
		System.out.println("Hotel details approved successfully!");
	}
	
	// adminstartor can delete the user and the hotel details
	public void deleteDetails(User user,Hotel hotel,HotelManagement hotelManagement) // delete the details of the user
	{
		if(user.getUserRole()==UserRole.NormalUser)
		{
			hotelManagement.getUsers().remove(user);
		}
		else if(user.getUserRole()==UserRole.HotelAgent)
		{
			hotelManagement.getAgents().remove(user);
		}
		
		if(hotel!=null)
		{
			hotelManagement.getHotels().remove(hotel);
		}
	}
	
	// display the reservation status
	public void displayReservationStatus(Hotel hotel)
	{
		System.out.println("Reservation Status for "+ hotel.getName() + ":");
		System.out.println("Number of Available Rooms : "+hotel.getNumberOfRooms());
		System.out.println("------------------------------------------------------");
	}

}
