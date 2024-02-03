package HotelTask;


import java.util.ArrayList;
import java.util.List;

// create the class of the Hotel Management
class HotelManagement {
	// instance variable of the Hotel Management
    private List<User> users;
    private List<Hotel> hotels;
    private List<User> agents;

    // constructor of the HotelManagement
    public HotelManagement() {
        this.users = new ArrayList<>();
        this.hotels = new ArrayList<>();
        this.agents = new ArrayList<>();
    }

    // return the list of the users
    public List<User> getUsers() {
        return users;
    }

    // return the all the list of the hotels
    public List<Hotel> getHotels() {
        return hotels;
    }

    // returning the list of the agents available 
    public List<User> getAgents() {
        return agents;
    }

    // registering the user
    public void registerUser(User user) {
        users.add(user);

        if (user.getUserRole() == UserRole.HotelAgent) {
            agents.add(user);
        }
    }

    // return the list of the hotels available according to criteria
    public List<Hotel> listHotels(String criteria) {
        List<Hotel> filteredHotels = new ArrayList<>();
        for (Hotel hotel : hotels) {
            if (hotel.getLocation().equals(criteria) || hotel.getFaciLities().contains(criteria)) {
                filteredHotels.add(hotel);
            }
        }
        return filteredHotels;
    }

    // approve the details of the hotel
    public void approveHotelDetails(Hotel hotel) {
        hotel.setApproved(true);
    }

   
    
    // displaying the all the hotels which are avilable and their details
    public void displayHotelDetails()
	{
    	System.out.println("The list of the Hotels available : ");
		for(Hotel hotel:hotels)
		{
			System.out.println("*********************************************");
			System.out.println("Hotel Name : "+hotel.getName());
			System.out.println("Location : "+hotel.getLocation());
			System.out.println("Number of Rooms available : "+hotel.getNumberOfRooms());
			System.out.println("Facilities Provided : "+hotel.getFaciLities());
			System.out.println("Approved : "+hotel.isApproved());
			System.out.println("Average Rating : "+hotel.getAverageRating());
		}
		System.out.println("**************************************************");
	}
    
    
}
