package ParkingLotSystemDesign;

// Driver Code
public class DriverCode {
 // Execution starts from main() method
 public static void main(String[] args) {
	
 Vehicle vehicleMotorCycle = new MotorCycle(8796,"MotorCycle");
 
 ParkingSpot parkingSpot=new ParkingSpot(1,vehicleMotorCycle,"MotorCycleParkingSpot");
 
 Vehicle vehicleCar=new Car(8293,"Car");
 ParkingSpot parkingSpot2=new ParkingSpot(2,vehicleCar,"CarParkingSpot");
 
 System.out.println(parkingSpot.getParkingSpotID());
 System.out.println(parkingSpot.getParkingSpotType());
 System.out.println(parkingSpot.getVehicleType());
 System.out.println(parkingSpot.getVehicleRegistrationNumber());
 
 System.out.println(parkingSpot2.getParkingSpotID());
 System.out.println();
 
	 
}
}
