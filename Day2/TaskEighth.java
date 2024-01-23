import java.util.Scanner;

public class TaskEighth {
  // Driver code (where executions are start)
  public static void main(String[] args)
  {
	  Scanner scanner = new Scanner(System.in); // creating the scanner object
	  System.out.println("Enter the no. of the lines you have to print the star...");
	  int inputNum = scanner.nextInt();
	  
	  for(int i=0;i<inputNum;i++)
	  {
		  for(int j=0;j<inputNum;j++)
		  { 
			  if(((i+j))==((inputNum-1)))  // printing the '/' 
			  {
				  System.out.print("/");
			  }
		      else if((i==j)) // printing the '\'
				  System.out.print("\\");
			  else
			      System.out.print("*");
		  }
		  System.out.println();
	  }
	  scanner.close(); // to close the resource so that resource leakage not happen
  }
}
