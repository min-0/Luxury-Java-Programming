package Chapter12;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Vector;

class Circle {
	int x, y, w, h;
	public Circle(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
}
public class ch12_08 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public ch12_08() {
		setTitle("���콺�� �� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(800, 400);
		setVisible(true);
	}
	//JPanel�� ��ӹ޴� �� �г� �ۼ�
	class MyPanel extends JPanel {
		Vector<Circle> v = new Vector<>(); //Circle�� �ٷ�� ���� ����
		int startX, startY, destX, destY;
		public MyPanel() {
			setLayout(null);
			addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent e) {
					//ó�� ���콺�� ���� ���� ��ǥ ���
					startX = e.getX();
					startY = e.getY();
				}
				public void mouseReleased(MouseEvent e) {
					//�巡�װ� ���� ���� ��ǥ ���
					destX = e.getX();
					destY = e.getY();
					//��ǥ�� �簢�� ���̿� ���� ���ϱ�
					int width = Math.abs(startX - destX);
					int hight = Math.abs(startY - destY);
					int radius = (int) Math.sqrt((double)width*width + (double)hight*hight); //��Ÿ��󽺷� ������ ���ϱ�
					//Circle ��ü ����
					v.add(new Circle(startX-radius, startY-radius, radius*2, radius*2));
					repaint(); //�׸��� ��û
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			for(int i = 0; i < v.size(); i++) {
				Circle c = v.get(i); //���Ϳ��� ��������
				g.setColor(Color.PINK);
				g.drawOval(c.x, c.y, c.w, c.h); //�� �׸���
			}
		}
	}
	public static void main(String[] args) {
		new ch12_08();
	}
}