package ATMtasks;

import java.util.ArrayList;
import java.util.List;

public class DriverCode {
  public static void main(String[] args) {
	  ATMFactory atmFactory = new ATMImplementation();
	  // creation of the arrayList of all denominations
      ArrayList<Denominations> denominations = atmFactory.createDenominations();

      ATM atm = new ATM(denominations);
      
      // withdraw the amount with available notes
      List<String> withdrawalResult = atm.withdraw(2300);
      System.out.println(withdrawalResult);
      
      // removes the 2000 notes from the denominations
      denominations.removeIf(d -> d.getValue() == 2000);
      
      
      atm = new ATM(denominations);
      // again fetch the 2300 withdraw notes availabl e
      withdrawalResult = atm.withdraw(2300);
      System.out.println(withdrawalResult);
      
      
}
}
