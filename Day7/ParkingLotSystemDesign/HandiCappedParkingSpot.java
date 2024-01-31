package ParkingLotSystemDesign;

// create a sub-class of the parking spot
public class HandiCappedParkingSpot extends ParkingSpot {
 // // creating the parameterized constructor which is calling base class parametrized constructor..
	public HandiCappedParkingSpot(int parkingSpotID,Vehicle vehicle,String parkingSpotType)
	{
		super(parkingSpotID,vehicle,parkingSpotType);
	}
	
}
