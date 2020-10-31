package com.nosucherror;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.*;

class Win extends JFrame implements ActionListener,Runnable
{
JTextField text=new JTextField(20);
JPanel panel=new JPanel();
Thread thread=new Thread(this);
URL url;
JEditorPane editpane=new JEditorPane();
public Win()
{JButton button=new JButton("»∑∂®bai");
button.addActionListener(this);
panel.add(new JLabel("«Î ‰»ÎÕ¯÷∑:"));
panel.add(text);
panel.add(button);
Container con=getContentPane();
con.add(new JScrollPane(editpane),BorderLayout.CENTER);
con.add(panel,BorderLayout.NORTH);
editpane.setEditable(false);
setBounds(60,60,100,100);
setVisible(true);
validate();
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub

}
public void run() {
// TODO Auto-generated method stub

}
}
public class Test1
{public static void main(String[] args)
{Win win=new Win();}
}