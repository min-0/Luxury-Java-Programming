package Chapter11;

import javax.swing.*;
import java.awt.*;

public class ButtonEx extends JFrame {
	public ButtonEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//3개의 이미지를 파일로부터 읽어들인다.
		ImageIcon normalIcon = new ImageIcon("images/call.jpg");
		ImageIcon rolloverIcon = new ImageIcon("images/green.jpg");
		ImageIcon pressedIcon = new ImageIcon("images/red.jpg");
		
		//3개의 이미지를 가진 버튼 생성
		JButton btn = new JButton("Call~~", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		c.add(btn);
		
		setSize(500, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonEx();
	}

}
