package Constituency;
// create the class of the comissioner
public class Comissioner {
 
	public void arrest(MemberOfParialment memberOfParialment)
	{
		// checking the members of the parliament and if their exceeds the spending limit then commissioner can arrest them
		if((memberOfParialment instanceof OtherMembers) && (memberOfParialment.getExceedsSpendingLimit()>=100000))
		{
			 System.out.println("Other Members can arrested without anyone permission");
		}
		else  if((memberOfParialment instanceof Minister) && (memberOfParialment.getExceedsSpendingLimit()>1000000))
		{
			System.out.println("Ministers can arrested with PM permission");
		}
		else if((memberOfParialment instanceof OtherMembers) && (memberOfParialment.getExceedsSpendingLimit())>10000000)
		{
			System.out.println("PM can't arrested still they exceeding the spending limit...");
		}
		else
		{
			System.out.println(memberOfParialment.getName()+" is in Limit");
		}
	
	}
	
}
