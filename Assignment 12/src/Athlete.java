import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Athlete
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
	Field[] fields = Athlete.class.getDeclaredFields();
	private String name;                  //variables are declared as private, meaning they 
	private String position;                  // can only be accessed in this class
	private int goals;                           // if they are public then you can access them in the main function
	private int assists;
	//The constructor of a class is automatically executed when the class is first created. The constructor does not have a return type and always has the same name as the class. Variables should be initialized in the constructor.
	public Athlete(String n, String p, int g, int a)
	{
		name=n;                                //This constructor initializes the variables. Once 
		position=p;                           // they have been initialized, they can be used
		goals=g;                               // by any method in this class
		assists=a;
	}
	public void changeVars()
	{
		Scanner input = new Scanner (System.in);
		System.out.println(fields.length-1 + " Variables found");
		String possibleVars = "";
		for (int i = 1; i < fields.length; i++)
		{
			possibleVars = possibleVars + " " + fields[i].getName() + "<"+fields[i].getType().getName()+">";
		}
		boolean gotAnswer = false;
		String answer = "";
		do {
			System.out.println("Choose a variable:" + possibleVars);
			answer = input.nextLine();
			for (int i = 1; i < fields.length; i++)
			{
				if (Objects.equals(answer, fields[i].getName()))
				{
					gotAnswer = true;
					String type = fields[i].getType().getName();
					switch  (type)
					{
						case "int":
							System.out.println("integer");
							//String number = JOptionPane.showInputDialog("Type a number");
							//int parsednum = Integer.parseInt(number.trim());
							System.out.println("Choose a number");
							int numToChange = input.nextInt();
						try {
							setIntField(fields[i].getName(), numToChange);
						} catch (NoSuchFieldException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IllegalAccessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
							break;
						case "String":
							//System.out.println("string");
							System.out.println("Type a string");
							String strToChange = input.nextLine();
							try {
								setStrField(fields[i].getName(), strToChange);
							} catch (NoSuchFieldException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (IllegalAccessException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							break;
						case "java.lang.String":
							//System.out.println("string");
							System.out.println("Type a string");
							String strToChange1 = input.nextLine();
							try {
								setStrField(fields[i].getName(), strToChange1);
							} catch (NoSuchFieldException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (IllegalAccessException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							break;
						default:
							System.out.println(type);
							break;
					}
				}
			}
		} while (gotAnswer == false);
		
		gotAnswer = false;
		//do {
			//int index = Arrays.asList(fields).indexOf(answer);
			//System.out.println(index);
		//} while (gotAnswer == false);
		
	}
	public void setIntField(String fieldName, int value)
	        throws NoSuchFieldException, IllegalAccessException {
	    Field field = getClass().getDeclaredField(fieldName);
	    field.setInt(this, value);
	}
	public void setStrField(String fieldName, String value)
	        throws NoSuchFieldException, IllegalAccessException {
	    Field field = getClass().getDeclaredField(fieldName);
	    field.set(this, value);
	}
	public void displayAthlete()
	{
		System.out.printf("%s plays %s and has scored %s goals and %s assists ", name, position, goals, assists);
	}
}
