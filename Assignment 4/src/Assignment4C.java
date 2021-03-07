class Assignment4C
{
	public static void main (String[]args)
	{
		int repeatnum;
		for (repeatnum = 50; repeatnum <= 70; repeatnum = repeatnum +1)
		{
			float square;
			square = (float) Math.sqrt(repeatnum);
			System.out.printf("%.5f%n",square);
		}
	}
}