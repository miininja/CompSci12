import java.util.Scanner;
class Assignment3B
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner (System.in);
		double num1,square,cube,fourthpower;
		System.out.println("Type in a number");
		num1 = input.nextDouble();
		square = Math.pow(num1, 2);
		cube = num1 * num1 * num1;
		fourthpower = Math.pow(num1, 4);
		System.out.printf("The square of %s is %s%n", num1, square);
		System.out.printf("The cube of %s is %s%n", num1, cube);
		System.out.printf("The fourth power of %s is %s%n", num1, fourthpower);
	}
}