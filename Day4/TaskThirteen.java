import java.util.Scanner;

public class TaskThirteen {
  // driver code(where execution starts from their)
  public static void main(String[] args)
  {
	   Scanner scanner = new Scanner(System.in); // 
	   System.out.print("Enter the size of the row of the matrix : ");
	   int row=scanner.nextInt();
	   System.out.println("Enter the size of the column of the matrix : ");
	   int column=scanner.nextInt();
	   
	   int[][] matrix = new int[row][column];
	   System.out.println("Enter the all the elements in the matrix : ");
	   for(int i=0;i<matrix.length;i++)
	   {
		   for(int j=0;j<matrix[i].length;j++)
		   {
			    matrix[i][j]=scanner.nextInt();
		   }
	   }
	   
	   System.out.print("Enter the target element : ");//give the target element which we have to find
	   int targetElement = scanner.nextInt();
	   
	   System.out.println(findTheTargetElement(matrix, targetElement));
	   
	   scanner.close(); // closing the resource so the resource leakage not happen   
  }
  
  static int findTheTargetElement(int[][] matrix, int target)
  {
	    int row = 0;
	    int rowEnd = matrix.length;
	    int colEnd = matrix[0].length;
	    int col = matrix[0].length-1;
	    
	    if(matrix[0][0]>target || target>matrix[rowEnd-1][colEnd-1])
	    	return -1;
	    
	    while(row<rowEnd && col>=0)
	    {
	    	 if(target==matrix[row][col])
	    	 {
	    		 System.out.println("Element is found");
	    		 return -1;
	    	 }
	    	 else if(target > matrix[row][col])
	    	 {
	    		 row++;
	    	 }
	    	 else {
				col--;
			}
	    }
	    return -1;
  }
  
}
