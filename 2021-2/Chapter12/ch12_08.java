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
		setTitle("마우스로 원 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(800, 400);
		setVisible(true);
	}
	//JPanel을 상속받는 새 패널 작성
	class MyPanel extends JPanel {
		Vector<Circle> v = new Vector<>(); //Circle을 다루는 벡터 생성
		int startX, startY, destX, destY;
		public MyPanel() {
			setLayout(null);
			addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent e) {
					//처음 마우스를 누른 지점 좌표 얻기
					startX = e.getX();
					startY = e.getY();
				}
				public void mouseReleased(MouseEvent e) {
					//드래그가 끝난 지점 좌표 얻기
					destX = e.getX();
					destY = e.getY();
					//좌표로 사각형 넓이와 높이 구하기
					int width = Math.abs(startX - destX);
					int hight = Math.abs(startY - destY);
					int radius = (int) Math.sqrt((double)width*width + (double)hight*hight); //피타고라스로 반지름 구하기
					//Circle 객체 삽입
					v.add(new Circle(startX-radius, startY-radius, radius*2, radius*2));
					repaint(); //그리기 요청
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			for(int i = 0; i < v.size(); i++) {
				Circle c = v.get(i); //벡터에서 가져오기
				g.setColor(Color.PINK);
				g.drawOval(c.x, c.y, c.w, c.h); //원 그리기
			}
		}
	}
	public static void main(String[] args) {
		new ch12_08();
	}
}