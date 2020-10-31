package cn.cjf.game;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;


public class MyGameFrame extends JFrame {
	
	Image ball=GameUtil.getImage("images/ball.png");
	
	public static void main(String[] args) {
		MyGameFrame f=new MyGameFrame();
		f.launchFrame();
		
	

	}
	
	//paint方法作用是：画出整个窗口及内部内容。被系统自动调用。
	@Override
	public void paint(Graphics g) { 
		Color c=g.getColor();
		Font f=g.getFont();
		g.setColor(Color.blue);
		//g.setColor(Color.green);
		
	    //从坐标点(100,50)到(400,400)画出直线
	   g.drawLine(100, 100, 300, 300); 
	    //画出矩形。矩形左上角顶点坐标(100,50)，宽度300，高度300
	    g.drawRect(100, 100, 300, 300);  
	    //画出椭圆。椭圆外切矩形为：左上角顶点(100,50),宽度300，高度300
	    g.drawOval(100, 100, 300, 300); 
	    g.fillRect(100, 100, 40, 40);
	    g.setColor(Color.red);
	    g.setFont(new Font("宋体",Font.BOLD,50));
	    g.drawString("How are you?", 200, 200);
	    
	    g.drawImage(ball, 100, 100, null);
	    
	    g.setColor(c);
	    g.setFont(f);
	    
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
