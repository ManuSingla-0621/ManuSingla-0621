
public class TaskTenth {
  // driver code(execution starts from here)
  public static void main(String[] args) {
	  char[][] chessBoard= 
	      {{'-', '-', '-', '-', '-', '-', 'C', '-'},
          {'-', '-', 'K', '-', '-', '-', '-', '-'},
          {'-', '-', '-', ' ', '-', '-', '-', '-'},
          {'-', '-', '-', 'H', '-', '-', '-', '-'},
          {'-', '-', '-', '-', '-', '-', '-', '-'},
          {'-', '-', '-', '-', '-', '-', 'H', '-'},
          {'H', ' ', '-', '-', '-', '-', '-', '-'},
          {'-', '-', '-', '-', '-', '-', '-', '-'},
	      };
	  
	    if(checkBoard(chessBoard)==0) // check the no one is kiling the king
	    	System.out.println("No king in danger");
	    else 
	    	System.out.println("king in danger");
}
  
  static boolean inBounds(int row,int col)
  {
	  return row>=0 && row<8 && col>=0 && col<8;
  }
     
   static boolean checkForBishop(char[][] chessBoard,char c,int i,int j) // cross
   {
	    int k=0;
	    while(inBounds(i + ++k, j+k))    // lower right diagonal
	    {
	    	if(chessBoard[i+k][j+k]==c)
	    		return true;
	    	if(chessBoard[i+k][j+k]!='-')
	    		break;
	    }
	    
	    k=0; // lower left diagonal
	    
	    while(inBounds(i+ ++k, j-k))
	    {
	    	if(chessBoard[i+k][j-k]==c)
	    		return true;
	        if(chessBoard[i+k][j-k]!='-')
	        	break;
	    }
	    
        k=0; // upper right diagonal
	    
	    while(inBounds(i- ++k, j+k))
	    {
	    	if(chessBoard[i-k][j+k]==c)
	    		return true;
	        if(chessBoard[i-k][j+k]!='-')
	        	break;
	    }
	    
        k=0; // uppper left diagonal
	    
	    while(inBounds(i- ++k, j-k))
	    {
	    	if(chessBoard[i-k][j-k]==c)
	    		return true;
	        if(chessBoard[i-k][j-k]!='-')
	        	break;
	    }
	    return false;
   }
   
   
   static boolean checkForRook(char[][] chessBoard,char c, int i,int j) // +
   {
	   //Check downwards
	   int k=0;
	   while(inBounds(i+ ++k, j))
	   {
		   if(chessBoard[i+k][j]==c)
		   {
			   return true;
		   }
		   if(chessBoard[i+k][j]!='-')
			   break;
	   }
	   
	   k=0; // check upwards
	   while(inBounds(i+ --k, j))
	   {
		   if(chessBoard[i+k][j]==c)
		   {
			   return true;
		   }
		   if(chessBoard[i+k][j]!='-')
			   break;
	   }
	   
	   k=0; // check right
	   while(inBounds(i, j+ ++k))
	   {
		   if(chessBoard[i][j+k]==c)
		   {
			   return true;
		   }
		   if(chessBoard[i][j+k]!='-')
			   break;
	   }
	   
	   k=0; // check left
	   while(inBounds(i, j+ --k))
	   {
		   if(chessBoard[i][j+k]==c)
		   {
			   return true;
		   }
		   if(chessBoard[i][j+k]!='-')
			   break;
	   }
	   return false;
	   
   }
   
   static boolean checkForQueen(char[][] chessBoard,char c,int i,int j)// combination of both bishop and rook
   {
	    
	   if(checkForBishop(chessBoard, c, i, j) || checkForRook(chessBoard, c, i, j) )
	   {
		   return true;
	   }
	   return false;
   }
   
   static boolean checkForKnight(char[][] chessBoard,char c,int i,int j) 
   {
	   // All possible moves from knight 2 steps in 1 direction and and 1 steps in another direction
	   int x[] = {2,2,-2,-2,1,1,-1,-1}; 
	   int y[] = {1,-1,1,-1,2,-2,2,-2};
	   
	   for(int k=0;k<8;k++)
	   { 
		   int m = i+x[k];
		   int n = j+y[k];
		   
		   if(inBounds(m, n) && chessBoard[m][n]==c) // checking the bounds and the 
			   return true;
	   }
	  return false;  
   } 
  
  
  static int checkBoard(char[][] chessBoard)
  {
	  for(int i=0;i<8;i++)
	  {
		  for(int j=0;j<8;j++)
		  {
			  if(chessBoard[i][j]== 'K') // check that if king is preent in chessboard then see possible path
			  {
				  if(checkForKnight(chessBoard,'H',i,j)) // tell that their is horse due to which king in danger
				  {
					  return 1;
				  }

				  if(checkForRook(chessBoard,'E',i,j)) // tell that their is elephant in path due to which king in danger
				  {
					  return 1;
				  }
				  if(checkForBishop(chessBoard,'C',i,j)) // tell that camel is present in the path of the king so that king is danger from the camel
				  {
					  return 1;
				  }
				  if(checkForQueen(chessBoard,'Q',i,j)) // tell that Queen is present in the path of the king so that king in danger
				
				  {
					  return 1;
				  } 
			  }
		  }
	  }
	  return 0;
  }

  
}
