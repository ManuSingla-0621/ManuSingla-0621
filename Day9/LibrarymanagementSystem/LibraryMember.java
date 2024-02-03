package LibrarymanagementSystem;


// create a library member 
class LibraryMember {
	// creating the instance variables
    private int memberId;
    private String memberName;
    private static int maxBooksAllowed=5;
    private static int maxDaysAllowed=10;
    

    // Constructors, getters, and setters
    
    public LibraryMember(int memberId,String memberName)
    {
    	this.memberId=memberId;
    	this.memberName=memberName;
    }

    // Other methods for member-related operations
}
