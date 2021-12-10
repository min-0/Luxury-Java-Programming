package Chapter13;

import javax.swing.*;
import java.awt.*;

public class ch13_04_1 extends JFrame {
	public ch13_04_1() {
		setTitle("진동하는 프레임 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Thread th = new Thread(new Vibe(this));
		th.start();
		
		setSize(300, 300);
		setVisible(true);
	}
	class Vibe extends Thread {
		private Container c;
		private int x = 300;
		public Vibe(Container c) {
			this.c = c;
		}
		public void run() {
			while(true) {
				try {
					if(x == 300) x += 10;
					else x=300;
					c.setLocation(x, x);
					sleep(100);
				}catch(Exception e) {
					return;
				}
			}
		}
	}

	public static void main(String[] args) {
		new ch13_04_1();
	}

}
