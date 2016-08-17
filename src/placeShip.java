import java.util.*;

public class placeShip {
	public static int convert (Scanner in)
	{
		while(true)
		{
			int answer = coords.convertProcess(in.nextLine());
			if (answer != 420)
				return answer;
			System.out.println("Enter coordinates like this: a1, g8, c7, etc.");
		}
	}
	
	public void placeInit(int[][] board, String player)
	{
		
		placeShip ship = new placeShip();

		System.out.println("Here's your map, " + player);
		print.printBoard(board, player);
		
		System.out.println("Place your carrier:");
		ship.place(5, board);
		print.printBoard(board, player);
		
		System.out.println("Place your battleship:");
		ship.place(4, board);
		print.printBoard(board, player);
		
		System.out.println("Place your submarine:");
		ship.place(3, board);
		print.printBoard(board, player);
		
		System.out.println("Place your destroyer:");
		ship.place(3, board);
		print.printBoard(board, player);
		
		System.out.println("And finally, place your patrol boat:");
		ship.place(2, board);
		print.printBoard(board, player);
		
	}
	
	public void place(int length, int[][] board)
	{
		Scanner in = new Scanner(System.in);
		
		int input = 0;
		int coords = 0;
		int let = 0;
		int num = 0;
		
		boolean upTrue = true;
		boolean downTrue = true;
		boolean leftTrue = true;
		boolean rightTrue = true;
		
		System.out.println("Select end point (enter coordinates):");
		
		//System.out.println(coords);
		
		boolean canPlace = false;
		while (canPlace == false)
		{
			canPlace = false;
			coords = convert(in);
			let = (coords - (coords % 10)) / 10;
			num = coords % 10;
			upTrue = true;
			downTrue = true;
			leftTrue = true;
			rightTrue = true;
			
			if (board[(coords - (coords % 10)) / 10][coords % 10] == 0)
			{
				//up
				for (int i = num; i > num - length; i--)
				{
					if (i < 0 || i > 8 || board [let][i] != 0)
					{
						System.out.println("Can't extend upwards");
						upTrue = false;
						break;
					}
				}
				
				//down
				for (int i = num; i < num + length; i++)
				{
					if (i < 0 || i > 8 || board [let][i] != 0)
					{
						System.out.println("Can't extend downwards");
						downTrue = false;
						break;
					}
				}
				
				//left
				for (int i = let; i > let - length; i--)
				{
					if (i < 0 || i > 8 || board [i][num] != 0)
					{
						System.out.println("Can't extend leftwards");
						leftTrue = false;
						break;
					}
				}
				
				//right
				for (int i = let; i < let + length; i++)
				{
					if (i < 0 || i > 8 || board [i][num] != 0)
					{
						System.out.println("Can't extend rightwards");
						rightTrue = false;
						break;
					}
				}

				if (!(upTrue == false && downTrue == false && leftTrue == false && rightTrue == false))
				{
					canPlace = true;
				}
				else
					System.out.println("Sorry, your ship can't go there.");	
				
			}
			else
				System.out.println("Sorry, your ship can't go there.");
			

		}

		if (upTrue)
			System.out.println("Press (1) to extend upwards");
		if (downTrue)
			System.out.println("Press (2) to extend downwards");
		if (leftTrue)
			System.out.println("Press (3) to extend leftwards");
		if (rightTrue)
			System.out.println("Press (4) to extend rightwards");
			
		
		boolean done = false;
		do
		{
			input = in.nextInt();
			if (input == 1 && upTrue)
			{
				for (int i = num; i > num - length; i--)
				{
					board[let][i] = 1;
				}
				done = true;
			}
			if (input == 2 && downTrue)
			{
				for (int i = num; i < num + length; i++)
				{
					board[let][i] = 1;
				}
				done = true;
			}
			if (input == 3 && leftTrue)
			{
				for (int i = let; i > let - length; i--)
				{
					board[i][num] = 1;
				}
				done = true;
			}
			if (input == 4 && rightTrue)
			{
				for (int i = let; i < let + length; i++)
				{
					board[i][num] = 1;
				}
				done = true;
			}
			else
			{
				System.out.println("Enter a number that's on the list.");
			}
		} while (done == false);
	}
}