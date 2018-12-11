package Decorator;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

public class FrameDecorator extends Decorator{
	int thickness;
	public FrameDecorator(Component c,int a,int b,int c1,int d, int t) {
		super(c, a,b,c1,d);
		thickness = t;
	}
	@Override
	public void draw(Graphics g) {
		cmp.draw(g);
		Graphics2D g2d = (Graphics2D)g;
		Stroke oldStroke = g2d.getStroke();
		Color oldcolor = g2d.getColor();
		g2d.setStroke(new BasicStroke(thickness));
		g2d.setColor(Color.red);
		g2d.drawRect(x, y, w, h);
		g2d.setColor(oldcolor);
		g2d.setStroke(oldStroke);
		
	}
	
}
