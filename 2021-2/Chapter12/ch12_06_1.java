package Chapter12;

import javax.swing.*;
import java.awt.*;

public class ch12_06_1 extends JFrame {
	private MyPanel panel = new MyPanel();
	public ch12_06_1() {
		setTitle("그래픽 다각형 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.black);
			
			for(int i = 0; i < 10; i++) {
				g.drawLine(0, (this.getHeight() / 10)*i, this.getWidth(), (this.getHeight() / 10)*i);
				for(int k = 0; k < 10; k++) {
					g.drawLine((this.getWidth() / 10)*k, 0, (this.getWidth() / 10)*k, this.getHeight());
				}
			}
		}
	}
	public static void main(String[] args) {
		new ch12_06_1();
	}
}

