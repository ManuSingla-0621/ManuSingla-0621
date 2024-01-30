package Constituency;
public class DriverCode {
	// execution starts from here
  public static void main(String[] args) {

	  // creating the member of parliament which is prime minister 
	  MemberOfParialment primeMinister= new PrimeMinister(52,"Prime Minister", 'M');
	  primeMinister.setConstituency("Gujrat");
	  primeMinister.setSpendLimit(899999);
	  
	  // creating the member of parliament which is minister
	  MemberOfParialment minister=new Minister(46, "Minister", 'M');
	  minister.setConstituency("Rajasthan");
	  minister.setSpendLimit(37733000);
	  
	  // creating the object of parliament which is others minister
	  MemberOfParialment otherMinister=new OtherMembers(55, "Other Minister", 'F');
	  otherMinister.setConstituency("Uttarakhand");
	  otherMinister.setSpendLimit(876);
	  
	  // create the object of the commissioner which can areest according to the exceed spend 
	  Comissioner comissioner = new Comissioner();
	  // printing the details of the member of parliament of others minister 
	  System.out.println("Constituency Won  : "+otherMinister.getConstituency());
	  System.out.println("Name of the designation : "+otherMinister.getName());
	  System.out.println("Spending Amount : "+otherMinister.getExceedsSpendingLimit());
	  comissioner.arrest(otherMinister);
	  
	  
}
}
