import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
public class Bank
{
	private static int loginnumrecieved;
	private boolean loggedin = false;
	public Bank(int accountnum)
	{
		loginnumrecieved = accountnum;
		boolean loggedin = checkInfo();
	}
	private boolean checkInfo()
	{
		try {
			File info = new File("U:\\ComputerScience12\\Assignment 12\\info.txt");
			if (info.createNewFile())
			{
				System.out.println("File created: " + info.getName());
			}
			else
			{
				try {
					Scanner myReader = new Scanner(info);
					while (myReader.hasNextLine()) {
						String data = myReader.nextLine();
						if (data.equals(String.valueOf(loginnumrecieved)))
						{
							return true;
						}
					}
					myReader.close();
				} catch (FileNotFoundException e) {
					System.out.println("An error occurred.");
					e.printStackTrace();
				}
			}
		} catch (IOException e) 
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return false;
	}
	private static boolean compare(int a, int b)
	{
		if (a == b)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean checkStatus()
	{
		return loggedin;
	}
}