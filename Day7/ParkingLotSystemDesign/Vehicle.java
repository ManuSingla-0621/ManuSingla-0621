package ParkingLotSystemDesign;

// create the class of the vehicle
public class Vehicle {
   
	private int registerNoOfVehicle;
	private String vehicleType;
	
	public Vehicle()
	{
		
	}
	
	//setting the data members of Vehicle 
	public Vehicle(int registerNoOfVehicle,String vehicleType)
	{
		this.registerNoOfVehicle=registerNoOfVehicle;
		this.vehicleType=vehicleType;
	}
	
	// return the register no of the vehicle
	public int getRegisterNumber()
	{
		return registerNoOfVehicle;
	}
	
	// return the vehicle type which its belongs to
	public String getVehicleType()
	{
		return vehicleType;
	}
	
}
