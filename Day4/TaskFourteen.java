import java.util.Scanner;

public class TaskFourteen {
 // Driver code(Compiler starts execution from their)
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter the size of the row of matrix : "); // entering the size of row from the user
	int row = scanner.nextInt();
	System.out.print("Enter the size of the column of the matrix : "); // entering the size of the column from user 
	int column = scanner.nextInt(); 
	
	int[][] matrix = new int[row][column]; // creating the matrix of fixed size of row and column
	
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<column;j++)
		{
			matrix[i][j]=scanner.nextInt(); // taking the input from the user
		}
	}
	int countNoOfIslands = countIsland(matrix); 
	System.out.println("The number of the island in the matrix is : "+ countNoOfIslands);
	scanner.close();// close the resource so the resource leakage is not happen
}
  static int countIsland(int[][] graph) // count how much island are their
  {
	  int noOfIsland=0; // count the number of island is available in the matrix
	  for(int i=0;i<graph.length;i++)
		{
			for(int j=0;j<graph[i].length;j++)
			{
				if(graph[i][j]==1) // check that given index having land 
				{
					findingIslandUsingDepthFirstSearch(graph,i,j);
					noOfIsland++;
				}
			}
		}
	  return noOfIsland; // returning the number of island
  }
  
  static void findingIslandUsingDepthFirstSearch(int[][] graph,int row ,int col)
  { // helper method to traversing all the matrix
	  if(row<0 || row>=graph.length || col<0 || col>=graph[0].length) // base conditions 
	  { // and checking that particular index is island then make them water and traversed all possible direction 
		  return ;
	  }
	  
	  if(graph[row][col]==0) // if already a water then return it
		  return ;
	  
	  graph[row][col]=0; // if their is land , change into water so that calculating the number of island
	  
	  findingIslandUsingDepthFirstSearch(graph, row, col-1);// left direction
	  findingIslandUsingDepthFirstSearch(graph, row-1, col);// right direction 
	  findingIslandUsingDepthFirstSearch(graph, row, col+1);// upward direction
	  findingIslandUsingDepthFirstSearch(graph, row+1, col);//  downwards direction
  }
}





















