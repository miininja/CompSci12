import java.util.Objects;
import java.util.Scanner;

class Assignment11D
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
			int runs = 1;
			for (int i = 1; i < word1.length(); i++)
			{
				String char1 = word1.substring(i-1,i);
				String char2 = word1.substring(i,i+1);
				System.out.println(char1 + " " + char2);
				if (Objects.equals(char1, char2) == false)
				{

					runs = runs + 1;
				}
			}
			System.out.println("Total runs: " + runs);
		} while (check("\n-------------\nTry again?\n-------------"));
	}
}