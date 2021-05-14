import java.util.Objects;
import java.util.Scanner;

class Assignment11A
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
			System.out.println("Word 1?");
			//dummy = input.nextLine();
			String word1 = input.nextLine();
			System.out.println("Word 2?");
			//dummy = input.nextLine();
			String word2 = input.nextLine();
			int results = word1.compareTo(word2);
			if (results > 0)
			{
				System.out.printf("%s and %s", word1, word2);
			}
			else if (results == 0)
			{
				System.out.printf("%s and %s", word1, word2);
			}
			else if (results < 0)
			{
				System.out.printf("%s and %s", word2, word1);
			}
			//System.out.println("\n"+results);
		} while (check("\n-------------\nTry again?\n-------------"));
	}
}