package Whatsapp;

public class DriverCode {
  // Driver Code(Execution starts from here)
  public static void main(String[] args) {
	
	  User firstUser=new User(1, "Ram"); // sender
	  Contact contactFirst = new Contact("Riya", 23, "2909309391", firstUser);  
	  firstUser.sendMessage(contactFirst, "Hi, How are you", MessageType.TEXT);
	  contactFirst.displayContactInfo(); // receiver
	  System.out.println();
	  
	  User secondUser=new User(2, "Abhay");
	  Contact contactSecond = new Contact("Rajesh",29, "7383838839", secondUser);
	  secondUser.sendMessage(contactSecond, "What's up", MessageType.AUDIO);
	  contactSecond.displayContactInfo();
	  System.out.println();
	 
	  
//	  secondUser.sendMessage(contactFirst, "Hi,Riya", MessageType.TEXT);
//	  contactFirst.displayContactInfo();
//	  System.out.println();
	  
	  
	  
	
}
}
