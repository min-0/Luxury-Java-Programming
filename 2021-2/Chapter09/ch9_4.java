package Chapter9;

import javax.swing.*;
import java.awt.*;

public class ch9_4 extends JFrame {
	public ch9_4() {
		setTitle("Ten Color Button Frame"); //프레임 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 윈도우를 닫으면 프로그램을 종료하도록 설정
		
		GridLayout grid = new GridLayout(1, 10); //1*10 격자의 GridLayout 배치관리자 생성
		grid.setVgap(10); //격자 사이의 수직 간격을 10 픽셀로 설정
		
		Container c = getContentPane(); //컨텐트팬을 알아낸다.
		c.setLayout(grid); //grid를 컨텐트팬의 배치관리자로 지정
		
		//0 ~ 9 버튼 달기 & 컨텐트팬의 색깔 지정(RED ~ GRAY)
		c.add(new JButton("0")).setBackground(Color.RED);
		c.add(new JButton("1")).setBackground(Color.ORANGE);
		c.add(new JButton("2")).setBackground(Color.YELLOW);
		c.add(new JButton("3")).setBackground(Color.GREEN);
		c.add(new JButton("4")).setBackground(Color.CYAN);
		c.add(new JButton("5")).setBackground(Color.BLUE);
		c.add(new JButton("6")).setBackground(Color.MAGENTA);
		c.add(new JButton("7")).setBackground(Color.DARK_GRAY);
		c.add(new JButton("8")).setBackground(Color.PINK);
		c.add(new JButton("9")).setBackground(Color.GRAY);
		
		setSize(700, 300); //프레임 크기 700*300 설정
		setVisible(true); //화면에 프레임 출력
	}
	public static void main(String[] args) {
		ch9_4 frame = new ch9_4();
	}
}
