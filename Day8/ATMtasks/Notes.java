package ATMtasks;

// create a class of Notes which implement dnominations face
public class Notes implements Denominations {

	private int value; // create a note type having which value
	private int count; // no of notes in total available of particular kind
	
	public Notes(int value,int count)
	{
		this.value=value;
		this.count=count;
	}
	
	// setting up the value of the current note
	public void setValue(int value)
	{
		this.value=value;
	}
	// setting up the count of the particular note available
	public void setCount(int count)
	{
		this.count=count;
	}
	// getting the value of the current note
	public int getValue()
	{
		return value;
	}
	// getting the count of the current note
	public int getCount()
	{
		return count;
	}

	
}
