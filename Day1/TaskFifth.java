import java.util.Scanner;

public class TaskFifth {
  // Driver Code(where execution is actually start)
  public static void main(String[] args)
  {
	  Scanner scanner = new Scanner(System.in); // creating the object of the scanner class
	  int inputNumber = scanner.nextInt();
	   
	  findSmallestNumberDivisbleby1ToN(inputNumber);
	  scanner.close(); // closing the resource so that leakage would not happen
  }
  
  static void findSmallestNumberDivisbleby1ToN(int inputNumber)// Smallest Number Divisible by 1 to N
  {
    int ans = 1;
    for(int i=1;i<=inputNumber;i++)
    {
    	ans=(ans*i)/gcd(ans, i);
    }
    System.out.println(ans);
  }
  
  static int gcd(int firstNumber,int secondNumber) // find the greatest common divisior
  {
	  if(secondNumber==0)
		  return firstNumber;
	  return gcd(secondNumber, firstNumber%secondNumber);
  }
}
