package TASKsECOND;
// create the sub class of the solarInverter
public class GTI extends SolarInverter{

	Battery batteryInfo; 
	Grid gridInfo;
	 
	// GTI inverted having battery and features of Grid is their
	public GTI(Battery batteryInfo, Grid gridInfo) {
		this.batteryInfo=batteryInfo;
		this.gridInfo=gridInfo;
		infoAboutSolarInverterBothFunctionality();
		System.out.println("GTI -> Solar Inverter");
	}
	
	// calling the method to calling the features of GTI
	private void infoAboutSolarInverterBothFunctionality()
	{
		batteryInfo.hasBatteryorNot();
		gridInfo.gridOnOrOff();
	}
	
}
