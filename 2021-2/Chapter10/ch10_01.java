package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch10_01 extends JFrame{
	private JLabel la = new JLabel("No Mouse Event");
	public ch10_01() {
		setTitle("마우스 올리기 내리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		
		c.addMouseListener(new MyMouseListener());
		setSize(300, 200);
		setVisible(true);
	}
	class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource();
			la.setText("Love Java");
		}
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			la.setText("사랑해");
		}
	}
	public static void main(String[] args) {
		new ch10_01();
	}

}
