package Whatsapp;

import java.util.ArrayList;
import java.util.List;

public class User extends Person{

	private int userID;
	private String userName;
	private List<Message> chatHistory;
	private List<Status> status;
	private List<Contact> contacts;
	
	public User(int userID,String userName)
	{
		super(userName);
		this.userID=userID;
		this.userName=userName;
		this.chatHistory=new ArrayList<>();
		this.status=new ArrayList<>();
		this.contacts=new ArrayList<>();
	}

	public int getUserID() {
		return userID;
	}

	public String getUserName() {
		return userName;
	}
	
	public List<Message> getMessageInfo() {
		return chatHistory;
	}

	public List<Status> getStatusInfo() {
		return status;
	}

	public List<Contact> getContactsInfo() {
		return contacts;
	}

	public void addContact(Contact contact)
	{
		contacts.add(contact);
	}
	
	public void postStatus(Status status)
	{
		this.status.add(status);
	}
	
	public void sendMessage(Contact contact, String content, MessageType type) {
        Message message = new Message(this, contact, content, type);
        chatHistory.add(message);
        contact.receiveMessage(message);
    }
	
	
}
