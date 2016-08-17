import java.util.*;

public class battle {
	public static void fire (int board[][], int see[][], String player)
	{
		Scanner in = new Scanner(System.in);
		int coords = 0;
		
		boolean canFire = false;
		while (canFire == false)
		{
			coords = placeShip.convert(in);
			if (board[(coords - (coords % 10)) / 10][coords % 10] != 2)
				canFire = true;
			else
				System.out.println("You have already attacked there. Try somewhere else.");
		}
		
		if (board[(coords - (coords % 10)) / 10][coords % 10] == 0)
		{
			System.out.println("You missed!");
			board[(coords - (coords % 10)) / 10][coords % 10] = 2; // miss
			see[(coords - (coords % 10)) / 10][coords % 10] = 1; // show firing player they missed
		}
		
		if (board[(coords - (coords % 10)) / 10][coords % 10] == 1)
		{
			System.out.println("That's a hit!");
			board[(coords - (coords % 10)) / 10][coords % 10] = 2; // hit
			see[(coords - (coords % 10)) / 10][coords % 10] = 2; // show firing player they hit
		}
	}
}