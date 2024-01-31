package ParkingLotSystemDesign;
// create a sub-class of the Parking spot
public class CompactParkingSport extends ParkingSpot{
	// creating the parameterized constructor which is calling base class parametrized constructor..
	public CompactParkingSport(int parkingSpotID,Vehicle vehicle,String parkingSpotType)
	{
		super(parkingSpotID,vehicle,parkingSpotType);
	}
	
}
