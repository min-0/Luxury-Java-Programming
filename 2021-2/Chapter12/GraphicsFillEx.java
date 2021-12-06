package Chapter12;

import javax.swing.*;
import java.awt.*;

public class GraphicsFillEx extends JFrame {
	private MyPanel panel = new MyPanel();
	public GraphicsFillEx() {
		setTitle("fillXXX 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(100, 350);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.red);
			g.fillRect(10, 10, 50, 50); //빨간색 사각형 칠하기
			g.setColor(Color.blue);
			g.fillOval(10, 70, 50, 50); //파란색 타원 칠하기
			g.setColor(Color.green);
			g.fillRoundRect(10, 130, 50, 50, 20, 20); //초록색 둥근사각형 칠하기
			g.setColor(Color.magenta);
			g.fillArc(10, 190, 50, 50, 0, 270); //마젠타색 원호 칠하기
			g.setColor(Color.orange);
			
			int [] x = {30, 10, 30 ,60};
			int [] y = {250, 275, 300, 275};
			g.fillPolygon(x, y, 4); //오렌지색 다각형 칠하기
		}
	}
	public static void main(String[] args) {
		new GraphicsFillEx();

	}

}
