import java.util.ArrayList;
import java.util.Scanner;

public class TaskSeventeen {
	// driver code(Compiler starts execution from their)
  public static void main(String[] args)
  {
	  Scanner scanner = new Scanner(System.in);//creating the scanner object
	
	  System.out.print("Enter the size of the first array : ");
	  int sizeOfFirstArray=scanner.nextInt(); // giving the input to the size of the array
	  
	  int[] inputArray1=new int[sizeOfFirstArray];
	  System.out.print("Enter the elements of the first array : ");
	  
	  for(int i=0;i<sizeOfFirstArray;i++)
	  {
		    inputArray1[i]=scanner.nextInt();
	  }
	  
	  System.out.print("Enter the size of the second array : ");
	  int sizeOfSecondArray=scanner.nextInt(); // giving the input to the size of the second array
	  
	  int[] inputArray2=new int[sizeOfSecondArray];
	  System.out.print("Enter the elements of the second array : ");
	  for(int i=0;i<sizeOfSecondArray;i++)
	  {
		    inputArray2[i]=scanner.nextInt();
	  }
	
	  
	  ArrayList<Integer> arrayList = new ArrayList<>();
	  
	  mergingMethod(inputArray1,inputArray2,arrayList); // helps in merging the two array list
	 
	  int size = arrayList.size();
	  int actualSize=arrayList.size()-1;
	  
	  
	  if(size%2==0) // if the length of the arraylist is even
	  {
		System.out.println((arrayList.get(actualSize/2)+arrayList.get(actualSize/2+1))/2.0);
	  }
	  else {  // if the length of the arraylist is odd
		  
		  System.out.println(arrayList.get(actualSize/2)/2.0);
	}
	  scanner.close(); // closing the resource so that resource leakage is not happen
  }
  static void mergingMethod(int[] firstArray,int[] secondArray,ArrayList<Integer> arrayList)
  { // helping the two arrays which can merge into single arraylist
	  int i=0,j=0,lengthOfFirstArray=firstArray.length,lengthOfSecondArray=secondArray.length;
	  int k=0;//storing the index of the first and second array combine
	  
	  while(i<lengthOfFirstArray && j<lengthOfSecondArray) // checking bound that no of the any loop gets ended 
	  {
		  if(firstArray[i]<=secondArray[j]) // if the firstArray element is less than second array element
		  {
			  arrayList.add(firstArray[i]);
			  i++; // increment the indexing of firstArray
			  k++; //increment the indexing of the arrayList
		  }
		  else {
			arrayList.add(secondArray[j]);
			j++;  // incrementing the indexing of the secondArray
			k++;  // incrementing the indexing of the arrayList
		}
	  }
	  
	  while(i<lengthOfFirstArray)  // remaining elements of firstArray are put in the arraylist
	  {
		  arrayList.add(firstArray[i]);
		  i++;
		  k++;
	  }
	  
	  while(j<lengthOfSecondArray) // remaining elements  of secondArray put in arrayList
	  {
		  arrayList.add(secondArray[j]);
		  j++;
		  k++;
	  }
  }
}
