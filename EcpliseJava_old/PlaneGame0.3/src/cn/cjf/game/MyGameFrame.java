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
	
	public static void main(String[] args) {
		MyGameFrame f=new MyGameFrame();
		f.launchFrame();
		
	}
	
	//paint方法作用是：画出整个窗口及内部内容。被系统自动调用。
	@Override
	public void paint(Graphics g) { 
		
		g.drawImage(bg, 0, 0, null);
		g.drawImage(plane, 250, 250, null);
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
	}
	
	

	
}
