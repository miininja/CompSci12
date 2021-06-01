import java.io.File;

import java.io.IOException;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
public class Bank
{
	private boolean loggedin = false;
	private int loginnumrecieved;
	public Bank(int accountnum)
	{
		loginnumrecieved = accountnum;
		loggedin = getAccNumFromData(checkInfo(accountnum)).equals(loginnumrecieved);
	}
	private String formatData(Object... values)
	{
		String format = "";
		for(Object c : values)
		{
			format += c + ",";
		}
		format = format.substring(0, format.length()-1);
		return format;
	}
	private String getAccNumFromData(String data)
	{
		String num = data.substring(0,data.indexOf(","));
		//System.out.println("GOT NUM: " + num);
		return String.valueOf(num);
	}
	private String getAccBalance(String accountnumber)
	{
		String data = checkInfo(Integer.parseInt(accountnumber));
		String num = data.substring(data.indexOf(',')+1,data.indexOf(',', data.indexOf(',')+1));
		//System.out.println("GOT BALANCE: " + num);
		return String.valueOf(num);
	}
	private String checkInfo(int accountnum)
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
						String cardNum = getAccNumFromData(data);
						if (cardNum.equals(String.valueOf(accountnum)))
						{
							return data;
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
		return "NULL";
	}
	public boolean checkStatus()
	{
		return loggedin;//checkInfo(loginnumrecieved);
	}
	public int getAccNum()
	{
		return loginnumrecieved;
	}
	public String getBalance()
	{
		return getAccBalance(String.valueOf(loginnumrecieved));
	}
}