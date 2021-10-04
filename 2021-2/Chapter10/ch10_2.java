package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //이벤트 처리를 위함

public class ch10_2 extends JFrame {
	Container c = getContentPane(); //컨텐트팬을 알아낸다.
	public ch10_2() {
		setTitle("드래깅동안 YELLOW"); //프레임 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 윈도우를 닫으면 프로그램을 종료하도록 설정
		
		c.setLayout(new FlowLayout()); //컨텐트팬에 FlowLayout 배치관리자 설정
		c.setBackground(Color.GREEN); //컨텐트팬의 색을 green으로 지정
		
		MyMouseListener listener = new MyMouseListener(); //리스너 객체 생성
		c.addMouseMotionListener(listener); //MouseMotionListener 리스너 등록
		
		setSize(270, 170); //프레임 크기 270*170 설정
		setVisible(true); //화면에 프레임 출력
	}
	//MouseMotion 리스너를 가진 리스너 작성
	class MyMouseListener implements MouseMotionListener{
		//마우스가 드래깅 되는 동안 계속 호출
		public void mouseDragged(MouseEvent e) {
			c.setBackground(Color.YELLOW); //드래깅 중일 때 컨텐트팬의 배경을 Yellow로 지정
		}
		//마우스가 움직이는 동안 계속 호출
		public void mouseMoved(MouseEvent e) {
			c.setBackground(Color.GREEN); //움직일 때 컨텐트팬의 배경을 Green으로 지정
		}
	}

	public static void main(String[] args) {
		new ch10_2();
	}

}
