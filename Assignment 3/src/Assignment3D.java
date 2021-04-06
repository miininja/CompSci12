import java.util.*;
class Assignment3D
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner (System.in);
		double radius, area;
		System.out.println("Type in the radius of a circle");
		radius = input.nextDouble();
		area = Math.pow(radius, 2) * Math.PI;
		System.out.printf("The area of a circle with the radius of %s is %s", radius, area);
	}
}