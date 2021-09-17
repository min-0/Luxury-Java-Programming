package Chapter9;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame{
	public GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//4*2 격자의 GridLayout 배치관리자 생성
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5); //격자 사이의 수직 간격을 5 픽셀로 설정
		
		Container c = getContentPane();
		c.setLayout(grid); //grid를 컨텐트팬의 배치관리자로 지정
		c.add(new JFrame("이름"));
		c.add(new JTextField(""));
		c.add(new JFrame("학번"));
		c.add(new JTextField(""));
		c.add(new JFrame("학과"));
		c.add(new JTextField(""));
		c.add(new JFrame("과목"));
		c.add(new JTextField(""));
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
