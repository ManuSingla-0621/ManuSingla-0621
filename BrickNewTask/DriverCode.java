package BrickNewTask;

public class DriverCode {
	// create a driver code(Execution start from here)
 public static void main(String[] args) {
	 // stteing up the location
	Location location=new Location("Ludhiana","Punjab" , 10);
	// setting up the brick
	Brick brick=new Brick("SUPER BRICK", null, "PRETTY BRick");
	
	// parent of the user,admin and visitor class
	Parent parent = new User("Manu", "M", "21");
	Owner owner= new Owner("Ram", "77", "M");
	// display the info of the owner
	owner.displayInfo();
}
}
