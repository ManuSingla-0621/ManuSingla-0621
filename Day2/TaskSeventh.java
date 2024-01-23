import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TaskSeventh {
  // Driver code(where execution of the code starts)
  public static void main(String[] args) {
	 
	  Scanner scanner = new Scanner(System.in); // creating the scanner object
	  System.out.print("Enter the elements in the array : ");
	  int inputElementInArray=scanner.nextInt();
	  
	  int[] inputArray = new int[inputElementInArray];
	  for(int i=0;i<inputArray.length;i++)
	  {
		  System.out.println("Enter the element "+ i +" in the array : ");
		  inputArray[i]=scanner.nextInt();
	  }
	  
	  System.out.println("Enter the target sum : ");
	  int targetSum = scanner.nextInt();
	  
	  sortingToTheArray(inputArray, 0, inputArray.length-1);
	  ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
	  
	  for(int i=0;i<inputArray.length-2;i++)
	  {
		   if(i>0 && inputArray[i]==inputArray[i-1])
		   {
			   continue;
		   }
		   int leftIndex = i+1;
		   int rightIndex = inputArray.length-1;
		   while(leftIndex<rightIndex)
		   {
			   int sum = inputArray[i]+inputArray[leftIndex]+inputArray[rightIndex];
			   if(sum==targetSum)
			   {
				   ArrayList<Integer> demoArrayList = new ArrayList<>();
				   demoArrayList.add(inputArray[i]);
				   demoArrayList.add(inputArray[leftIndex]);
				   demoArrayList.add(inputArray[rightIndex]);
				   arrayList.add(demoArrayList);
				   leftIndex++;
				   rightIndex--;
				   
				   while(leftIndex<rightIndex && inputArray[leftIndex]==inputArray[leftIndex-1])
				   {
					   leftIndex++;
				   }
				   while(leftIndex<rightIndex && inputArray[rightIndex]==inputArray[rightIndex+1])
				   {
					   rightIndex--;
				   }
			   }
			   else if(sum<targetSum)
			   {
				  leftIndex++;
			   }
			   else 
			   {
				   rightIndex--;
			   }
		   }
	  }
	  
	  for(ArrayList<Integer> row:arrayList) // iterate over 2d arraylist
	  {
		  for(Integer elem:row)
		  {
			  System.out.print(elem);
		  }
		  System.out.println();
	  }
	  scanner.close();// closing the resource so that resource leakage not happen  
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
