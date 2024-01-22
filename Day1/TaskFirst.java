import java.util.Scanner;
// 1. Checking the weather the String is valid or not
public class TaskFirst {
 // Driver code where execution will starts
 public static void main(String[] args)
 {
	 Scanner scanner=new Scanner(System.in); // Creating the object of Scanner class
	 String string = scanner.nextLine(); // Taking string from the console
	 if(isValidString(string))
	 {
		   System.out.println("The given "+string+" is valid");
	 }
	 else 
	 {
		System.out.println("The given "+string+" is not valid");
	 } 
	 scanner.close();// resource close so that resource leakage not happen
 }
 
 static boolean isValidString(String name) // checking the weather the string is valid of not
 {
	if(isVowelMoreThanOnce(name) && isCheckingTBetweeenS(name)) //checking two condition for validation
		return true;
    return false;
 }
 
 static boolean isVowelMoreThanOnce(String name) // check that vowel coming more than twice or not 
 {
	 int countVowel=0;
	 for(int i=0;i<name.length();i++)
	 {
		 if(name.charAt(i)=='A' || name.charAt(i)=='E' || name.charAt(i)=='I' || name.charAt(i)=='O' ||
		    name.charAt(i)=='U' || name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='o' ||
			name.charAt(i)=='u')
		 {
			 countVowel++;
		 }
	 } 
	 
	 if(countVowel>=2) // checking the first condition not containing vowel more than once once
	 {
		 return false;
	 }
	 return true;
 }
 
 static boolean isCheckingTBetweeenS(String name) // checking the Two 'S' present and their is no 'T' in between 
 {
	  int firstOccurenceOfS=-1; 
	  int secondOccurenceOfS=-1;
	  for(int i=0;i<name.length();i++)
	  {
		  if(name.charAt(i)=='S')
		  {
			  if(firstOccurenceOfS==-1)
				  firstOccurenceOfS=i;
			  
			  if(firstOccurenceOfS!=-1 && secondOccurenceOfS==-1)
				  secondOccurenceOfS=i;
		  }
	  }
	  
	  int countT=0;
	  for(int i=firstOccurenceOfS;i<=secondOccurenceOfS;i++)
	  {
		  if(name.charAt(i)=='T') // checking 'T' between two 'S' present at different index
		  {
			  countT++;
		  }
	  }
	  
	  if(countT!=0)
		  return false;
	  return true;
 }
}
