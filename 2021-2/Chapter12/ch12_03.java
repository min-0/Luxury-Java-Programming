package Chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch12_03 extends JFrame {
	public ch12_03() {
		setTitle("이미지 레이블 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		ImageIcon icon = new ImageIcon("images/bubble.png"); // 이미지 로딩		
		JLabel img = new JLabel(icon); // 이미지 레이블 만들기
	
		// 이미지 레이블의 크기와 위치 지정
		img.setSize(icon.getIconHeight(),icon.getIconWidth());
		img.setLocation(100,100);
		
		// 마우스 리스너와 마우스모션 리스너 객체 달기
		MyMouseListener  ml = new MyMouseListener();
		img.addMouseListener(ml);
		img.addMouseMotionListener(ml);

		c.add(img); // 컨텐트팬에 이미지 레이블 부착
		setSize(400,450);
		setVisible(true);
	}
	class MyMouseListener extends MouseAdapter {
		private Point startP = null; // 드래깅 시작 점
		
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
			la.getParent().repaint(); // 움직인 la의 위치에 다시 그리기
		}	
	}
	public static void main(String[] args) {
		new ch12_03();
	}

}
