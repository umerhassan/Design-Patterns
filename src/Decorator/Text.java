package Decorator;

import java.awt.Graphics;

public class Text implements Component{
	String text;
	int x;
	int y;
	public Text(String s,int a,int b) {
		text=s;
		x=a;
		y=b;
	}
	@Override
	public void draw(Graphics g) {
		g.drawString(text, x, y);
		
	}
	
}
