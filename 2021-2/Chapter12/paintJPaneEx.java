package Chapter12;

import javax.swing.*;
import java.awt.*;

public class paintJPaneEx extends JFrame {
	private MyPanel panel = new MyPanel();
	public paintJPaneEx() {
		setTitle("JPanel�� paintComponent() ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel); //������ panel �г��� ����Ʈ������ ���
		setSize(250, 220);
		setVisible(true);
	}
	//JPanel�� ��ӹ޴� �� �г� ����
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g); //JPanel�� paintComponent() ȣ��
			g.setColor(Color.blue); //�Ķ��� ����
			g.drawRect(10, 10, 50, 50); //(10, 10) ��ġ�� 50x50 ũ���� �簢�� �׸���
			g.drawRect(50, 50, 50, 50); //(50, 50) ��ġ�� 50x50 ũ���� �簢�� �׸���
			g.setColor(Color.magenta); //����Ÿ�� ����
			g.drawRect(90, 90, 50, 50); //(90, 90) ��ġ�� 50x50 ũ���� �簢�� �׸���
		}
	}
	public static void main(String[] args) {
		new paintJPaneEx();
	}

}
