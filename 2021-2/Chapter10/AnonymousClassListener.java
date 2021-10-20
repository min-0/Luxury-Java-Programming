package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnonymousClassListener extends JFrame {
	public AnonymousClassListener() {
		setTitle("Action 이벤트 리스너 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton bt = (JButton)e.getSource();
				if(bt.getText().equals("Action")) bt.setText("액션");
				else bt.setText("Action");
				
				//AnonymousClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
				setTitle(bt.getText());
			}
		});
		
		setSize(350, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AnonymousClassListener();
	}

}