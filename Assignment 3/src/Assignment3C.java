import java.util.Scanner;
class Assignment3C
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner (System.in);
		double num1,num2,num3,num4,num5,avg;
		System.out.println("Type in a number");
		num1 = input.nextDouble();
		System.out.println("Type in a number");
		num2 = input.nextDouble();
		System.out.println("Type in a number");
		num3 = input.nextDouble();
		System.out.println("Type in a number");
		num4 = input.nextDouble();
		System.out.println("Type in a number");
		num5 = input.nextDouble();
		avg = (num1+num2+num3+num4+num5)/5;
		System.out.printf("The average is %s%n", avg);
	}
}