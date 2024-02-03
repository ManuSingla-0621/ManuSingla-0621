package LibrarymanagementSystem;

public class MobileAlert extends LibraryMember implements Notification {

	private String phoneNumber;
	public MobileAlert(int memberId, String memberName,String phoneNumber) {
		super(memberId, memberName);
		this.phoneNumber=phoneNumber;
		
	}
	
	@Override
	public void update()
	{
		sendMsgOnMobile(phoneNumber,"product in stock so mobile alert is given");
	}
	
	private void sendMsgOnMobile(String userNameSring,String msg)
	{
		System.out.println(userNameSring+ "msg sent to mobile");
	}

	
}
