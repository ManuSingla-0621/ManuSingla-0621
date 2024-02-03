package HotelTask;

import java.util.Scanner;

// create the normal user class which is extends from the user class
class NormalUser extends User {
    
	// setting up the password
	private String password;

	// create the parameterized constructor of the Normal user
	public NormalUser(String userName,String userPassword,int userAge,char userGender,int userID)
	{
		super(userName,userPassword,userAge,userGender,userID,UserRole.NormalUser);
	}
	
    // normal user can book the hotel room 
	public void bookHotelRoom(Hotel hotel, HotelManagement hotelManagement) {
        if (hotel.isApproved() && hotel.getNumberOfRooms() > 0) {
            hotel.setNumberOfRooms(hotel.getNumberOfRooms() - 1);
            System.out.println("Room Booked sucessfully");
        }
        else  // if the hotel is not approved else rooms are not available at given instant of time
        {
        	System.out.println("Booking failed either the hotel is not approved or no rooms available");
        }
    }

	// normal user can modify the details according to the need
    public void modifySelfDetails(HotelManagement hotelManagement) {
        Scanner scanner = new Scanner(System.in);// creating the object of the scanner class
        System.out.println("Enter new password: ");
        String newPassword = scanner.nextLine();
        this.password = newPassword;
        scanner.close(); // to close the resource,so that resource leakage is happen
    }
    
    // normal user can provided the feedback to the hotel
    public void provideFeedback(Hotel hotel)
    {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter your feedback and rating for "+hotel.getName()+":");
    	String feedback=scanner.nextLine();
    	hotel.addFeedback(feedback);
    	System.out.println("Feedback submitted successfully!");
    }
    
}
