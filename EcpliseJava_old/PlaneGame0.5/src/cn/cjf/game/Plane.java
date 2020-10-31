package cn.cjf.game;

import java.awt.Graphics;
import java.awt.Image;

public class Plane extends GameObject {

	@Override
	public void drawSelf(Graphics g) {

		super.drawSelf(g);
		this.x+=3;	//飞机水平飞，我们也可以调整x、y算法，按照我们指定的路径飞行
	}

	public Plane(Image img, double x, double y) {
		super(img, x, y);
	}
	
	
	
}
