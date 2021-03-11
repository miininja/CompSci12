import java.util.Scanner;

class Assignment6B
{
	public static void main (String[]args)
	{
		boolean playing = true;
		Scanner input = new Scanner (System.in);
		while (playing == true)
		{
			int action1, action2, remainder;
			System.out.println("\nType a number to divide");
			action1 = input.nextInt();
			System.out.println("\nType a number to divide by");
			action2 = input.nextInt();
			remainder = action1%action2;
			if (remainder == 0)
			{
				System.out.printf("%s is divisible by %s\n", action1, action2);
			}
			else
			{
				System.out.printf("%s is not divisible by %s\n", action1, action2);
				
			}
			boolean gotanswer = false;
			while (gotanswer == false)
			{
				int action;
				System.out.println("Would you like to try another number? (1=yes/2=no)");
				action = input.nextInt();
				if (action == 1)
				{
					gotanswer = true;
					playing = true;
				}
				else if (action == 2)
				{
					gotanswer = true;
					playing = false;
				}
			}
			
		}
	}
}