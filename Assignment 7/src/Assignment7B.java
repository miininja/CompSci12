import java.util.*;

class Assignment7B
{
	public static void main(String[] args)
	{
		String [] planetnames = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune", "pluto"};
		int [] planetmoons = {0,0,1,2,16,18,15,8,1};
		int [] planetdistance = {58, 108, 150,228,778,1427,2869,4498,5900};
		Scanner sc = new Scanner(System.in);
		String planet;
		System.out.println("Name a planet");
		planet = sc.nextLine();
		if (Arrays.asList(planetnames).contains(planet.toLowerCase()) == true)
		{
			int indexPos = Arrays.asList(planetnames).indexOf(planet.toLowerCase());
			System.out.printf("%s has %s moons and has a distance of %s", planet, planetmoons[indexPos], planetdistance[indexPos]);
		}
	}
}