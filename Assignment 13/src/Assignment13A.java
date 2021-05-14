import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Assignment13A
{
	public static void main ( String[] args)
	{
		String day, week, month;
		day=JOptionPane.showInputDialog("What is the day?");
		week=JOptionPane.showInputDialog("What is the day of the week?");
		month=JOptionPane.showInputDialog("What is the month?");
		JOptionPane.showMessageDialog(null,"Today is " + week + " " + day + " of " + month);
	}	
}
