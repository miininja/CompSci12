import java.util.Objects;
import java.util.Scanner;

class Assignment11B
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
			int wordLength = word1.length();
			String frankenstring = "";
			
			for (int j = wordLength-1; j >= 0; j--)
			{
				frankenstring = frankenstring + word1.charAt(j);
			}
			System.out.println(frankenstring);
		} while (check("\n-------------\nTry again?\n-------------"));
	}
}