import java.util.Scanner;

public class TaskThird {
	// Driver Code (where execution will start)
  public static void main(String[] args)
  {
	   Scanner scanner = new Scanner(System.in);
	   int inputNumber = scanner.nextInt();
	   
	   largestPrimeNumber(inputNumber);
	   
	   scanner.close();// closing the resource so that leakage is not happening
  }
  
  static void largestPrimeNumber(int inputNumber) // getting the largest prime number in which each digit is prime
  {
	  boolean isTrue=false;
	  for(int i=inputNumber;i>=0;i--)
	  {
		  int temporaryVariable = i;
		  int countDigit=0;
		  int countTrue=0;
		  
		  while(temporaryVariable>0)
		  {
			  if(isPrime(temporaryVariable%10)==true)
				  countTrue++;
			  temporaryVariable/=10;
			  countDigit++;
		  }
		  
		  if(countDigit==countTrue)
		  {
			 System.out.println(i);
			 isTrue=true;
			 break;
		  }
	  }
	  if(isTrue==false)
	  System.out.println("No number Less than N is prime Number");
  }
  
  static boolean isPrime(int inputNumber)
  {
	  if(inputNumber<=1)
		  return false;
	  
	  for(int i=2;i<=Math.sqrt(inputNumber);i++)
	  {
		  if(inputNumber%i==0)
			  return false;
	  }  
	  return true;
  }
}
