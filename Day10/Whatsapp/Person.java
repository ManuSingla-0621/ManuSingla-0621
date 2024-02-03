package Whatsapp;


public class Person {

	private String nameOfThePerson;
	private int ageOfThePerson;
	
	
	public Person(String nameString)
	{
		this.nameOfThePerson=nameString;
	}
	
	public Person(String nameOfThePerson, int ageOfThePerson) {
		super();
		this.nameOfThePerson = nameOfThePerson;
		this.ageOfThePerson = ageOfThePerson;
	}
	
	
	public String getNameOfThePerson() {
		return nameOfThePerson;
	}
	public void setNameOfThePerson(String nameOfThePerson) {
		this.nameOfThePerson = nameOfThePerson;
	}
	public int getAgeOfThePerson() {
		return ageOfThePerson;
	}
	public void setAgeOfThePerson(int ageOfThePerson) {
		this.ageOfThePerson = ageOfThePerson;
	}
	
	
	
	
}
