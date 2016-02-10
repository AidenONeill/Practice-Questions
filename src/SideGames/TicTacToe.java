package SideGames;
import java.util.Scanner;
import java.util.Arrays;

public class TicTacToe
{

	private static char[][] board= new char[3][3];  //declare static variables needed through the other methods
	private static char playerIcon;
	private static boolean end = false;
    private static int count = 0;


	public static void main(String args[])
	{
		playerIcon='x';//setting the starting player to x
		setBoard(); //resetting the board
		playGame();
		printBoard(); // printing the board a final time after the playGame method terminates

	}


	public static void setBoard()  // reset all values  in all rows and columns of the array to empty
	{
		for(int i=0;i<3;i++)  	//runs through the rows
		{
			for(int j=0;j<3;j++) // runs through the columns
			{
				board[i][j] = ' ';
			}
		}

	}


		public static void printBoard()   // prints the current board to the screen, as well as labels the rows and columns to make input easier to understand
		{
		   System.out.println("---0---1---2--");

		    for(int i=0;i<3;i++)
		    {
		   	  System.out.print(i+ "| ");

			   for(int j=0;j<3;j++)
			   {
				System.out.print(board[i][j]+" | ");
			   }
			    System.out.println();
                System.out.println("--------------");
	        }

		}

					public static void playGame()  // code to run through the game, calls on the method to check if there is a winner, if there is a draw and calls on the method to swap the players
					{
						while(end!=true)
					 {
					 	@SuppressWarnings("resource")
						Scanner input = new Scanner(System.in);  //declare a scanner to take user input
						int row = 0,column = 0;
						boolean correct = false;//boolean to check if the user input is valid

						printBoard();
						System.out.println("The current player is: "+ playerIcon);

					            while(correct == false)// while loop to check if the space the user picks is empty, if not it prompts them to pick a new spot
					            {
					               System.out.println("Please enter the row of your move(rows are the vertical numbers along the side: ");
					               row = input.nextInt();

					               System.out.println("Please enter the column of your move(columns are the horizontal numbers across the top): ");
					               column = input.nextInt();

					            	if(board[row][column]!= ' ')
					            	 {
					            	  System.out.println("The position is already filled, please try again");

					            	 }
					            	 else if(board[row][column]==' ')// if input is correct it ends the while loop
					            	 {
					            		correct = true;
					            	 }

					            }


			            board[row][column] = playerIcon;
			            count++;  							// count variable to check if all elements of the array have been filled
			            checkWinCondition();				// calls method to check for a winner
			            playerDraw();						// calls the method to check if it is a draw
			            swapPlayer();						// calls method to swap the players

			            if(count==9) // check if all of the array has recieved a valid input
					    {
					       end = true;
					    }

					 }

					}


					        public static void swapPlayer() // changes between the players
					        {
						         if (playerIcon == 'x')
						          {
						             playerIcon = 'o';
						          }
						        else
						          {
						             playerIcon = 'x';
						          }
					        }

								public static void checkWinCondition()// check if three of the same icon are in a row
								{
									boolean printWin = false;

									for(int i=0;i<3;i++)
									{
									 if (board[i][0] == playerIcon && board[i][1] == playerIcon && board[i][2] == playerIcon||//checks the rows
									 	 board[0][i] == playerIcon && board[1][i] == playerIcon && board[2][i] == playerIcon||//checks the columns
									 	 board[0][0] == playerIcon && board[1][1] == playerIcon && board[2][2] == playerIcon||// checks the diagonal from bottom left to top right
									 	 board[0][2] == playerIcon && board[1][1] == playerIcon && board[2][0] == playerIcon)// checks the diagonal from bottom right to top left
									 {

						              printWin = true;
									  end = true;
									 }

									}
									if(printWin==true)
									{
										System.out.println("We have a winner! Thank you for playing");
									}

								}

									public static void playerDraw()
									{

									boolean printDraw = false;

									if(Arrays.asList(board).contains('-') )
									{
										printDraw = false;
									}
									else
									{
										printDraw = true;
									}

									if(printDraw==true)
									{
										System.out.println("We have a draw. Thank you for playing");

									}










									}



						}