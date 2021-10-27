package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerEx extends JFrame {
	private JLabel la = new JLabel("Hello");
	
	public MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
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
	//Mouse 리스너 구현
	class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); //마우스 클릭 좌표 x
			int y = e.getY(); //마우스 클릭 좌표 y
			la.setLocation(x, y); //레이블의 위치를 (x, y)로 이동
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
