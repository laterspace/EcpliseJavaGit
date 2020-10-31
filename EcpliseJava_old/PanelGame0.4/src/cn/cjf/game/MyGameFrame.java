package cn.cjf.game;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;


public class MyGameFrame extends JFrame {
	
	Image plane=GameUtil.getImage("images/plane2.png");
	Image bg=GameUtil.getImage("images/bg3.jpg");
	
	static int count=0;
	
	//���ɻ�����������Ϊ��������ʼֵΪ��200,200��
    int planeX=250;
	int planeY=250;
	
	
	
	private Image offScreenImage = null;
	 
	public void update(Graphics g) {
	    if(offScreenImage == null)
	        offScreenImage = this.createImage(500,500);//������Ϸ���ڵĿ�Ⱥ͸߶�
	     
	    Graphics gOff = offScreenImage.getGraphics();
	    paint(gOff);
	    g.drawImage(offScreenImage, 0, 0, null);
	} 
	
	
	//paint���������ǣ������������ڼ��ڲ����ݡ���ϵͳ�Զ����á�
	@Override
	public void paint(Graphics g) { 
		
		g.drawImage(bg, 0, 0, null);
		System.out.println("����paint,�ػ�����,����:"+(count++));
		g.drawImage(plane, planeX, planeY, null);
		
		planeX+=3;
	}
	//����һ���ػ����ڵ��߳��࣬��һ���ڲ���
	class PaintThread extends Thread{
		public void run() {
			while(true) {
				repaint();
				
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
	
	//��ʼ������....
	public void launchFrame() {
		setTitle("Game by cjf");
		setVisible(true);
		setSize(500, 500);
		setLocation(300,300);
		
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}	
		});
		
		new PaintThread().start();//�����ػ��߳�
	}
	

	public static void main(String[] args) {
		MyGameFrame f=new MyGameFrame();
		f.launchFrame();
		
	}
	
}
