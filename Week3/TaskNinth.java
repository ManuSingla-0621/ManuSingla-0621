
public class TaskNinth {
	// Driver code (where compiler starts its execution)
  public static void main(String[] args) {
	  char[][] board= 
		      {{'9', '5', '7', '.', '1', '3', '.', '8', '4'},
              {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
              {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
              {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
              {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
              {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
              {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
              {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
              {'7', '.', '6', '1', '8', '5', '4', '.', '9'}}; // taking the static input of 9*9 matrix 
     System.out.println(solveSoduku(board));
}
  static boolean isValidSoduku(char[][] board,int row,int col,char character) // to validate the sudoku
  {     // check weather the probable of character is fit to th e matrix so that sudoku is solved
	  for(int i=0;i<9;i++)
	  {
		      if (board[i][col] == character) // check is that assumed character is present in 9*9 column
		        return false;

		      if (board[row][i] == character)  // check that the assumed character is present in 9*9 row
		        return false;

		      if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == character) // check that particular character is repeated
		        return false;                                                       // 3*3 sub matrix.
	  }
	  return true;
  }
  static boolean solveSoduku(char[][] board) // return that weather that sudoku is able to solved or rot
  {
	  for(int row=0;row<board.length;row++) 
	  {
		  for(int col=0;col<board[row].length;col++)
		  {
			  if(board[row][col]=='.')
			  {
				  for(char c='1';c<='9';c++)
				  {
					  if(isValidSoduku(board,row,col,c)) // check that the assumed character is fitted or not  
					  {
						  board[row][col]=c; // putting the assumed because that is one of the answer
					  
					      if(solveSoduku(board))
					    	  return true;
					      else {
							board[row][col]='.'; //Backtrack condition - assumed character is not able to slved the sudoku
						}
					}
				 }
				  return false; // return false if not able to solved 
			  }
		  }
	  }
	  return true; // return true if able to solved
  }
}
