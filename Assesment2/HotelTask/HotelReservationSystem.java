package HotelTask;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class HotelReservationSystem {
    public static void main(String[] args) {
    	// create the object of the scanner class
    	Scanner scanner = new Scanner(System.in);
      try {
    	// create the object of the Hotel Management
        HotelManagement hotelManagement = new HotelManagement();
 
        // create the object of the administrator , agent and normalUser
        Administartor admin = new Administartor("admin", "adminpass",45,'M',321);
        HotelAgent agent = new HotelAgent("agent1", "agentpass",24,'F',653);
        NormalUser normalUser = new NormalUser("user1", "userpass",34,'M',78);

        // registering the admin,agent and the normal user if they directly vsit
        hotelManagement.registerUser(admin);
        hotelManagement.registerUser(agent);
        hotelManagement.registerUser(normalUser);
        
        // number of the hotel which are available at that list
        Hotel hotel1 = new Hotel("Raddison Blue", "Mumbai", 50, List.of("Wifi", "Parking","Bruch","Dinner","Mumbai","Spa"),4.0);
        Hotel hotel2=new Hotel("Hyatt Regency ", "Delhi", 2, List.of("Suite","Hall","Late Night Dinner","Wisky Bar","Delhi"),3.8);
        Hotel hotel3 = new Hotel("The Palm Court", "Ludhiana", 34, List.of("Swimming Pool","Gym","Suite","open Roof Top","Ludhiana"),3.6);
        
        // agent will be the add/update the details
      	agent.addOrUpdateHotelDetails(hotel1, hotelManagement);
      	agent.addOrUpdateHotelDetails(hotel2, hotelManagement);
      	agent.addOrUpdateHotelDetails(hotel3, hotelManagement);

      	// hotelManagement  is approved the best of the hotels
        hotelManagement.approveHotelDetails(hotel1);
        hotelManagement.approveHotelDetails(hotel3);

        hotelManagement.displayHotelDetails();
        System.out.println("Please type the facilities which you need mention in the avialable"
        		+ "hotels like [Gym,Swimming Pool,Wifi,Parking,Suite,Hall,Delhi,Mumbai,Ludhiana]");
        String searchCriteria = scanner.nextLine();
        List<Hotel> resultHotels = hotelManagement.listHotels(searchCriteria);
        
        // hotel management is display all the details
        hotelManagement.displayHotelDetails();
        
        // if according the search criteria the available hotels are displaying
        if (!resultHotels.isEmpty()) {
            System.out.println("Please! select the hotel from available list ");
            for (int i = 0; i < resultHotels.size(); i++) {
                System.out.println(resultHotels.get(i).getName());
            }
            System.out.println();
            System.out.println("Please select the hotel according the number which is in numbers "
            		+ "according to the display on the console");
            int selection = scanner.nextInt();
            if (selection >= 1 && selection <= resultHotels.size()) {
                normalUser.bookHotelRoom(resultHotels.get(selection - 1), hotelManagement);
            } else {
            	// invalid selection
                System.out.println("Invalid selection.");
            }
        } else {
        	// no hotel founding according to the criteria
            System.out.println("No hotels found matching the criteria.");
        }
    }
      catch(InputMismatchException exception)
      {
    	  // caught the exception
    	  System.out.println("You are not giving the required data type values to the variable.");
    	  System.out.println("Please once check it out");
      }
      catch(Exception e)
      {
    	  // carrying all the exception
    	  System.out.println("The whole scenario of the getting ecception: ");
    	  e.printStackTrace();
      }
      finally { // blocks runs everytime if their is exception or not getting exception
		scanner.close(); // close the resource so that resource leakage is not happening
	}
    }
}
