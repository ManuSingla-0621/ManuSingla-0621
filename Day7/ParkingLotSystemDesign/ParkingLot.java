package ParkingLotSystemDesign;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
  
	private String name;
	private String location;
	private int age;
	
	private final int maxHandicappedSpots;
	private final int maxCompactSpots;
	private final int maxLargeSpots;
	private final int maxMotorCycleSpots;
	private final int maxElectricCarSpots;
	private int floor;
	private HashMap<String, ParkingFloor> parkingFloors;
	
	public ParkingLot(String name,String location,int age,int floor, int maxHandicappedSpots,int maxCompactSpots,int maxLargeSpots,int maxMotorCycleSpots,int maxElectricCarSpots)
	{
		this.name=name;
		this.location=location;
		this.age=age;
		this.floor=floor;
		this.maxCompactSpots=maxCompactSpots;
		this.maxHandicappedSpots=maxHandicappedSpots;
		this.maxLargeSpots=maxLargeSpots;
		this.maxMotorCycleSpots=maxMotorCycleSpots;
		this.maxElectricCarSpots=maxElectricCarSpots;
	}
	
	public void  printingInformation()
	{
		System.out.println("The name of the customer : "+name);
		System.out.println("The age of the customer is : "+age);
		System.out.println("The location of the parking lot is : "+location);
		System.out.println("The max capacity of the compact spots are : "+maxCompactSpots);
		System.out.println("The max capacity of the handicapped spots are : "+maxHandicappedSpots);
		System.out.println("The max capacity of the large spots are : "+maxLargeSpots);
		System.out.println("The max capacity of the motorcycle spots are : "+maxMotorCycleSpots);
		System.out.println("The max capacity of the electric spots are : "+maxElectricCarSpots);
	}
	
	// capacity of the parking lot
	public void totalCapacityOfParkingLot()
	{
		System.out.println(floor*(maxHandicappedSpots+maxCompactSpots+maxLargeSpots+maxMotorCycleSpots+maxElectricCarSpots));
}
	// vacant spaces left in parking lot 
	public void vacantSpacesOfParkingLot()
	{
		
	}
}
