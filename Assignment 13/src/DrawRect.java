import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class DrawRect extends JPanel implements MouseListener
{
	int x = 0;
	int y = 0;
	int drawnx, drawny;
	boolean createdTriangle = false;
	private String choice;
	public DrawRect(String Choice)
	{
		choice = Choice;
		addMouseListener(this);
	}
	public void paintComponent (Graphics g) 
	{
		super.paintComponent(g);
		g.setColor(Color.GREEN);
		g.fillRect(190,100,200,300);
	}
	@Override
	public void mouseClicked (MouseEvent e)
	{
		Graphics g = getGraphics();
		x=e.getX(); // get the x and y location of the mouse
		y=e.getY();
		if (createdTriangle == false)
		{
			int r,gn,b;
			r=(int) ((Math.random()*255)+1); // generate random amounts of red, green and blue
			gn=(int) ((Math.random()*255)+1);
			b=(int) ((Math.random()*255)+1);
			g.setColor(new Color(r,gn,b));
			g.fillRect(x-25,y-25,50,50); //draw a rectangle at the mouse location
			createdTriangle = true;
			drawnx = x-25;
			drawny = y-25;
		}
		else
		{
			if (x - drawnx >= 0 && x - drawnx < 50 && y - drawny >= 0 && y - drawny < 50)
			{
				System.out.println("HIT");
			}
			else
			{
				System.out.println("MISS");
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {}
	@Override
	public void mouseExited(MouseEvent arg0) {}
	@Override
	public void mousePressed(MouseEvent arg0) {}
	@Override
	public void mouseReleased(MouseEvent arg0) {}
}
