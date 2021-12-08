package Chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch12_04 extends JFrame {
	private MyPanel panel = new MyPanel();
	private ImageIcon icon = new ImageIcon("images/bubble.png");
	private Image img = icon.getImage();
	private Point p = new Point(0,0);
	private int width = img.getWidth(this);
	private int height = img.getHeight(this);
	
	public ch12_04() {
		setTitle("이미지 레이블 드래깅 연습2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(400,450);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, p.x, p.y, width, height, this);
			
			addMouseMotionListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					p = e.getPoint();
				}
				public void mouseDragged(MouseEvent e) {
					p.x = e.getX();
					p.y = e.getY();
					repaint();
				}	
			});
		}
	}
	public static void main(String[] args) {
		new ch12_04();
	}
}
