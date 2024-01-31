package ATMtasks;

import java.util.ArrayList;


public class ATMImplementation  implements ATMFactory{

	@Override
	public ArrayList<Denominations> createDenominations() {
		ArrayList<Denominations> denominations=new ArrayList<>();
		denominations.add(new Notes(2000, 10));
		denominations.add(new Notes(500, 20));
		denominations.add(new Notes(200, 30));
		denominations.add(new Notes(100, 50));
		return denominations;
	}

}
