package cn.cjf.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

public class Plane extends GameObject {
	
	boolean left, up, right,down;
	boolean live=true;
	
	
	//���̿��Ʒɻ�����
	public void addDirection(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
		left=true;
		break;
		case KeyEvent.VK_RIGHT:
			right=true;
			break;
		case KeyEvent.VK_UP:
			up=true;
			break;
		case KeyEvent.VK_DOWN:
			down=true;
			break;
		
		}
	}
	
	
	@Override
	public void drawSelf(Graphics g) {

		super.drawSelf(g);
		this.x+=3;	//�ɻ�ˮƽ�ɣ�����Ҳ���Ե���x��y�㷨����������ָ����·������
	}

	public Plane(Image img, double x, double y) {
		super(img, x, y);
	}
	
	
	
	
	
	
}
