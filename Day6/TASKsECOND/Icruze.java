package TASKsECOND;

// create the subclass of the Home Inverter which is Icruze
public class Icruze extends HomeInverter {

	// HAS-A variable
		Battery batteryInfo;
		
	public Icruze(Battery batteryInfo)
	{
		this.batteryInfo=batteryInfo;
		System.out.println("Icruze -> Home Inverter");
		havingBatteryFunctionality();
	}
	
	private void havingBatteryFunctionality()
	{
		batteryInfo.hasBatteryorNot();
	}
}
