class Assignment6D
{
	public static void main (String[]args)
	{
		int repeatnum, temp;
		for (repeatnum = 1; repeatnum <= 100; repeatnum = repeatnum +1)
		{
			System.out.println(repeatnum);
			temp = repeatnum;
			int sum = 0, digit = 0;
			do
			{
				digit = temp%10;
				temp=temp/10;
				sum=sum+digit;
			} while (temp>0);
			System.out.printf("The sum of digits of %s is %s\n",repeatnum, sum);
		}
	}
}