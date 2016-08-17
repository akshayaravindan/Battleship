public class print {
	public static void printBoard (int[][] board, String player)
	{
		System.out.println(player + "'s board");
		System.out.println(" |abcdefghi");
		System.out.println("_|_________");
		for (int j = 0; j < 9; j++)
		{
			System.out.printf("%d|", j + 1);
			for (int i = 0; i < 9; i++)
			{
				System.out.printf("%d", board[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void printSee (int[][] see, String player)
	{
		System.out.println(player + "'s radar");
		System.out.println(" |abcdefghi");
		System.out.println("_|_________");
		for (int j = 0; j < 9; j++)
		{
			System.out.printf("%d|", j + 1);
			for (int i = 0; i < 9; i++)
			{
				System.out.printf("%d", see[i][j]);
			}
			System.out.println();
		}
	}
}