import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

class Assignment7C
{
	public static void main(String[] args)
	{
		boolean running = true;
		while (running == true)
		{
			Scanner sc = new Scanner(System.in);
			int rolls;
			System.out.println("How many rolls?");
			rolls = sc.nextInt();
			int[] rollamounts = new int[11];
			for (int i = 1; i <= rolls; i++)
			{
				int total = 0;
				for (int j = 1; j <= 2; j++)
				{
					double randnum = Math.random();
					randnum = randnum * 6;
					int randint = (int)randnum + 1;
					total = total + randint;
				}
				rollamounts[total-2] = rollamounts[total-2] + 1;
			}
			for (int i = 2; i <= 12; i++)
			{
				System.out.printf("Rolled %s: %s times\n", i, rollamounts[i-2]);
			}
			boolean gotAnswer = false;
			String dummy;
			while (gotAnswer == false)
			{
				String answer;
				System.out.println("Would you like to try again?");
				dummy = sc.nextLine();
				answer = sc.nextLine().toLowerCase();
				//int option = sc.nextInt();
				//sc.nextLine();  // Consume newline left-over
				//answer = sc.nextLine();
				if (Objects.equals(answer, "yes"))
				{
					gotAnswer = true;
					break;
				}
				else if (Objects.equals(answer, "no"))
				{
					gotAnswer = true;
					running = false;
					break;	
				}
			}
		}
	}
}