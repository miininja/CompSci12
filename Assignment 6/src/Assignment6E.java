import java.util.Scanner;

class Assignment6E
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner (System.in);
		int repeatnum, action, number, digit;
		System.out.println("\nType a number");
		action = input.nextInt();
		number = action;
		int ones=0, twos=0;
		do
		{
			digit = number%10;
			if (digit == 1)
			{
				ones=ones+1;
			}
			else if (digit == 2)
			{
				twos=twos+1;
			}
			number=number/10;
		} while (number>0);
		if (ones > twos)
		{
			System.out.printf("%s has more ones than twos", action);
		}
	}
}