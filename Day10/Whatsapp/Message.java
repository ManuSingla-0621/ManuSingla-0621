package Whatsapp;

// create a class of the message 
public class Message {
	// instance variables of the message class
	private User sender;
    private Contact receiver;
    private String content;
    private MessageType type;

    // create a parameterized constructor of the message class 
    public Message(User sender, Contact receiver, String content, MessageType type) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.type = type;
    }

    // return the user as a sender 
    public User getSender() {
        return sender;
    }

    // return a receiver class  reference variable
    public Contact getReceiver() {
        return receiver;
    }

    // returning the content of the string
    public String getContent() {
        return content;
    }

    // returning the what type of message user has actually send
    public MessageType getType() {
        return type;
    }
}
