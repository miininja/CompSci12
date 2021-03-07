import java.util.*;

class Assignment5B
{
	public static void main (String[]args)
	{
		int num1,num2,sum;
		String question = null;
		Scanner input = new Scanner (System.in);
		System.out.println("Type in a number");
		num1 = input.nextInt();
		System.out.println("Type in a number");
		num2 = input.nextInt();
		System.out.println("Would you like to add or multiply?");
		question = (input.next().toLowerCase());
		//System.out.println(question);
		switch (question)
		{
			case "add":
				sum = num1+num2;
				System.out.printf("The sum of %s and %s added together is %s", num1,num2, sum);
				break;
			case "multiply":
				sum = num1*num2;
				System.out.printf("The sum of %s and %s multiplied together is %s", num1,num2, sum);
				break;
		
		}
	}
}