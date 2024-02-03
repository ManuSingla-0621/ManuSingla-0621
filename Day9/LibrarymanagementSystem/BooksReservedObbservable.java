package LibrarymanagementSystem;

import java.util.ArrayList;
import java.util.List;



public class BooksReservedObbservable {
	public List<Notification> observerList = new ArrayList<>();
	public int stockCount=0;

	public void add(Notification observer) {
		observerList.add(observer);
	}

	public void remove(Notification observer) {
		observerList.remove(observer);
	}

	public void notifySubscribers()
	{
		for(Notification observer:observerList)
		{
			observer.update();
		}
	}
	
   // settup the stock
	public void setStockCount(int newStockAdded)
	{
		if(newStockAdded!=0)
			notifySubscribers();
	}


	public int getStockCount()
	{
		return stockCount;
	}
	
}
