package Decorator;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class ColorDecorator extends Decorator{

	public ColorDecorator(Component c,int a,int b,int c1,int d) {
		super(c, a,b,c1,d);
	}
	@Override
	public void draw(Graphics g) {
		cmp.draw(g);
		Graphics2D g2d = (Graphics2D) g;
		Color oldColor = g2d.getColor();
		g2d.setColor(Color.green);
		Composite oldC = g2d.getComposite();
		g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,  1 * 0.1f));
		g2d.fillRect(x, y, w, h);
		g2d.setComposite(oldC);
		g2d.setColor(oldColor);
		
	}
	
}
