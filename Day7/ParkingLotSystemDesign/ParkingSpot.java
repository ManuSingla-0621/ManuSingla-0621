package ParkingLotSystemDesign;

// create a class of Parking spot
public class ParkingSpot {

	private int parkingSpotID;
	private boolean isParkingSpotAvailable;
	private Vehicle vehicle;
	private String parkingSpotType;
	
	public ParkingSpot()
	{
		
	}
	
	public ParkingSpot(int parkingSpotID,Vehicle vehicle, String parkingSpotType)
	{
		this.parkingSpotID=parkingSpotID;
		this.isParkingSpotAvailable=true;
		this.vehicle=vehicle;
		this.parkingSpotType=parkingSpotType;
	}
	
	public int getVehicleRegistrationNumber()
	{
		return this.vehicle.getRegisterNumber();
	}
	
	public boolean isSpotFree()
	{
		return this.isParkingSpotAvailable;
	}
	
	public String getParkingSpotType()
	{
		return this.parkingSpotType;
	}
	
	public int getParkingSpotID()
	{
		return this.parkingSpotID;
	}
	
	public String getVehicleType()
	{
		return this.vehicle.getVehicleType();
	}
	
	public void assignVehicleToSpot(Vehicle vehicle)
	{
		this.vehicle=vehicle;
		this.isParkingSpotAvailable=false;
	}
	
	public void removeVehicleToSpot(Vehicle vehicle)
	{
		this.vehicle=vehicle;
		this.isParkingSpotAvailable=true;
	}

}
