import java.util.*;

class Assignment7A
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner (System.in);
		int number;
		double sum = 0;
		System.out.println("\nType a number");
		number = input.nextInt();
		int[] numbers = new int[number];
		for (int i = 0; i < number; i++)
		{
			System.out.println("\nType a number" + i);
			numbers[i] = input.nextInt();
			sum = sum + numbers[i];
		}
		String str = "";
		for (int i = 0; i < number; i++)
		{	
			if (i > 0)
			{
				str = str.concat(", " + String.valueOf(numbers[i]));
			}
			else
			{
				str = str.concat(String.valueOf(numbers[i]));
			}
			//System.out.printf("Indexing place %s with value found: %s\n", i+1, numbers[i]); // PRINT EACH VALUE INDIVIDUALLY
			//System.out.println("test: "+String.valueOf(numbers[i])); // TESTING FOR STRING CONCATENATION
		}
		System.out.println("The average is " + sum/number);
		System.out.println("Numbers: " + str);
	}
}