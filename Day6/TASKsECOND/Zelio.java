package TASKsECOND;

// creating the class of the Zelio which is actually a Home Inverter
public class Zelio extends HomeInverter {

	// HAS-A variable
	Battery batteryInfo;
	
	public Zelio(Battery batteryInfo)
	{
		this.batteryInfo=batteryInfo;
		System.out.println("Zelio -> Home Inverter");
		havingBatteryFunctionality();
	}
	
	private void havingBatteryFunctionality()
	{
		batteryInfo.hasBatteryorNot();
	}
	
}
