package ParkingLotSystemDesign;

// create a class car which us sub-class of Vehicle(Is-A relationship)
public class Car extends Vehicle{

	// creating a default constructor
	public Car()
	{
		
	}
	
	// creating the parameterized constructor which is calling base class parametrized constructor...
	public Car(int registerNumber,String vehicleType)
	{
		 super(registerNumber,vehicleType);
	}
	
}
