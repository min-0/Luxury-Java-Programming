package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch14_06 extends JFrame {
	private JButton btn = new JButton("calculate");
	private JLabel lb = new JLabel("계산 결과 출력");
	private JTextField input1 = new JTextField(10);
	private JTextField input2 = new JTextField(10);
	
	public ch14_06() {
		setTitle("다이얼로그 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,250);
		setVisible(true);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		lb.setBackground(Color.green); //lb 배경색 green으로 설정
		lb.setOpaque(true); //배경색이 보이도록 설정
		
		c.add(btn);
		c.add(lb);
		
		btn.addActionListener(new ActionListener() { //btn에 Action 리스너 등록
			public void actionPerformed(ActionEvent e) {
				calDialog cal = new calDialog(); //btn을 누르면 calDialog가 실행
				cal.setVisible(true);
			}
		});
	}
	class calDialog extends JDialog{
		JButton Abtn = new JButton("ADD");
		public calDialog(){
			setTitle("Calculation Dialog");
			setLayout(new FlowLayout());
			setSize(200,200);
			
			add(new JLabel("두 수를 더합니다"));
			add(input1);
			add(new JLabel(""));
			add(input2);
			add(new JLabel(""));
			add(Abtn);
			
			Abtn.addActionListener(new ActionListener() { //ADD에 Action 리스너 등록
				public void actionPerformed(ActionEvent e) {
					int res = Integer.parseInt(input1.getText()) + Integer.parseInt(input2.getText()); //input1과 input2를 더함
					lb.setText(Integer.toString(res)); //결과 출력
				}
			});
		}
	}
	public static void main(String[] args) {
		new ch14_06();
	}
}
