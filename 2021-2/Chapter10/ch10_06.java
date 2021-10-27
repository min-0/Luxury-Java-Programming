package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch10_06 extends JFrame {
	public ch10_06() {
		setTitle("클릭 응용 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("c");
		la.setSize(100, 30);
		la.setLocation(100, 100);
		c.add(la);
		
		setSize(250, 300);
		setVisible(true);
		
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int x = (int)(Math.random()*200);
				int y = (int)(Math.random()*250);
				
				la.setLocation(x, y);
			}
		});
	}
	public static void main(String[] args) {
		new ch10_06();
	}

}
