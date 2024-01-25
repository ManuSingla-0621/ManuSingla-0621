import java.util.Scanner;

public class TaskFiftheen {
 // Driver code(execution starts from their)
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in); // Creating the scanner object
	System.out.print("Enter the size of the row of the matrix : ");
	int row=scanner.nextInt(); // taking the input from the console, to tell how many rows are in the matrix
	System.out.print("Enter the size of the column fo the matrix :  ");
	int column=scanner.nextInt(); // taking the input from console to tell the number of the columns are in matrix
	
	int[][] matrix = new int[row][column];
	System.out.println("Enter the all the elements in the matrix "); // Taking all the elements to the user from console
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<column;j++)
		{
			matrix[i][j]=scanner.nextInt();   // taking input from the user using the scanner class
		}
	}
	
	transposeOfMatrix(matrix); // transpose of matrix will happen 
	
    rotateTheEachRowOfMatrix(matrix); // rotate the  each row Of Matrix
   
    printingTheMatrix(matrix); // printing the matrix
	
	scanner.close(); // closing the resource so that resource leakage does not happen
} 
  static void transposeOfMatrix(int[][] matrix)
  {
	  for(int i=0;i<matrix.length;i++)  // transpose of the matrix
		{   
			for(int j=i;j<matrix[i].length;j++)
			{ // swapping will happen
				int temp=matrix[i][j]; 
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
  }
  static void rotateTheEachRowOfMatrix(int[][] matrix)
  {
	  for(int i=0;i<matrix.length;i++)    // rotate the each row till all of column of each row roat
	   {
		   for(int j=0;j<matrix[i].length/2;j++)
		   {
			   // swapping will happen
			   int temp=matrix[i][j];
			   matrix[i][j]=matrix[i][matrix.length-j-1];
			   matrix[i][matrix.length-j-1]=temp;
		   }
	   }
  }
  static void printingTheMatrix(int[][] matrix)
  {
	  for(int i=0;i<matrix.length;i++)   // printing the output on the console
	   {
		   for(int j=0;j<matrix[i].length;j++)
		   {
			   System.out.print(matrix[i][j]+" ");
		   }
		   System.out.println();
	   }
  }
}  
