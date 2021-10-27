package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerEx extends JFrame {
	private JLabel la = new JLabel("Hello");
	
	public MouseListenerEx() {
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		
		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(250, 250);
		setVisible(true);
	}
	//Mouse ������ ����
	class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); //���콺 Ŭ�� ��ǥ x
			int y = e.getY(); //���콺 Ŭ�� ��ǥ y
			la.setLocation(x, y); //���̺��� ��ġ�� (x, y)�� �̵�
		}
		public void mouseClicked(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	public static void main(String[] args) {
		new MouseListenerEx();
	}

}
