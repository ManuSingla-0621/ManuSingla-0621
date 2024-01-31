package ParkingLotSystemDesign;

//create a sub-class of the parking spot
public class ElectricParkingSpot extends ParkingSpot {

	// create a parameterized constructor so that calling the super class constructor
	public ElectricParkingSpot(int parkingSpotID,Vehicle vehicle,String parkingSpotType)
	{
		super(parkingSpotID,vehicle,parkingSpotType);
	}
	
}
