package ParkingLotSystemDesign;

// creating the class Van which is sub-class of vehicle
public class Van extends Vehicle{

	   // creating a default constructor
		public Van()
		{
			
		}
		// creating a parameterized constructor which is calling the base class parameterized constructor
		public Van(int registerNumber,String vehicleType)
		{
		   super(registerNumber,vehicleType);
		}
	
}
