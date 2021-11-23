package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch14_06 extends JFrame {
	private JButton btn = new JButton("calculate");
	private JLabel lb = new JLabel("��� ��� ���");
	private JTextField input1 = new JTextField(10);
	private JTextField input2 = new JTextField(10);
	
	public ch14_06() {
		setTitle("���̾�α� �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,250);
		setVisible(true);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		lb.setBackground(Color.green); //lb ���� green���� ����
		lb.setOpaque(true); //������ ���̵��� ����
		
		c.add(btn);
		c.add(lb);
		
		btn.addActionListener(new ActionListener() { //btn�� Action ������ ���
			public void actionPerformed(ActionEvent e) {
				calDialog cal = new calDialog(); //btn�� ������ calDialog�� ����
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
			
			add(new JLabel("�� ���� ���մϴ�"));
			add(input1);
			add(new JLabel(""));
			add(input2);
			add(new JLabel(""));
			add(Abtn);
			
			Abtn.addActionListener(new ActionListener() { //ADD�� Action ������ ���
				public void actionPerformed(ActionEvent e) {
					int res = Integer.parseInt(input1.getText()) + Integer.parseInt(input2.getText()); //input1�� input2�� ����
					lb.setText(Integer.toString(res)); //��� ���
				}
			});
		}
	}
	public static void main(String[] args) {
		new ch14_06();
	}
}
