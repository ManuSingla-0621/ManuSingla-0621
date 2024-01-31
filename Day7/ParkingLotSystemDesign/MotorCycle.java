package ParkingLotSystemDesign;

//create a class MotorCycle which us sub-class of Vehicle(Is-A relationship)
public class MotorCycle extends Vehicle{

	// creating a default constructor
	public MotorCycle() {
		
	}
	
	// creating the parameterized constructor which is calling base class parametrized constructor..
	public MotorCycle(int registerNumber,String vehicleType)
	{
		 super(registerNumber,vehicleType);
	}
	
}
