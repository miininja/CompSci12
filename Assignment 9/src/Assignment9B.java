import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

class Assignment9B
{
	public static boolean check(String ask)
	{
		Scanner input = new Scanner (System.in);
		boolean gotanswer = false;
		while (gotanswer == false)
		{
			String answer = "", dummy;
			System.out.println(ask);
			answer = input.nextLine().toLowerCase();
			if (Objects.equals(answer, "yes"))
			{
				gotanswer = true;
			}
			else if (Objects.equals(answer, "no"))
			{
				gotanswer = true;
				break;
			}
		}
		return gotanswer;
	}
	public static void convert(double temp, String type)
	{
		switch (type.toLowerCase())
		{
		case "f":
			System.out.printf("%s fahrenheit to celsius: %1.1f\n", temp, (temp - 32) / 1.8);
			break;
		case "c":
			System.out.printf("%s celsius to fahrenheit: %1.1f\n", temp, (temp * 1.8) + 32);
			break;
		default:
			check("Not Celsius or Fahrenheit.");
		}
	}
	public static void main (String[]args)
	{
		boolean tryagain = true;
		do {
		Scanner input = new Scanner (System.in);
		int answer1 = 0;
		String answer2 = "", dummy;
		System.out.println("Whats the temperature?");
		answer1 = input.nextInt();
		System.out.println("What do you want to convert to? (f or c)");
		dummy = input.nextLine();
		answer2 = input.nextLine().toLowerCase();
		convert(answer1, answer2);
		} while (check("Try again?"));
	}
}