package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch10_03 extends JFrame {
	private StringBuffer sb = new StringBuffer("Love Java");
	public ch10_03() {
		setTitle("Left Ű�� ���ڿ� ��ü");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("Love Java");
		c.add(la);
		
		c.setFocusable(true);
		c.requestFocus();
		
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					sb.reverse();
					la.setText(sb.toString()); //�Լ� ȣ�� �� ���ڿ��� �ٲ㼭 ���
					if(la.equals("Love Java")) la.setText("avaJ evoL");
					else if(la.equals("avaJ evoL")) la.setText("Java Love");
				}
			}
		});
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ch10_03();
	}

}
