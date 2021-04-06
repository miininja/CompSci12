import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

class Assignment8B
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner (System.in);
		int [][] grades = {
				{87, 73, 88, 92}, // 1
				{65, 57, 69, 60}, // 2
				{52, 57, 62, 63}, // 3
		};
		for (int i = 0; i < grades.length; i++)
		{
			double studentavg = 0;
			for (int j = 0; j < grades[i].length; j++)
			{
				studentavg = studentavg + grades[i][j];
			}
			System.out.printf("Student %s's average is %s\n", i+1, studentavg/grades[i].length);
		}
		for (int i = 0; i < grades.length; i++)
		{
			int avg = 0;
			double [] testavg = new double[4];
			for (int j = 0; j < grades.length; j++)
			{
			avg = avg + grades[j][i];
			}
			
			System.out.printf("Test %s's average is %s\n", i+1, avg/grades.length);
		}
	}
}