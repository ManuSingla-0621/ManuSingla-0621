import java.util.Scanner;
// sliding window maximum
public class TaskEighteen {
   public static void main(String[] args)
   {
	   Scanner scanner = new Scanner(System.in); // create the scanner object
		
		 System.out.print("Enter the number of the elements in the matrix : ");
		 int noOfElement=scanner.nextInt();
		 
		 int[] inputArray = new int[noOfElement]; // creating the fixed size array of input length
		 
		 for(int i=0;i<noOfElement;i++)
		 {
			 inputArray[i]=scanner.nextInt(); // taking input from user
		 }
		 
		 System.out.print("Enter the size of the window : ");
		 int sizeOfWindow = scanner.nextInt();
		 
		 findingTheMaximumInWindow(inputArray , sizeOfWindow); // finding maximum according to window
		 
		 scanner.close(); // to  lose the resource so that resource leakage will not happen
   }
   static void findingTheMaximumInWindow(int[] inputArray,int sizeOfWindow)
   {   // finding the maximum in given window size
 	    for(int i=0;i<=inputArray.length-sizeOfWindow;i++)
 	    {
 	    	int max=Integer.MIN_VALUE;  
 	    	  for(int j=i;j<i+sizeOfWindow;j++)
 	    	  {
 	    	   	   max=Math.max(max, inputArray[j]); 
 	    	  }
 	    	System.out.println(max);
 	    }
   }
}
