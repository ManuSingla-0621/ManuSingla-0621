package ParkingLotSystemDesign;
// creating a class Truck which is sub-class of the Vehicle(Is-A relationship)
public class Truck extends Vehicle{

	// creating a default constructor
	public Truck()
	{
		
	}
	// creating a parameterized constructor which is calling the base class parameterized constructor
	public Truck(int registerNumber,String vehicleType)
	{
	   super(registerNumber,vehicleType);
	}
	
}
