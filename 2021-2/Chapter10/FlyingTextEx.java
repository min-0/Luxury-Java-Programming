package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlyingTextEx extends JFrame{
	private final int FLYING_UNIT = 10; //���̺��� �� �� �����̴� ������ 10�ȼ�
	private JLabel la = new JLabel("HELLO"); //Ű �Է¿� ���� ������ ���̺� ������Ʈ
	public FlyingTextEx() {
		setTitle("��, ��, ��, �� Ű�� �̿��Ͽ� �ؽ�Ʈ �����̱�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null); //����Ʈ�� ��ġ������ ���� //"Hello"���̺��� ����Ʈ�һ��� ������ ��ġ�� ������� �����̱� ����
		c.addKeyListener(new MyKeyListener()); //����Ʈ�ҿ� key ������ �ޱ�
		la.setSize(100, 20);
		la.setLocation(50, 50); //la �ʱ� ��ġ
		c.add(la);
		setSize(300, 300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus(); //����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component com = (Component)e.getSource(); //���콺�� Ŭ���� ������Ʈ
				com.setFocusable(true);
				com.requestFocus(); //���콺�� Ŭ���� ������Ʈ���� ��Ŀ�� ����
			}
		});
	}
	class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); //�Էµ� Ű�� Ű �ڵ带 �˾Ƴ���
			
			//Ű �ڵ� ���� ���� ��, ��, ��, �� Ű�� �Ǻ��ϰ� la�� ��ġ�� �̵���Ų��.
			switch(keyCode) {
			case KeyEvent.VK_UP: la.setLocation(la.getX(), la.getY() - FLYING_UNIT); break;
			case KeyEvent.VK_DOWN: la.setLocation(la.getX(), la.getY() + FLYING_UNIT); break;
			case KeyEvent.VK_LEFT: la.setLocation(la.getX() - FLYING_UNIT, la.getY()); break;
			case KeyEvent.VK_RIGHT: la.setLocation(la.getX() + FLYING_UNIT, la.getY()); break;
			}
		}
	}
	public static void main(String[] args) {
		new FlyingTextEx();
	}

}
