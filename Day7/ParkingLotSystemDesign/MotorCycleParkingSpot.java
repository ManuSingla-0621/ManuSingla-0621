package ParkingLotSystemDesign;

// create a sub-class of the ParkingSpot
public class MotorCycleParkingSpot extends ParkingSpot{

// creating the parameterized constructor which is calling base class parametrized constructor..
	public MotorCycleParkingSpot(int parkingSpotID,Vehicle vehicle,String parkingSpotType)
	{
		super(parkingSpotID,vehicle,parkingSpotType);
	}
}
