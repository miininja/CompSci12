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
	public static String convert(int option, double measurement)
	{
		//system = what measurement their using
		// measurement = number
		// type = what they want to convert to (centimeter to mile, inch, foot etc.
		/*switch (system.toLowerCase())
		{
		case "metric":
			switch (type)
			{
			case "inch":
				double tempnum = measurement
			}
		case "imperial":
			switch (type)
			{
			
			}
		default:
			check("Not Metric or Imperial.");
			return "N/A";
		}*/
		switch (option)
		{
		case 1:
			double tempdouble1 = measurement * 2.54;
			return Double.toString(tempdouble1);
		case 2:
			double tempdouble2 = measurement * 30.48;
			return Double.toString(tempdouble2);
		case 3:
			double tempdouble3 = measurement / 1.1;
			return Double.toString(tempdouble3);
		case 4:
			double tempdouble4 = measurement * 1.6;
			return Double.toString(tempdouble4);
		case 5:
			double tempdouble5 = measurement / 2.54;
			return Double.toString(tempdouble5);
		case 6:
			double tempdouble6 = measurement / 30.48;
			return Double.toString(tempdouble6);
		case 7:
			double tempdouble7 = measurement * 1.1;
			return Double.toString(tempdouble7);
		case 8:
			double tempdouble8 = measurement / 1.6;
			return Double.toString(tempdouble8);
		}
		return "N/A";
	}
	public static void main (String[]args)
	{
		boolean tryagain = true, repeat;
		String [] options = {"Inches to centimeters", "Feet to centimeters", "Yards to meters", "Miles to kilometers", "Centimerters to inches", "Centimeters to feet", "Meters to yards", "Kilometers to miles",};
		do {
		Scanner input = new Scanner (System.in);
		int answer2 = 0;
		double answer1 = 0;
		String answer4 = "", answer3 = "", dummy;
		//System.out.println("What unit system are you using? (Metric or Imperial)");
		//answer1 = input.nextLine().toLowerCase();
		System.out.println("Enter measurement");
		answer1 = input.nextDouble();
		System.out.println("What do you want to convert to?");
		for (int i = 0; i < options.length; i++)
		{
			System.out.println(i+1 + ". " + options[i]);
		}
		answer2 = input.nextInt();
		System.out.println(convert(answer2, answer1));
		} while (check("Try again?"));
	}
}