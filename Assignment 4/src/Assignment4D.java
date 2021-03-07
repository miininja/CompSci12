import java.util.Arrays;

class Assignment4D
{
	public static void main (String[]args)
	{
		int [][] array = new int[10][3];
		int repeatnum, repeatnum2;
		for (repeatnum = 0; repeatnum <= 9; repeatnum = repeatnum +1)
		{
			double tempnum = repeatnum + 1;
			array[repeatnum][0] = (int)tempnum;
			array[repeatnum][1] = (int) Math.pow(tempnum, 2);
			array[repeatnum][2] = (int) Math.pow(tempnum, 3);
		}
		for (repeatnum = 0; repeatnum <= 9; repeatnum = repeatnum +1)
		{
			for (repeatnum2 = 0; repeatnum2 <= 2; repeatnum2 = repeatnum2 +1)
			{
				System.out.print(array[repeatnum][repeatnum2] +" ");
			}
			System.out.println();
		}
	
	}
}