package TASKsECOND;

// create a implementation class of the Battery 
public class HasBattery implements Battery {
    // Override the abstract method so that telling the it hasBattery
	@Override
	public void hasBatteryorNot()
	{
		System.out.println("Inverter having Battery");
	}
	
}
