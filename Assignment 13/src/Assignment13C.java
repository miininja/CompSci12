import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Assignment13C 
{
	public static void main ( String[] args)
	{
		String object;
		object=JOptionPane.showInputDialog("What object do you want?");
		Draw panel = new Draw(object);
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400,120);
		application.setVisible(true);	
	}	
}
