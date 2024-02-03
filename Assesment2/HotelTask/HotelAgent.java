package HotelTask;

// create the class of HotelAgent which is extends from user
public class HotelAgent extends User{
  
	// constructor of the Hotel Agent which is calling the base class constructor
	public HotelAgent(String userName,String userPassword,int userAge,char userGender,int userID)
	{
		super(userName,userPassword,userAge,userGender,userID,UserRole.HotelAgent);
	}
	
	// adding or update the Hotel Details 
	public void addOrUpdateHotelDetails(Hotel hotel, HotelManagement hotelManagement) {
        if (!hotelManagement.getHotels().contains(hotel)) {
            hotelManagement.getHotels().add(hotel);
        }
    }
	
}
