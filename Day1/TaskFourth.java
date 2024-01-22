import java.util.Scanner;
//4. Write a function to tell that weather string is valid or not
public class TaskFourth {
 // Driver code where execution will starts
 public static void main(String[] args)
 {
	 Scanner scanner = new Scanner(System.in);
	 String inputString = scanner.nextLine();
	 
	 if(isValidString(inputString)) // calls a isValidSring(inputString) method
	 {
		 System.out.println("The given "+inputString+" is valid");
	 }
	 else
	 {
		 System.out.println("the given "+inputString+" is not valid");
	 }
	 scanner.close(); // not to happen the resource leakage
 }
 static boolean isValidString(String inputString) // checks weather the string is valid or not
 {
	 for(int i=0;i<inputString.length();i++)
	 {
		 if(inputString.charAt(i)==32) // checking that weather the space is coming is not if coming then false and if not till the end of the loop then it is true
		 {
			 return false;
		 }
	 }
	 return true;
 }
}
