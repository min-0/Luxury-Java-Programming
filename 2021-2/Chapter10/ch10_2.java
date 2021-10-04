package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //�̺�Ʈ ó���� ����

public class ch10_2 extends JFrame {
	Container c = getContentPane(); //����Ʈ���� �˾Ƴ���.
	public ch10_2() {
		setTitle("�巡�뵿�� YELLOW"); //������ Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ �����츦 ������ ���α׷��� �����ϵ��� ����
		
		c.setLayout(new FlowLayout()); //����Ʈ�ҿ� FlowLayout ��ġ������ ����
		c.setBackground(Color.GREEN); //����Ʈ���� ���� green���� ����
		
		MyMouseListener listener = new MyMouseListener(); //������ ��ü ����
		c.addMouseMotionListener(listener); //MouseMotionListener ������ ���
		
		setSize(270, 170); //������ ũ�� 270*170 ����
		setVisible(true); //ȭ�鿡 ������ ���
	}
	//MouseMotion �����ʸ� ���� ������ �ۼ�
	class MyMouseListener implements MouseMotionListener{
		//���콺�� �巡�� �Ǵ� ���� ��� ȣ��
		public void mouseDragged(MouseEvent e) {
			c.setBackground(Color.YELLOW); //�巡�� ���� �� ����Ʈ���� ����� Yellow�� ����
		}
		//���콺�� �����̴� ���� ��� ȣ��
		public void mouseMoved(MouseEvent e) {
			c.setBackground(Color.GREEN); //������ �� ����Ʈ���� ����� Green���� ����
		}
	}

	public static void main(String[] args) {
		new ch10_2();
	}

}
