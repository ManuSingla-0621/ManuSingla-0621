import java.util.Random;
import java.util.Scanner;

public class AgainTask {
  // Driver Code (where execution starts from their)
  public static void main(String[] args) {
	 //Create a scanner class object
	  Scanner scanner=new Scanner(System.in); // create the scanner object
	  Random random = new Random();
	  System.out.println("Enter the size of the n*n matrix : ");
	  int size = scanner.nextInt();
	  char[][] sweeperBoard=new char[size][size]; // creating the sweeperBoard
	  int bombs=size;
	  int minesVacantSpace= (size*size)-bombs;   // vacant spaces left after bomb placed
	  randomlyGeneratedByUser(bombs,random,size,sweeperBoard); // randomly putiing value
	  
	  int minesGivenByUser=minesMethod(scanner,minesVacantSpace);
	  
	  possibleOrNot(sweeperBoard,minesGivenByUser,size); // check safe or not safe place
	  printingOutput(sweeperBoard, size); // printing function
	  scanner.close();//close the resource so that resource leakage not happen
  }
// MARK : mines inputing
// Description : mines given by user
  static int  minesMethod(Scanner scanner,int minesVacantSpace)
  {
	  int minesGivenByUser =Integer.MAX_VALUE;
	  do
	  {
		  System.out.println("Please Enter the Number of Mines placed by the user : ");
		  minesGivenByUser=scanner.nextInt();
		  if(minesGivenByUser<=minesVacantSpace)
		  {
			  break;
		  }
	  }while(true);
	  return minesGivenByUser;
  }
// MARK : Random Generation Bomb place in matrix
// DESCRIPTION : Randomly generated placed and putting bomb on that
  static void randomlyGeneratedByUser(int bombs,Random random,int size,char[][] sweeperBoard)
  {
	  System.out.println("Please! Enter the places where we have to put the BOMBS : ");
	  System.out.println("Bombs are : "+bombs);
	  while(bombs>0)
	  {
	        System.out.println("Enter the row index where we have to place the bombs : ");
	        int row=random.nextInt(size*size);
	        System.out.println("Enter the column index where we have to place the bombs : ");
	        int col=random.nextInt(size*size);
	        System.out.println("Randomly generated : "+row+" "+col);
	        if(isValid(sweeperBoard,row,col,size-1,size-1)==true && sweeperBoard[row][col]!='B')
	        {
	        	sweeperBoard[row][col]='B';
	        	bombs--;
	        }   
	  }
	  printingOutput(sweeperBoard, size);
  }
//MARK : Bound-cHECKING
//DESCRIPTION : Check the bounds so that mines are placed in the matrix not out of the matrix
	  static boolean isValid(char[][] sweeperBoard,int row,int col,int rowLast,int colLast) // checking the bounds conditions
	  {
		  return row>=0 && col>=0 && row<=rowLast && col<=colLast;
	  }
// MARK: Tell that weather it is User is winn or not
// DESCRIPTION : 
    static void possibleOrNot(char[][] sweeperBoard,int minesGivenByUser,int size)
    {
       Scanner scanner = new Scanner(System.in);
      while(minesGivenByUser>0)
   	  {
   		    System.out.println("Enter the row index where we have to place the mines : ");
   	        int row=scanner.nextInt();
   	        System.out.println("Enter the column index where we have to place the mines : ");
   	        int col=scanner.nextInt();
   	        
   	        if(isValid(sweeperBoard,row,col,size-1,size-1))
   	        {
   	        	if(sweeperBoard[row][col]=='M')
   	        	{
   	        		 System.out.println("Please enter the valid input! You are putting mine over mine");
   	        	}
   	           else if(sweeperBoard[row][col]!='B')
   	        	{
   	        		sweeperBoard[row][col]='M';
   	        	    minesGivenByUser--;
   	        	}
   	        	else
   	        	{
                         System.out.println("Unsafe place mines put above in Bomb");
                         printingOutput(sweeperBoard, size);
                         System.exit(0);
   	        	}
   	        }
   	  }
   	  System.out.println("All mines are places on safe place");
    }
// MARK : Printing
// DESCRIPTION : Printing the entire matrix
    static void printingOutput(char[][] sweeperBoard,int size) // printing the output on the screen
    {
      for(int i=0;i<size;i++)
   	  {
   		  for(int j=0;j<size;j++)
   		  {
   			  System.out.print(sweeperBoard[i][j]+" ");
   		  }
   		  System.out.println();
   	  }
    }

}