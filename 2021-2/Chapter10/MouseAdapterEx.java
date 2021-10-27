package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseAdapterEx extends JFrame {
	private JLabel la = new JLabel("Hello");
	
	public MouseAdapterEx() {
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter()); //����Ʈ�ҿ� Mouse �̺�Ʈ ������ �ޱ�
		
		c.setLayout(null); //����Ʈ���� ��ġ������ ����
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(250, 250);
		setVisible(true);
	}
	
	//MouseAdapter�� ��ӹ޾� ������ ����
	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); //���콺 Ŭ�� ��ǥ x
			int y = e.getY(); //���콺 Ŭ�� ��ǥ y
			la.setLocation(x, y); //���̺��� ��ġ�� (x, y)�� �̵�
		}
	}
	public static void main(String[] args) {
		new MouseAdapterEx();
	}

}
