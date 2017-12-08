package Graphics2;

import javax.swing.*;
import java.awt.*;

public class ColorPanel5 extends JPanel{
	public ColorPanel5(Color backColor){
		setBackground(backColor);
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int x = getWidth() / 2 - 60;
		int y = getHeight() / 2;
		g.setColor(Color.black);
		g.drawLine(x-30, y, x+30,y);
		g.drawLine(x-30, y+30, x+30,y+30);

		g.drawLine(x-30,y,x-10, y-10);
		g.drawLine(x-30,y,x-10, y+10);
		g.drawLine(x+30,y,x+10, y-10);
		g.drawLine(x+30,y,x+10, y+10);

		g.drawLine(x-30,y+30, x-40,y+20);
		g.drawLine(x-30,y+30, x-40, y+40);

		g.drawLine(x+30,y+30, x+40,y+20);
		g.drawLine(x+30,y+30, x+40, y+40);


	}
}