package Whatsapp;

// create a class of the Status
public class Status {
        // instance variables of the class
	    private User user;
	    private String content;
	    private StatusType type;

	    // constructor of parameterized constructor of the class 
	    public Status(User user, String content, StatusType type) {
	        this.user = user;
	        this.content = content;
	        this.type = type;
	    }
       
	    // get the User of info
	    public User getUser() {
	        return user;
	    }
	    
	    // getting the content
	    public String getContent() {
	        return content;
	    }

	    // status type of the user
	    public StatusType getType() {
	        return type;
	    }
}
