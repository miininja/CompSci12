import java.util.Scanner;

class Assignment6A
{
	public static void main (String[]args)
	{
		boolean playing = true;
		Scanner input = new Scanner (System.in);
		while (playing == true)
		{
			int action, remainder;
			System.out.println("\nType a number");
			action = input.nextInt();
			remainder = action%2;
			if (remainder == 0)
			{
				System.out.printf("%s is even\n", action);
			}
			else
			{
				System.out.printf("%s is odd\n", action);
				
			}
			boolean gotanswer = false;
			while (gotanswer == false)
			{
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