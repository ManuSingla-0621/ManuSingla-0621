package BrickNewTask;

// create a owner class
public class Owner extends Parent{

	// create the instance of owner class
	private String ownerName;
	private String ownerGender;
	private String ownerAge;
	
	// setters and getters 
	public String getUserName() {
		return ownerName;
	}
    // set the owner name
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
    // getting up the owner gender
	public String getOwnerGender() {
		return ownerGender;
	}
    // setting up the owner gender
	public void setOwnerGender(String ownerGender) {
		this.ownerGender = ownerGender;
	}

	// returning the user Age
	public String getUserAgeString() {
		return ownerAge;
	}

	/// setting up the user Age
	public void setUserAgeString(String ownerAge) {
		this.ownerAge = ownerAge;
	}

	// constructor of owner class to setting up the values
	public Owner(String ownerName,String ownerGender,String ownerAge)
	{
		this.ownerName=ownerName;
		this.ownerGender=ownerGender;
		this.ownerAge=ownerAge;
	}
	
	// displaying the owner information
	public void displayInfo()
	{
		System.out.println("The name of the owner is : "+ownerName);
		System.out.println("The gender of the owner is : "+ownerGender);
		System.out.println("The age of the owner is : "+ownerAge);
	}
	
}
