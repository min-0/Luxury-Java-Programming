package Chapter13;

import javax.swing.*;
import java.awt.*;

public class ch13_04_2 extends JFrame {
	public ch13_04_2() {
		setTitle("진동하는 프레임 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel lb = new JLabel("진동 레이블");
		c.add(lb);
		
		Thread th = new Thread(new Vibe(lb));
		th.start();
		
		setSize(300, 300);
		setVisible(true);
	}
	class Vibe extends Thread {
		private JLabel lb;
		private int x = 50;
		public Vibe(JLabel lb) {
			this.lb = lb;
		}
		public void run() {
			while(true) {
				try {
					if(x == 100) x += 10;
					else x=100;
					lb.setLocation(x, x);
					sleep(100);
				}catch(Exception e) {
					return;
				}
			}
		}
	}
	public static void main(String[] args) {
		new ch13_04_2();
	}

}
