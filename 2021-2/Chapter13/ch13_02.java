package Chapter13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyPanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int x = (int)(Math.random()*200);
		int y = (int)(Math.random()*200);
		
		g.setColor(Color.MAGENTA);
		g.drawOval(x, y, 50, 50);
	}
}

class MyThread extends Thread {
	private MyPanel mp;
	public MyThread(MyPanel pa) {
		mp = pa;
	}
	//스레드 코드. run()이 종료하면 스레드 종료
	@Override
	public void run() {
		while(true) {
			try {
				sleep(400); //400ms 동안 잠을 잔다.
				mp.repaint();
			} catch (InterruptedException e) {
				return; //예외가 발생하면 스레드 종료
			}
		}
	}
}

public class ch13_02 extends JFrame {
	MyPanel mp=new MyPanel();
	MyThread th=new MyThread(mp); //스레드 객체를 만든다.
	public ch13_02() {
		setTitle("원을 0.5초 간격으로 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(mp);
		mp.setLayout(null); //위치가 변경되어야 하므로 배치관리자 삭제
		mp.setOpaque(true); //색 변경이 가능하도록 설정
		
		mp.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) { //마우스가 눌러지는 순간
				th.start(); //스레드의 실행을 시작하게 된다.
			}
		});
		
		setVisible(true);
		setSize(300,300);
	}
	
	public static void main(String [] args) {
		new ch13_02();
	}
}
 

