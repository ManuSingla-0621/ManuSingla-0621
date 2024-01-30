package TASKsECOND;

public class PCU extends SolarInverter {

	Battery batteryInfo; 
	
	public PCU(Battery batteryInfo) {
		this.batteryInfo=batteryInfo;
		infoAboutSolarInverterSingleFunctionality();
		System.out.println("PCU -> Solar Inverter");	
	}
	
	private void infoAboutSolarInverterSingleFunctionality()
	{
		batteryInfo.hasBatteryorNot();
	}
	

}
