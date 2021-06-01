import java.util.Objects;
import java.util.Scanner;

class Assignment12A
{
	public static boolean check(String ask)
	{
		Scanner input = new Scanner (System.in);
		boolean gotanswer = false;
		do {
			System.out.println(ask);
			String answer = input.nextLine().toLowerCase();
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
		} while (true);
		return gotanswer;
	}
	public static void main (String[] args)
	{
		Athlete person = new Athlete("Amy","defense",21,5);
		person.displayAthlete();
		while (check("\nWould you like to change a variable?")){
		person.changeVars();
		person.displayAthlete();
		}
	}
}
