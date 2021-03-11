import java.util.Scanner;

class Assignment6G
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner (System.in);
		int num = 0, repeatnum=0, inpnum;
		String  primes = "";
		System.out.println("\nType a number");
		inpnum = input.nextInt();
		boolean running = true;
		while (running == true)
		{
			repeatnum = repeatnum+1;
			int count = 0;
			for(num = repeatnum; num>=1; num--)
			{
				if(repeatnum%num==0)
				{
					count = count + 1;
				}
			}
			if (count ==2)
			{
				primes = primes + repeatnum + " ";
			}	
		}
		System.out.println(primes);
	}
}