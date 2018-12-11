package Decorator;

import java.awt.Graphics;

public class Decorator implements Component{
	Component cmp;
	int x;
	int y;
	int w;
	int h;
	public Decorator(Component c1, int c,int a,int b,int d) {
		x=c;
		y=a;
		w=b;
		h=d;
		cmp=c1;
	}
	@Override
	public void draw(Graphics g) {
		cmp.draw(g);
		
	}
	
}
