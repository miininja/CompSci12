import java.util.Scanner;

class Assignment5D
{
	public static void main (String[]args)
	{
		boolean playing = true;
		Scanner input = new Scanner (System.in);
		String words [] = {"Rock","Paper","Scissors","Lizard","Spock"};
		System.out.println("1 = Rock, 2 = Paper, 3 = Scissors, 4 = Lizard, 5 = Spock");
		while (playing == true)
		{
			int maxrandom = 5, minrandom = 1, action, tries = 0;
			int opponent = (int)(Math.random()*(maxrandom-minrandom+1)+minrandom);
			System.out.println("\nType a number (1-5)...");
			action = input.nextInt();
			tries = tries + 1;
			if (action == 1)
			{
				System.out.printf("Opponent used %s",words[opponent-1]);
				if (opponent == 3 || opponent == 4)
				{
					System.out.println("\nYou win!");
					playing = false;
					break;
				}
			}
			else if (action == 2)
			{
				System.out.printf("Opponent used %s",words[opponent-1]);
				if (opponent == 1 || opponent == 5)
				{
					System.out.println("\nYou win!");
					playing = false;
					break;
				}
			}
			else if (action == 3)
			{
				System.out.printf("Opponent used %s",words[opponent-1]);
				if (opponent == 2 || opponent == 4)
				{
					System.out.println("\nYou win!");
					playing = false;
					break;
				}
			}
			else if (action == 4)
			{
				System.out.printf("Opponent used %s",words[opponent-1]);
				if (opponent == 2 || opponent == 5)
				{
					System.out.println("\nYou win!");
					playing = false;
					break;
				}
			}
			else if (action == 5)
			{
				System.out.printf("Opponent used %s",words[opponent-1]);
				if (opponent == 1 || opponent == 3)
				{
					System.out.println("\nYou win!");
					playing = false;
					break;
				}
			}
		}
	}
}