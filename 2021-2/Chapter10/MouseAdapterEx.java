package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseAdapterEx extends JFrame {
	private JLabel la = new JLabel("Hello");
	
	public MouseAdapterEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter()); //컨텐트팬에 Mouse 이벤트 리스너 달기
		
		c.setLayout(null); //컨텐트팬의 배치관리자 삭제
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(250, 250);
		setVisible(true);
	}
	
	//MouseAdapter를 상속받아 리스너 구현
	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); //마우스 클릭 좌표 x
			int y = e.getY(); //마우스 클릭 좌표 y
			la.setLocation(x, y); //레이블의 위치릴 (x, y)로 이동
		}
	}
	public static void main(String[] args) {
		new MouseAdapterEx();
	}

}
