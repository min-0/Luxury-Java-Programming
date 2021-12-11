package Chapter14;

import javax.swing.*;
import java.awt.*;

public class ToolTipDelayEx extends JFrame {
	public ToolTipDelayEx() {
		setTitle("툴바 지연 시간 제어 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel red = new JLabel(new ImageIcon("images/red.jpg"));
		red.setToolTipText("빨간 이미지 어때요");
		
		JLabel green = new JLabel(new ImageIcon("images/green.jpg"));
		green.setToolTipText("초록 이미지 어때요");
		
		c.add(red);
		c.add(green);
		
		//ToolTipManager 객체를 얻기
		ToolTipManager m = ToolTipManager.sharedInstance();
		m.setInitialDelay(0); //초기 툴팁 출려 지연 시간을 0초로 설정
		m.setDismissDelay(10000); //툴팁 지속 시간을 10초로 설정
		
		setSize(500, 250);
		setVisible(true);

	}
	public static void main(String[] args) {
		new ToolTipDelayEx();
	}
}
