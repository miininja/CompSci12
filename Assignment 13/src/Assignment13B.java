import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Assignment13B
{
	public static void main ( String[] args)
	{
		String num1, num2;
		int x1, x2, prod;
		num1=JOptionPane.showInputDialog("First number");
		x1 = Integer.parseInt(num1.trim());
		num2=JOptionPane.showInputDialog("Second number");
		x2 = Integer.parseInt(num2.trim());
		prod = x1 * x2;
		JOptionPane.showMessageDialog(null,num1 + " * " + num2 + " = " + prod);
	}	
}
