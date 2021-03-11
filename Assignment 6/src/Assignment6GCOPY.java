import java.util.Scanner;

class Assignment6GCOPY
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner (System.in);
		int number, i;
		boolean isPrime = true; //set the default state to is a prime number
		System.out.println("\nType a number");
		number = input.nextInt();
		for (i = 2; i <= number / 2; i++)
		{	// condition for non-prime
			if (number % i == 0) //if any number divides evenly into number
			{					// then the number is NOT prime
				isPrime = false;
				break; //exit the loop
			}
		} //end of for loop
		if (isPrime == true)
		{
			System.out.printf("%s is a prime number", number);
		}
		else
		{
			System.out.printf("%s is not a prime number", number);
		}
	}
}