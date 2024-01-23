import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TaskSix {
  // Driver code (Execution starts from their)
  public static void main(String[] args) {
	
	  Scanner scanner = new Scanner(System.in); // Create the scanner object
	  System.out.println("Enter the number of the elements in the array : ");
	  int noOfElements=scanner.nextInt();
	  int[] array=new int[noOfElements]; // Creating the array
	  for(int i=0;i<noOfElements;i++)
	  {
		  System.out.println("Enter the "+i+" of the array : ");
		  array[i]=scanner.nextInt();
	  }
	  
	  sortingToTheArray(array, 0, array.length-1);

	  
	  ArrayList<Integer> arrayList = new ArrayList<>();
	  
	  for(int i=0;i<array.length;i++)
	  {
		   if(!arrayList.contains(array[i]))
		   {
			   arrayList.add(array[i]);
		   }
		   if(((i+1)<=array.length-1) && array[i]==array[i+1] && !arrayList.contains(array[i]))
		   {
			   arrayList.add(array[i]);
		   }
	  }
	  System.out.println(arrayList.toString());
	  scanner.close();
} 
  static void merging(int[] inputArray,int startIndex,int mid,int lastIndex)
  {
	  int firstArrayElement = mid-startIndex+1;
	  int secondArrayElement = lastIndex-mid;
	  
	  int[] firstArray = new int[firstArrayElement];
	  int[] secondArray= new int[secondArrayElement];
	  
	  for(int i=0;i<firstArrayElement;i++)
	  {
		  firstArray[i]=inputArray[startIndex+i];
	  }
	  
	  for(int j=0;j<secondArrayElement;j++)
	  {
		  secondArray[j]=inputArray[mid+1+j];
	  }
	  
	  int i=0,j=0,k=startIndex;
	  
	  while(i<firstArrayElement && j<secondArrayElement)
	  {
		  if(firstArray[i]<=secondArray[j])
		  {
			  inputArray[k]=firstArray[i];
			  i++;
			  k++;
		  }
		  else {
			  inputArray[k]=secondArray[j];
			  j++;
			  k++;
		}
	  }
	  
	  while(i<firstArrayElement)
	  {
		  inputArray[k]=firstArray[i];
		  i++;
		  k++;
	  }
	  
	  while(j<secondArrayElement)
	  {
		  inputArray[k]=secondArray[j];
		  j++;
		  k++;
	  }
  }
  static void sortingToTheArray(int[] inputArray , int startIndex , int lastIndex) // sort to the array(merge sort)
  {
	  if(startIndex<lastIndex)
	  {
		  int mid=(startIndex+lastIndex)/2;
		  sortingToTheArray(inputArray, startIndex, mid);
		  sortingToTheArray(inputArray, mid+1, lastIndex);
		  merging(inputArray,startIndex,mid,lastIndex);
	  }
	  else {
		return ;
	}
  }
  
}
