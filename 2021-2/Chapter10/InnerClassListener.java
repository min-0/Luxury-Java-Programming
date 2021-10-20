package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InnerClassListener extends JFrame{
	public InnerClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		//Action 이벤트 리스너 달기
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
	}
	//내부 클래스 Action 리스너를 작성한ㄷㅏ
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton bt = (JButton)e.getSource();
			if(bt.getText().equals("Action")) bt.setText("액션");
			else bt.setText("Action");
			
			//InnerClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
			InnerClassListener.this.setTitle(bt.getText()); //프레임의 타이틀에 버튼 문자열을 출력한다.
		}
	}
	public static void main(String[] args) {
		new InnerClassListener();
	}

}