import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

class Assignment9C
{
	public static boolean check(String ask)
	{
		Scanner input = new Scanner (System.in);
		boolean gotanswer = false, running = true;
		while (running == true)
		{
			String answer = "", dummy;
			System.out.println(ask);
			answer = input.nextLine().toLowerCase();
			if (Objects.equals(answer, "yes"))
			{
				gotanswer = true;
				break;
			}
			else if (Objects.equals(answer, "no"))
			{
				gotanswer = false;
				break;
			}
		}
		return gotanswer;
	}
	public static void convert(String system, double measurement, String type)
	{
		switch (type.toLowerCase())
		{
		case "metric":
			switch (type)
			{
			case "
			}
		case "imperial":
			switch (type)
			{
			
			}
		default:
			check("Not Metric or Imperial.");
		}
	}
	public static void main (String[]args)
	{
		boolean tryagain = true, repeat;
		String [] options = {"Inches to centimeters", "Feet to centimeters", "Yards to meters", "Miles to kilometers", "Centimerters to inches", "Centimeters to feet", "Meters to yards", "Kilometers to miles",};
		do {
		Scanner input = new Scanner (System.in);
		int answer2 = 0;
		String answer1 = "", answer3 = "", dummy;
		System.out.println("What unit system are you using? (Metric or Imperial)");
		answer1 = input.nextLine().toLowerCase();
		System.out.println("Enter measurement");
		answer2 = input.nextInt();
		System.out.println("What do you want to convert to?");
		dummy = input.nextLine();
		answer3 = input.nextLine().toLowerCase();
		convert(answer1, answer2, answer3);
		} while (check("Try again?"));
	}
}