package Constituency;

// create the class of the prime minister which is extends from the Member of Parliament
public class PrimeMinister extends MemberOfParialment{
    // Has-A variable
	Car car; 
	Aircraft aircraft;
	
	// setting up the base class parameters during the creating of the object
	public PrimeMinister(int age, String name, char gender) {
		super(age, name, gender);
	}

}
