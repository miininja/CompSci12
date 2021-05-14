import java.util.Objects;
import java.util.Scanner;

class Assignment11C
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
			String newstr = word1;
			for (int i = 0; i < word1.length(); i++)
			{
				newstr = newstr.replaceAll("FOO", "OOF");
			}
			System.out.println(newstr);
		} while (check("\n-------------\nTry again?\n-------------"));
	}
}