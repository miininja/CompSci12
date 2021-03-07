import java.util.*;

class Assignment5A
{
	public static void main (String[]args)
	{
		boolean running = true;
		while (running == true)
		{
			int num,question;
			Scanner input = new Scanner (System.in);
			System.out.println("Type in a number");
			num = input.nextInt();
			if (num < 50)
			{
				System.out.printf("%s is less than 50", num);
			}
			else if (num == 50)
			{
				System.out.printf("%s is equal than 50", num);
			}
			else if (num > 50)
			{
				System.out.printf("%s is greater than 50", num);
			}
			System.out.println("\nWould you like to continue? (1=yes/0=no)");
			question = input.nextInt();
			if (question == 0)
			{
				System.out.println("Stopping...");
				running = false;
				break;
			}
			else if (question == 1)
			{
				running = true;
			}
			else if (question != 1 || question != 0)
			{
				System.out.println("Not a 0 or 1. Try again");
				boolean tryagain = true;
				
				while (tryagain == true)
				{
					System.out.println("Would you like to continue? (1=yes/0=no)");
					question = input.nextInt();
					if (question == 1)
					{
						tryagain = false;
					}
					else if (question == 0)
					{
						System.out.println("Stopping...");
						running = false;
						break;
					}
					else if (question != 1 || question != 0)
					{
						System.out.println("Not a 0 or 1. Try again");
					}
				}
				//break;
			}
		}
	}
}