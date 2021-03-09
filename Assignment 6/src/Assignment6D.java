import java.util.Scanner;

class Assignment6D
{
	public static void main (String[]args)
	{
		boolean playing = true;
		Scanner input = new Scanner (System.in);
		while (playing == true)
		{
			
			int action, digit, number,sum=0;
			/*System.out.println("\nType a number");
			action = input.nextInt();
			number = action;*/
			int repeatnum, temp;
			for (repeatnum = 1; repeatnum <= 100; repeatnum = repeatnum +1);
			{
				do
				{
					temp = repeatnum;
					digit = temp%10;
					temp=temp/10;
					//System.out.println(digit);
					sum=sum+digit;
				} while (temp>0);
			}
			//System.out.printf("The sum of %s is %s",action, sum);
			boolean gotanswer = false;
			while (gotanswer == false)
			{
				int act;
				System.out.println("\nWould you like to try another number? (1=yes/2=no)");
				act = input.nextInt();
				if (act == 1)
				{
					gotanswer = true;
					playing = true;
				}
				else if (act == 2)
				{
					gotanswer = true;
					playing = false;
				}
			}
			
		}
	}
}