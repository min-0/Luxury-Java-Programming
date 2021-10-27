package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch10_05 extends JFrame{
	public ch10_05() {
		setTitle("+, -키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("Love Java");
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		c.add(la);
		
		la.setFocusable(true);
		la.requestFocus();
		
		la.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int size = la.getFont().getSize();
				if(e.getKeyChar() == '+') la.setFont(new Font("Arial", Font.PLAIN, size + 5));
				else if(e.getKeyCode() == KeyEvent.VK_MINUS && size > 5)la.setFont(new Font("Arial", Font.PLAIN, size - 5));
			}
		});
		
		setSize(500, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ch10_05();
	}

}
