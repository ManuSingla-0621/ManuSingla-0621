import java.util.Scanner;

public class TaskEleven {
  // Driver code(where execution can start)
  public static void main(String[] args) { 
	  
	   Scanner scanner = new Scanner(System.in); // Create the object of the scanner class
	   System.out.print("Enter the row size of the matrix : "); // tell the size of the row of the matrix
	   int row = scanner.nextInt();
	   System.out.print("Enter the column size of the matrix : "); // telling the size of the column of the matrix
	   int column = scanner.nextInt();
	   
	   int[][] matrix = new int[row][column]; // creating the matrix of the fixed size
	   
	   System.out.print("Enter the number of the elements in the array : ");
	   for(int i=0;i<row;i++)
	   {
		   for(int j=0;j<column;j++)
		   {
			   matrix[i][j]=scanner.nextInt(); // taking the input from the user
		   }
	   }
	   
	   printSpiralMatrixInClockWiseDirection(matrix); // calls the method for printing the spiral matrix in clockwise direction
	   printSpiralMatrixInAntiClockWiseDirection(matrix);// calls the method for printing the spiral order in anti clockwise direction
	   scanner.close(); // close the resource so the resource leakage will not happen .
}
  // anticlockwise direction
  
  static void printSpiralMatrixInAntiClockWiseDirection(int[][] matrix)
  {
	  System.out.println("Printing In Anti-ClockWise Direction");
	  int minRow=0; // pointer storing the minimum row index in the matrix
	  int maxRow=matrix.length-1;  // pointer storing the maximum row index in the matrix
	  int minCol=0;  // pointer storing the minimum column index in the matrix
	  int maxCol=matrix[0].length-1; // pointer storing the maximum column index in the matrix
	  
	  int noOfElementsInMatrix=(matrix.length*matrix[0].length); // total number of elements present in the matrix
	  int count=0; // starting the count ow much matrix value you have traversed
	  
	  while(true && count<noOfElementsInMatrix) // checking the conditions that you have traversed all the matrix
	  {
		  for(int i=minRow,j=minCol;i<=maxRow && count<noOfElementsInMatrix;i++) // printing the downwards of the matrix
		  {
		       System.out.print(matrix[i][j]+" ");
		       count++;
		  }
		  
		  minCol++; // neglecting the start of column because all elements in the matrix are traversed
		  
		  for(int i=maxRow,j=minCol;j<=maxCol && count<noOfElementsInMatrix;j++) 
		  { // printing the bottom right of the matrix
			   System.out.print(matrix[i][j]+" ");
			   count++;
		  }
		   
		  maxRow--;  // neglecting the lower row of the matrix because traversed 
		  
		  for(int i=maxRow,j=maxCol;i>=minRow && count<noOfElementsInMatrix;i--)
		  {
			  // printing the upwards of the matrix
			  System.out.print(matrix[i][j]+" ");
			  count++;
		  }
		  
		  maxCol--; // neglecting the end of the column in the matrix
		  
		  for(int i=minRow,j=maxCol;j>=minCol && count<noOfElementsInMatrix;j--)
		  {
			  // printing the top in left direction
			  System.out.print(matrix[i][j]+" ");
			  count++;
		  }
		  
		  minRow++; // neglecting the upper row of the matrix
	  }
  }
  
  static void printSpiralMatrixInClockWiseDirection(int[][] matrix) //print the spiral matrix  
  {
	  System.out.println("Printing In clockWise direction");
	  int maxRow=matrix.length-1; // pointer stores the maximum row index in the matrix
	  int minRow=0; // pointer that stores the minimum row index in the matrix
	  int minCol=0; // pointer that stores the minimum column index in the matrix 
	  int maxCol=matrix[0].length-1; // pointer that stores the maximum column index in the matrix
	  
	   
	  int noOfElementsInMatrix = (matrix.length*matrix[0].length); // no of the elements stored in the matrix
	  int count=0;
	  
	  while(true && count<noOfElementsInMatrix) // checks the conditions that weather the we have traversed all the matrix
	  {
		for(int i=minRow , j =minCol;j<=maxCol && count<noOfElementsInMatrix;j++)
		{// move to the minimum row in the right direction
			System.out.print(matrix[i][j]+" ");
			count++;
		}
		
		minRow++; // moved to the minimum row in the matrix
		
		for(int i=minRow , j=maxCol;i<=maxRow && count<noOfElementsInMatrix;i++)
		{
			// moved to the maximum column in the matrix
		   System.out.print(matrix[i][j]+" ");	
		   count++;
		}
		
		maxCol--; // decreasing the maximum column because the maximum column already being traversed
		
		for(int i=maxRow,j=maxCol;j>=minCol && count<noOfElementsInMatrix ;j--)
		{
			//moving to the maximum row in the matrix 
		    System.out.print(matrix[i][j]+" ");
		    count++;
		}
		
		maxRow--;  // decreasing the maximum row because maximum row is already being traversed
		
		for(int i=maxRow , j=minCol;i>=minRow && count<noOfElementsInMatrix;i--)
		{
			// moving to the minimum column in the matrix
			System.out.print(matrix[i][j]+" ");
			count++;
		}	
		minCol++; // increasing the minimum column
	  }
	  System.out.println();
  }
}








































//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Combinations {
//
//    public static void main(String[] args) {
//        Map<String, List<Character>> values = new HashMap<>();
//        values.put("1", List.of('Z', 'Y', 'A'));
//        values.put("2", List.of('B', 'O'));
//        values.put("12", List.of('L'));
//        values.put("3", List.of('U', 'P'));
//
//        String input = "123";
//        List<String> combinations = generateCombinations(input, values);
//        System.out.println(combinations);
//    }
//
//    private static List<String> generateCombinations(String input, Map<String, List<Character>> values) {
//        List<String> combinations = new ArrayList<>();
//        generateCombinationsRecursive(combinations, new StringBuilder(), input, values, 0);
//        return combinations;
//    }
//
//    private static void generateCombinationsRecursive(List<String> combinations, StringBuilder current, String input, Map<String, List<Character>> values, int index) {
//        if (index == input.length()) {
//            combinations.add(current.toString());
//            return;
//        }
//
//        String key = String.valueOf(input.charAt(index));
//        List<Character> options = values.get(key);
//
//        if (options != null) {
//            for (Character option : options) {
//                current.append(option);
//                generateCombinationsRecursive(combinations, current, input, values, index + 1);
//                current.deleteCharAt(current.length() - 1);
//            }
//        } else {
//            current.append(key);
//            generateCombinationsRecursive(combinations, current, input, values, index + 1);
//            current.deleteCharAt(current.length() - 1);
//        }
//    }
//}
