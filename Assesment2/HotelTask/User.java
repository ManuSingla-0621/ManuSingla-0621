package HotelTask;

// create the Parent class for the all the type of the users 
public class User {

	// create the instance variables of the user class 
	private String userName;
	private int userAge;
	private char userGender;
	private int userID;
	private String userPassword;
	private UserRole userRole;
	
	// create the parameterized constructor for the user class to initilialize all the variables
	public User(String userName,String userPassword,int userAge,char userGender,int userID,UserRole userRole)
	{
		this.userName=userName;
		this.userPassword=userPassword;
		this.userAge=userAge;
		this.userGender=userGender;
		this.userID=userID;
		this.userRole=userRole;
	}

	// returning the name of the user
	public String getUserName() {
		return userName;
	}
	
    // setting the name of the user
	public void setUserName(String userName) {
		this.userName = userName;
	}

	// getting the age of the user
	public int getUserAge() {
		return userAge;
	}

	// settti g the age of the user
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	// getting the gender of the user
	public char getUserGender() {
		return userGender;
	}

	// setting the gender of the user
	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}

	// getting the userID of the particular type of the user
	public int getUserID() {
		return userID;
	}

	// setting up the userID of the user
	public void setUserID(int userID) {
		this.userID = userID;
	}

	// getting the type of the Role of the user
	public UserRole getUserRole() {
		return userRole;
	}

	// setting the type of the role of the user
	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}
	
	// getting the password of the user
	public String getUserPassword() {
		return userPassword;
	}

	// setting up the password of the user
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}
