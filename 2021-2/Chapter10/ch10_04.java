package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch10_04 extends JFrame {
	private String str = "Lova Java";
	public ch10_04() {
		//setTitle("Left 키로 문자열 교체");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel la = new JLabel(str);
		c.add(la);
		
		c.setFocusable(true);
		c.requestFocus();
		
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_LEFT) {
					String newstr = str.substring(1) + str.substring(0, 1);
					la.setText(str);
					str = newstr;
				}
			}
		});
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ch10_04();
	}

}
