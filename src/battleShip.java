import java.util.*;

public class battleShip {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		print input = new print();
		placeShip ship = new placeShip();

		int[][] board1 = new int[][]
		{
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		 	{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		};
		
		int[][] board2 = new int[][]
		{
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
	    };
	    
		int[][] see1 = new int[][]
		{
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
	    };
	    
		int[][] see2 = new int[][]
		{
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
	    };
	    System.out.println("__________         __    __  .__                .__    .__        ");
	    System.out.println("\\______   \\_____ _/  |__/  |_|  |   ____   _____|  |__ |__|_____  ");
	    System.out.println(" |    |  _/\\__  \\\\   __\\   __\\  | _/ __ \\ /  ___/  |  \\|  \\____ \\ ");
	    System.out.println(" |    |   \\ / __ \\|  |  |  | |  |_\\  ___/ \\___ \\|   Y  \\  |  |_> >");
	    System.out.println(" |______  /(____  /__|  |__| |____/\\___  >____  >___|  /__|   __/ ");
	    System.out.println("        \\/      \\/                     \\/     \\/     \\/   |__|    ");
	    
		System.out.println("Welcome to Battleship!");
		System.out.println("If you don't know the rules, search them up on Wikipedia.");
		System.out.println("===================================================================");
		
		//usernames
		String player1, player2;
		System.out.println("Hello player 1, what's your name?");
		player1 = in.nextLine();
		System.out.println("Hello player 2, what's your name?");
		player2 = in.nextLine();
		System.out.println("Cool! Hello " + player1 + " and " + player2 +", let's get started!");
		System.out.println("===================================================================");

		//ship placement
		System.out.println(player1 + ", it is time for you to place your ships.");
		System.out.println("You will place an aircraft carrier, a battleship, a submarine, a destroyer, and a patrol boat, in that order.");
		System.out.println("They are respectively 5, 4, 3, 3, and 2 tiles long.");
		System.out.println();
		System.out.println("Instructions for placement:");
		System.out.println("First, select the coordinate you want to place an endpoint of the ship in.");
		System.out.println("Next, select whether you want the ship to extend up, down, left or right.");
		System.out.println("Good luck!");
		ship.placeInit(board1, player1);
		
		for (int i = 0; i < 30; i++)
			System.out.println("Spoiler Wall");

		System.out.println(player2 + ", now it's your turn to place your ships.");
		System.out.println("You will place an aircraft carrier, a battleship, a submarine, a destroyer, and a patrol boat, in that order.");
		System.out.println("They are respectively 5, 4, 3, 3, and 2 tiles long.");
		System.out.println();
		System.out.println("Instructions for placement:");
		System.out.println("First, select the coordinate you want to place an endpoint of the ship in.");
		System.out.println("Next, select whether you want the ship to extend up, down, left or right.");
		System.out.println("Good luck!");
		ship.placeInit(board2, player2);
		
		for (int i = 0; i < 30; i++)
			System.out.println("Spoiler Wall");
		System.out.println("Boards should be set, time for the pew pew!");
		
		boolean isGameRunning = true;
		int turn = 1;
		while (isGameRunning)
		{
			if (turn == 1)
			{
				print.printSee(see1, player1);
				print.printBoard(board1, player1);
				battle.fire(board2, see1, player1);

			}
			if (turn == 2)
			{
				print.printSee(see2, player2);
				print.printBoard(board2, player2);
				battle.fire(board1, see2, player2);
			}
			
			isGameRunning = false;
			out:
			for (int j = 0; j < 9; j++)
			{
				for (int i = 0; i < 9; i++)
				{
					if (board1 [i][j] == 1)
					{
						isGameRunning = true;
						break out;
					}
					if (board2 [i][j] == 1)
					{
						isGameRunning = true;
						break out;
					}
				}
				System.out.println();
			}
			
			if (turn == 1)
				turn = 2;
			else
				turn = 1;
		}
		
		if (turn == 1)
			System.out.println("Player 2 Wins!");
		if (turn == 2)
			System.out.println("Player 1 Wins!");
	}
	
}