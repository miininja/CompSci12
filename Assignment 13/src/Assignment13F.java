import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Assignment13F
{
	public static void main ( String[] args)
	{
		DrawRect panel = new DrawRect("hi");
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(700,700);
		application.setVisible(true);
	}
}