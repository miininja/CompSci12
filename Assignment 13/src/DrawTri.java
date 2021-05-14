import java.awt.Graphics;
import java.util.Objects;
import java.util.Random;
import javax.swing.JPanel;
import java.awt.Color;

public class DrawTri extends JPanel 
{
	private String choice;
	public DrawTri(String Choice)
	{
		choice = Choice;
	}
	public void paintComponent (Graphics g) 
	{
		super.paintComponent(g);
		int x = 0, y = 0;
		int length = 700, width = 700; // set the dimensions
		int x1 = width/2+10, y1 = 10; // top
		int x2 = 10, y2 = length+10; // left
		int x3 = width+10, y3 = length+10; // right
		Random rand = new Random();
		//generate starting point x & y
		int startx = rand.nextInt((600-100) + 1) + 100;
		int starty = rand.nextInt((600-100) + 1) + 100;
		//draw triangle lines
		g.drawLine(x1, y1, x2, y2); // top to left
		g.drawLine(x2, y2, x3, y3);// left to right
		g.drawLine(x3, y3, x1, y1); // right to top
		g.fillOval(startx, starty, 4, 4); // make starting point
		x = startx;
		y = starty;
		for (int i = 0; i < 1000000; i++)
		{
			int randdir = rand.nextInt((3-1) + 1) + 1;
			if (randdir == 1)
			{
				x = (x + x1) / 2;
				y = (y + y1) / 2;
			}
			else if (randdir == 2)
			{
				x = (x + x2) / 2;
				y = (y + y2) / 2;
			}
			else if (randdir == 3)
			{
				x = (x + x3) / 2;
				y = (y + y3) / 2;
			}
			g.fillOval(x, y, 2, 2);
		}
	}
}
