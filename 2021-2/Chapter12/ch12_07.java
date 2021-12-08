package Chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class ch12_07 extends JFrame {
	private MyPanel panel = new MyPanel();
	private int cnt = 0;
	public ch12_07() {
		setTitle("마우스로 폐다각형 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private Vector<Integer> x = new Vector<Integer>();
		private Vector<Integer> y = new Vector<Integer>();
		public  MyPanel() {
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					x.add(e.getX());
					y.add(e.getY());
					cnt++;
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.magenta);
			
			int xs [] = new int [cnt];
			int ys [] = new int [cnt];

			for(int i=0; i < cnt; i++) {
				xs[i] = x.get(i);
				ys[i] = y.get(i);
			}
			g.drawPolygon(xs, ys, cnt);
		}
	}
	
	public static void main(String[] args) {
		new ch12_07();
	}
}
