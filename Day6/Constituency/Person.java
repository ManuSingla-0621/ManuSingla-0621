package Constituency;

public class Person {
	// instance variables
    private int age;
    private String name;
    private char gender;
    private String constituencyString;
	private String driverString;
	private int speedLimit;
    
    // Parameterized Constructor
    public Person(int age,String name,char gender)
    {
    	this.age=age;
    	this.name=name;
    	this.gender=gender;
    }
    // getters and setters
    
    // set the constituency of the parliament member won
    public void setConstituency(String constituencyString)
    {
    	this.constituencyString=constituencyString;
    }
        
    // set the driver name of the parliament member
    public void setDriver(String driverString)
    {
    	this.driverString=driverString;
    }
    
     // set the spending limit of the parliament member
    public void setSpendLimit(int speedLimit)
    {
    	this.speedLimit=speedLimit;
    }
    
    // set the age of the parliament member
    public void setAge(int age)
    {
    	this.age=age;
    }
    
    // set the name of the parliament minister
    public void setName(String name)
    {
    	this.name=name;
    }
    // set the gender of the parliament member
    public void setGender(char gender)
    {
    	this.gender=gender;
    }
    
    // return the constituency in which the member of parliament won
    public String getConstituency()
    {
    	return constituencyString;
    }
    // return the name of the driver of the any minister
    public String getDriver()
    {
    	return driverString;
    }
    // return the amount of the any minister spending limit
    public int getExceedsSpendingLimit()
    {
    	return speedLimit;
    }
    // return the name of the member of the parliament
    public String getName()
    {
    	return name;
    }
    
    // return the age of the parliament member
    public int getAge()
    {
    	return age;
    }
    
    // return the gender of the parliament member
    public char getGender()
    {
    	return gender;
    }

}
