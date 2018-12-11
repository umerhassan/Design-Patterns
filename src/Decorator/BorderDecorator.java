package Decorator;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

public class BorderDecorator extends Decorator{

	public BorderDecorator(Component c,int a,int b,int c1,int d) {
		super(c, a,b,c1,d);
	}
	@Override
	public void draw(Graphics g) {
		cmp.draw(g);
		g.drawRect(x, y, w, h);
		Stroke line = new BasicStroke(5, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0 ,new float[]{10}, 0);
		Graphics2D add = (Graphics2D) g;
		add.setStroke(line);
		
	}
	
}
