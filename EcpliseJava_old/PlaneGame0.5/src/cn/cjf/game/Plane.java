package cn.cjf.game;

import java.awt.Graphics;
import java.awt.Image;

public class Plane extends GameObject {

	@Override
	public void drawSelf(Graphics g) {

		super.drawSelf(g);
		this.x+=3;	//�ɻ�ˮƽ�ɣ�����Ҳ���Ե���x��y�㷨����������ָ����·������
	}

	public Plane(Image img, double x, double y) {
		super(img, x, y);
	}
	
	
	
}
