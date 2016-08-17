import java.util.*;
public class coords {
	public int convert(Scanner in)
	{
		while(true)
		{
			int answer = convertProcess(in.nextLine());
			if (answer != 420)
				return answer;
			System.out.println("Enter coordinates like this: a1, g8, c7, etc.");
		}
	}
	
	public static int convertProcess(String input)
	{
		//this method converts input such as "a1" and "g9" to integers
		//such as 0 and 68 for later use.
		
		boolean letterTrue = false;
		boolean numberTrue = false;
		int output = 0;
		char c = input.charAt(0);
		char n = input.charAt(1);
		
		if (c >= 'a' && c <= 'i')
			letterTrue = true;
		if (n >= '1' && n <= '9')
			numberTrue = true;
		if (!(input.length() == 2 && letterTrue && numberTrue))
			return 420;
		

		//conversion
		int result = Integer.parseInt(input.substring(1,2));
		switch (c)
		{
		case 'a':
			output = 0;
			break;
		case 'b':
			output = 10;
			break;
		case 'c':
			output = 20;
			break;
		case 'd':
			output = 30;
			break;
		case 'e':
			output = 40;
			break;
		case 'f':
			output = 50;
			break;
		case 'g':
			output = 60;
			break;
		case 'h':
			output = 70;
			break;
		case 'i': 
			output = 80;
			break;
		default: break;
		}
		

		output = output + result - 1;
		return output;
		
	}
}