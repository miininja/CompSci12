import java.util.Scanner;
class Assignment3E
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner (System.in);
		double opposite, adjacent, hypotenuse, angle1, angle2;
		System.out.println("Calculate the hypotenuse of a right angle triangle");
		System.out.println("Type in the length of the opposite side");
		opposite = input.nextDouble();
		System.out.println("Type in the length of the adjacent side");
		adjacent = input.nextDouble();
		hypotenuse = Math.sqrt(Math.pow(opposite,2) + Math.pow(adjacent,2));
		angle1 = Math.toDegrees(Math.atan(opposite/adjacent));
		angle2 = Math.toDegrees(Math.acos(opposite/hypotenuse));
		System.out.printf("The hypotenuse (side c) of the opposite (side a) (%s) and the adjacent (side b) (%s) is %s, while angle A is %s and angle B is %s", opposite, adjacent, hypotenuse, angle1, angle2);
	}
}