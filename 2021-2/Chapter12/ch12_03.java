package Chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch12_03 extends JFrame {
	public ch12_03() {
		setTitle("�̹��� ���̺� �巡�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		ImageIcon icon = new ImageIcon("images/bubble.png"); // �̹��� �ε�		
		JLabel img = new JLabel(icon); // �̹��� ���̺� �����
	
		// �̹��� ���̺��� ũ��� ��ġ ����
		img.setSize(icon.getIconHeight(),icon.getIconWidth());
		img.setLocation(100,100);
		
		// ���콺 �����ʿ� ���콺��� ������ ��ü �ޱ�
		MyMouseListener  ml = new MyMouseListener();
		img.addMouseListener(ml);
		img.addMouseMotionListener(ml);

		c.add(img); // ����Ʈ�ҿ� �̹��� ���̺� ����
		setSize(400,450);
		setVisible(true);
	}
	class MyMouseListener extends MouseAdapter {
		private Point startP = null; // �巡�� ���� ��
		
		@Override
		public void mousePressed(MouseEvent e) {
			startP = e.getPoint();
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			Point endP = e.getPoint();
			Component la = (JComponent)(e.getSource());
			Point p = la.getLocation();
			la.setLocation(p.x + endP.x - startP.x, p.y + endP.y - startP.y);
			la.getParent().repaint(); // ������ la�� ��ġ�� �ٽ� �׸���
		}	
	}
	public static void main(String[] args) {
		new ch12_03();
	}

}
