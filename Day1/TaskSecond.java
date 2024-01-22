import java.util.Scanner;

//2. Swap the First and Last Digit of the Given Number    
public class TaskSecond {
 // Driver Code(where execution will starts)
 public static void main(String[] args)
 {
	Scanner scanner = new Scanner(System.in);  // Creating the scanner object
	int inputNumber = scanner.nextInt();
	int result = gettingSwappedFirstLastDigitNumber(inputNumber);
	System.out.println("The number getting swapped first and last digit : "+result);
	scanner.close(); // close the resource so that resource leakage will not happen
 }
 static int gettingSwappedFirstLastDigitNumber(int inputNumber) // swap the first and the last number of the given number
 {
	 int firstNumber=-1;
	 int lastNumber=-1;
	 int actualNumber=inputNumber;
	 int temporaryNumber=inputNumber/10;
	 int numberofDigits=0;
	 
	 while(inputNumber>0)  // take the lastNumber as firstNumber and firstNumber as last Number
	 {
		 int remainder = inputNumber%10;
		 if(firstNumber==-1)
			 firstNumber=remainder;
		 lastNumber=remainder;
		 numberofDigits++;
		 inputNumber/=10;
	 }
	 
	 if(firstNumber==lastNumber && numberofDigits==1) // checking if their is only single digit
		 return actualNumber;
	 
	 if(numberofDigits==2)  // checking if the givenNumber is only 2 digit Number
		 return firstNumber*10+lastNumber;
	 
	 int gettingNumber=powerFunction(firstNumber,(numberofDigits-1))+(temporaryNumber%powerFunction(10, numberofDigits-3)*10)+lastNumber;
	 return gettingNumber;
 }
 static int powerFunction(int firstValue,int secondValue) // calculating the power of the certain range
 {
	 int temp=firstValue;
	 while(secondValue>0)
	 {
		 temp*=10;
		 secondValue--;
	 }
	 return temp;
 }
} 
