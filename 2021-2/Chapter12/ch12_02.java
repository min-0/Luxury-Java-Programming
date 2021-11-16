package Chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch12_02 extends JFrame {
	private MyPanel panel = new MyPanel();
	private ImageIcon icon = new ImageIcon("images/sky.jpg"); //�̹��� �ε�
	private Image img = icon.getImage(); //�̹��� ��ü
	
	public ch12_02() {
		setTitle("�̹��� ���� �� �巡�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel); //������ panel �г��� ����Ʈ ������ ���
		setSize(600, 700);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ch12_02();
	}
	//�� �гο� Mouse �����ʸ� ����Ѵ�.
	//JPanel�� ��ӹ޴� �� �г� �ۼ�
	class MyPanel extends JPanel {
		private Point p = new Point(0, 0);
		public MyPanel() {
			addMouseMotionListener(new MouseAdapter() { //Mouse ������ ���
				public void mouseDragged(MouseEvent e) {
					super.mouseDragged(e);
					p = e.getPoint(); //���콺 �����͸� �˾Ƴ���.
					repaint(); //�г��� �ٽ� �׸��⸦ ��û�Ѵ�.
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);		
			g.drawImage(img, 0, 0, this); //�̹����� �г��� (20, 20)�� ������ ũ��� �׸���.
			g.setColor(Color.green); //�ʷϻ��� �����Ѵ�.
			g.fillOval((int)p.getX(), (int)p.getY(), 20, 20); //������ ĥ�ϱ� ���� �޼ҵ�
		}
	}
}
