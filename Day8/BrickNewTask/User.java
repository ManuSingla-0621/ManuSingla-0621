package BrickNewTask;
// create user class which is extends from the Parent class
public class User extends Parent{

	// instance-variables of the User
	private String userName;
	private String userGender;
	private String userAgeString;
	
	// getting up the userName
	public String getUserName() {
		return userName;
	}
    
	// setting up the userName 
	public void setUserName(String userName) {
		this.userName = userName;
	}

	// getting up the userGender
	public String getUserGender() {
		return userGender;
	}

	// setting up the user gender
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	// getting the age in the form of the string
	public String getUserAgeString() {
		return userAgeString;
	}
    
	// setting the userAge which are String type
	public void setUserAgeString(String userAgeString) {
		this.userAgeString = userAgeString;
	}

	// create the constructor of the User
	public User(String userName,String userGender,String userAgeString)
	{
		this.userName=userName;
		this.userGender=userGender;
		this.userAgeString=userAgeString;
	}
}
