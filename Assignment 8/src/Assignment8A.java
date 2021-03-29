import java.util.*;

class Assignment8A
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner (System.in);
		int [][] grades = {
				{95, 91, 97, 88, 94}, // amy
				{56, 59, 55, 67, 62}, // bill
				{67, 63, 61, 69, 58}, // carmen
				{89, 82, 85, 81, 91}, // dave
				{78 ,80, 72, 76, 87}, // ellen
		};
		String [] people = {"Amy", "Bill", "Carmen", "Dave", "Ellen"};
		//String [] temppeople = Arrays.toString(people).toLowerCase();
		String chosenstudent = "", dummy;
		String peoplestring = "";
		for (int i = 0; i < people.length; i++)
		{	
			if (i > 0)
			{
				peoplestring = peoplestring.concat(", " + String.valueOf(people[i]));
			}
			else
			{
				peoplestring = peoplestring.concat(String.valueOf(people[i]));
			}
			//System.out.printf("Indexing place %s with value found: %s\n", i+1, numbers[i]); // PRINT EACH VALUE INDIVIDUALLY
			//System.out.println("test: "+String.valueOf(numbers[i])); // TESTING FOR STRING CONCATENATION
		}
		System.out.printf("Display grades for which student? (%s)\n", peoplestring);
		chosenstudent = input.nextLine();
		boolean foundstudent = false;
		int studentindex = 0;
		for (int i = 0; i < people.length; i++)
		{
			if (Objects.equals(chosenstudent.toLowerCase(), people[i].toLowerCase()))
			{
				foundstudent = true;
				studentindex = Arrays.asList(people).indexOf(people[i]);
			}
		}
		if (foundstudent == true)
		{
			String str = "";
			for (int i = 0; i < grades[studentindex].length; i++)
			{	
				System.out.printf("Period %s: %s%%\n", i+1, grades[studentindex][i]);
			}
		}
		String answer = "";
		System.out.println("Would you like to change a grade?");
		answer = input.nextLine().toLowerCase();
		if (Objects.equals(answer, "yes"))
		{
			boolean gotperiod = false, gotgrade = false;
			int periodtochange, gradetochange;
			while (gotperiod == false)
			{
				System.out.printf("What period? (1-%s)\n", grades[studentindex].length);
				periodtochange = input.nextInt();
			}
			System.out.println("What should the grade be changed to?");
			gradetochange = input.nextInt();
			grades[studentindex][periodtochange-1] = gradetochange;
		}
	}
}