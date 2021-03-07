import java.util.Scanner;

class Assignment5C
{
	public static void main (String[]args)
	{
		int maxrandom = 100, minrandom = 1,guess, guesses = 0;
		int randomnum= (int)(Math.random()*(maxrandom-minrandom+1)+minrandom);
		boolean guessed = false;
		Scanner input = new Scanner (System.in);
		//System.out.println(randomnum);
		while (guessed == false)
		{
			System.out.println("Guess a number");
			guess = input.nextInt();
			guesses = guesses + 1;
			if (guess > randomnum)
			{
				System.out.println("Incorrect! Guess lower");
			}
			else if (guess < randomnum)
			{
				System.out.println("Incorrect! Guess higher");
			}
			else if (guess == randomnum)
			{
				System.out.printf("Correct! The number was %s and it took you %s tries!", randomnum, guesses);
				guessed = true;
			}
		}
	}
}