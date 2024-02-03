package Whatsapp;

import java.util.ArrayList;
import java.util.List;

// create the class of the Contact
public class Contact  extends Person{

	// create the instance variable of the contact class
	private String contactNameString;
	private int contactAge;
	private String contactNumber;
	private User user;
	private List<Message> chatHistoryList;
	
	// create a parameterized constructor of the contact class
	public Contact(String contactNameString,int contactAge,String contactNumber,User user)
	{
		super(contactNumber, contactAge);
		this.contactNameString=getNameOfThePerson();
		this.contactAge=getAgeOfThePerson();
		this.contactNumber=contactNumber;
		this.user=user;
		this.chatHistoryList=new ArrayList<>();
	}
	
	// contact can receive message which can send by user
	 public void receiveMessage(Message message) {
	        chatHistoryList.add(message);
	 }
	 
	 // all the chatHistory reterived from that
	 public List<Message> getChatHistory() {
	        return chatHistoryList;
	    }

	 // getting the user
	 public User getUser() {
	        return user;
	    }
	 
	 // getting the contact name of who is interacted by the user
	 public String getContactnameString()
	 {
		 return contactNameString;
	 }
	 
	// display the contact info
	public void displayContactInfo()
	{
		System.out.println("Name of the contact : "+contactNameString);
		System.out.println("Age of the contact  : "+contactAge);
		System.out.println("Phone no .of the contact : "+contactNumber);
		for(Message message:chatHistoryList)
		{
			System.out.println("The sender of the message is : "+message.getSender().getUserName());
			System.out.println("The receiver of the message is : "+message.getReceiver().getContactnameString());
			System.out.println("The content of the message is : "+message.getContent());
			System.out.println("The type of the message is : "+message.getType());
			
		}
	}
}
