import java.util.Scanner;

class Assignment6F
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner (System.in);
		int repeatnum, inpnum, totalnums=0;
		System.out.println("\nType a number");
		inpnum = input.nextInt();
		for (repeatnum = 1; repeatnum <= inpnum; repeatnum = repeatnum +1)
		{
			int ones=0, twos=0, number = repeatnum, digit;
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
			if (ones == twos+1)
			{
				System.out.println(repeatnum);
				totalnums=totalnums+1;
			}
		}
		System.out.printf("%s has %s numbers with one more 1 than 2", inpnum, totalnums);
	}
}