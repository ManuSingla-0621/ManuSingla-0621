package TASKsECOND;

public class DriverCode {
	// Driver code(Execution starts from here)
  public static void main(String[] args) {
	 
	  // Battery present or not present in solar inverter
	  HasBattery hasBattery = new HasBattery();
	  NotHavingBattery notHavingBattery = new NotHavingBattery();
	  
	  //  grid is on  feature
	  GridOn gridOn = new GridOn();

	  // solar Inverter
	  
	  //constructor injection
	  SolarInverter solarInverter = new PCU(hasBattery);
	  System.out.println();
	  SolarInverter solarInverter2 = new GTI(notHavingBattery,gridOn);
	  System.out.println();
	  SolarInverter solarInverter3 = new Regila(); 
	  System.out.println();
	  
	  // home inverter
	  HomeInverter homeInverter = new Icruze(hasBattery);
	  HomeInverter homeInverter2 = new Zelio(hasBattery);
	  
}
}
