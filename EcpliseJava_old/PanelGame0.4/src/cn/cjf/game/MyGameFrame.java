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
	
	//将飞机的坐标设置为变量，初始值为（200,200）
    int planeX=250;
	int planeY=250;
	
	
	
	private Image offScreenImage = null;
	 
	public void update(Graphics g) {
	    if(offScreenImage == null)
	        offScreenImage = this.createImage(500,500);//这是游戏窗口的宽度和高度
	     
	    Graphics gOff = offScreenImage.getGraphics();
	    paint(gOff);
	    g.drawImage(offScreenImage, 0, 0, null);
	} 
	
	
	//paint方法作用是：画出整个窗口及内部内容。被系统自动调用。
	@Override
	public void paint(Graphics g) { 
		
		g.drawImage(bg, 0, 0, null);
		System.out.println("调用paint,重画窗口,次数:"+(count++));
		g.drawImage(plane, planeX, planeY, null);
		
		planeX+=3;
	}
	//定义一个重画窗口的线程类，是一个内部类
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
	
	
	//初始化窗口....
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
		
		new PaintThread().start();//启动重画线程
	}
	

	public static void main(String[] args) {
		MyGameFrame f=new MyGameFrame();
		f.launchFrame();
		
	}
	
}
