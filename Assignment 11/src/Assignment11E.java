import java.util.Objects;
import java.util.Scanner;

class Assignment11E
{
	public static boolean check(String ask)
	{
		Scanner input = new Scanner (System.in);
		boolean gotanswer = false;
		do {
			System.out.println(ask);
			String answer = input.nextLine().toLowerCase();
			if (Objects.equals(answer, "yes"))
			{
				gotanswer = true;
				break;
			}
			else if (Objects.equals(answer, "no"))
			{
				gotanswer = false;
				break;
			}
		} while (true);
		return gotanswer;
	}
	
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		do
		{
			String dummy;
			System.out.println("Type a sentenance");
			String word1 = input.nextLine();
			int diffchars = 0;
			for (char letter = 'a'; letter <= 'z'; letter++)
			{
				int alphabetnum = diffchars+1;
				int lettercount = 0;
				for (int i = 1; i < word1.length(); i++)
				{
					char x = word1.charAt(i);
					if (Objects.equals(Character.toLowerCase(x), Character.toLowerCase(letter)) == true)
					{
						lettercount = lettercount + 1;
						if (diffchars < alphabetnum)
						{
							diffchars = diffchars + 1;
						}
					}
				}
				if (lettercount > 0)
				{
					System.out.println(letter + " : " + lettercount);
				}
			}

			
			System.out.println("Total chars: " + diffchars);
		} while (check("\n-------------\nTry again?\n-------------"));
	}
}