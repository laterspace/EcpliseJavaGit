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
	
	//paint���������ǣ������������ڼ��ڲ����ݡ���ϵͳ�Զ����á�
	@Override
	public void paint(Graphics g) { 
		Color c=g.getColor();
		Font f=g.getFont();
		g.setColor(Color.blue);
		//g.setColor(Color.green);
		
	    //�������(100,50)��(400,400)����ֱ��
	   g.drawLine(100, 100, 300, 300); 
	    //�������Ρ��������ϽǶ�������(100,50)�����300���߶�300
	    g.drawRect(100, 100, 300, 300);  
	    //������Բ����Բ���о���Ϊ�����ϽǶ���(100,50),���300���߶�300
	    g.drawOval(100, 100, 300, 300); 
	    g.fillRect(100, 100, 40, 40);
	    g.setColor(Color.red);
	    g.setFont(new Font("����",Font.BOLD,50));
	    g.drawString("How are you?", 200, 200);
	    
	    g.drawImage(ball, 100, 100, null);
	    
	    g.setColor(c);
	    g.setFont(f);
	    
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
	}
	
	

	
}
