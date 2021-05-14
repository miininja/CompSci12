import java.awt.Graphics;
import java.util.Objects;

import javax.swing.JPanel;
import java.awt.Color;

public class Draw extends JPanel 
{
	private String choice;
	public Draw(String Choice)
	{
		choice = Choice;
	}
	public void paintComponent (Graphics g) 
	{
		super.paintComponent(g);
		if (Objects.equals(choice, "circle"))
		{
			g.setColor(Color.YELLOW);
			g.fillOval(10,10,50,50);
		}
		else if (Objects.equals(choice, "square"))
		{
			g.setColor(Color.BLACK);
			g.fillRect(70,10,50,50);
		}
		else if (Objects.equals(choice, "diamond"))
		{
			g.setColor(Color.RED);
			int [] x= {130,155,180,155};
			int [] y = {35,10,35,60};
			g.fillPolygon(x,y,4);
		}
		else if (Objects.equals(choice, "rectangle"))
		{
			g.setColor(Color.GREEN);
			g.fillRect(190,10,90,50);
		}
		else if (Objects.equals(choice, "triangle"))
		{
			g.setColor(Color.PINK);
			int [] x1= {300,330,360};
			int [] y1 = {60,10,60};
			g.fillPolygon(x1,y1,3);
		}
		else if (Objects.equals(choice, "all"))
		{
			g.setColor(Color.YELLOW);
			g.fillOval(10,10,50,50);
			g.setColor(Color.BLACK);
			g.fillRect(70,10,50,50);
			g.setColor(Color.RED);
			int [] x= {130,155,180,155};
			int [] y = {35,10,35,60};
			g.fillPolygon(x,y,4);
			g.setColor(Color.GREEN);
			g.fillRect(190,10,90,50);
			g.setColor(Color.PINK);
			int [] x1= {300,330,360};
			int [] y1 = {60,10,60};
			g.fillPolygon(x1,y1,3);
		}
	}
}
