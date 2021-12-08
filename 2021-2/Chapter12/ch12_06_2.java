package Chapter12;

import javax.swing.*;
import java.awt.*;

public class ch12_06_2 extends JFrame {
	private MyPanel panel = new MyPanel();
	public ch12_06_2() {
		setTitle("그래픽 다각형 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int w = getWidth();
			int h = getHeight();
			
			int [] x = {w/2, w, w/2, 0};
			int [] y = {0, h/2, h, h/2};
			
			for(int i = 0; i < 10; i++) {
				g.drawPolygon(x, y, 4);
				y[0] += 10; x[1] -= 10; y[2] -= 10; x[3] += 10;
			}
		}
	}
	public static void main(String[] args) {
		new ch12_06_1();
	}
}
