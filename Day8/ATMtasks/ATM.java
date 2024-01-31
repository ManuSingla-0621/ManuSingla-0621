package ATMtasks;

import java.util.ArrayList;
import java.util.List;

class ATM {
    private ArrayList<Denominations> denominations;

    public ATM(ArrayList<Denominations> denominations) {
        this.denominations = denominations;
    }

    

	public List<String> withdraw(int amount) {
        int remainingAmount = amount;
        List<String> result = new ArrayList<>();

        for (Denominations denomination :denominations ) {
            if (denomination.getCount() > 0) {
                int count = remainingAmount / denomination.getValue();
                count = Math.min(count, denomination.getCount());

                if (count > 0) {
                    remainingAmount -= count * denomination.getValue();
                    denomination.setCount(denomination.getCount() - count);
                    result.add(denomination.getValue() + " x " + count);
                }
            }
        }

        if (remainingAmount == 0) {
            return result;
        } else {
            result.clear();
            result.add("Error: Insufficient balance or invalid withdrawal amount");
            return result;
        }
    }

  

 
}
