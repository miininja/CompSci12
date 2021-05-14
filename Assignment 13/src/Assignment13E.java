import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Assignment13E
{
	public static void main ( String[] args)
	{
		DrawTri panel = new DrawTri("hi");
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(770,770);
		application.setVisible(true);
	}
}