package Chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch12_02 extends JFrame {
	private MyPanel panel = new MyPanel();
	private ImageIcon icon = new ImageIcon("images/sky.jpg"); //이미지 로딩
	private Image img = icon.getImage(); //이미지 객체
	
	public ch12_02() {
		setTitle("이미지 위에 원 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel); //생성한 panel 패널을 컨텐트 팬으로 사용
		setSize(600, 700);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ch12_02();
	}
	//이 패널에 Mouse 리스너를 등록한다.
	//JPanel을 상속받는 새 패널 작성
	class MyPanel extends JPanel {
		private Point p = new Point(0, 0);
		public MyPanel() {
			addMouseMotionListener(new MouseAdapter() { //Mouse 리스너 등록
				public void mouseDragged(MouseEvent e) {
					super.mouseDragged(e);
					p = e.getPoint(); //마우스 포인터를 알아낸다.
					repaint(); //패널의 다시 그리기를 요청한다.
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);		
			g.drawImage(img, 0, 0, this); //이미지를 패널의 (20, 20)에 원래의 크기로 그린다.
			g.setColor(Color.green); //초록색을 선택한다.
			g.fillOval((int)p.getX(), (int)p.getY(), 20, 20); //도형을 칠하기 위한 메소드
		}
	}
}
