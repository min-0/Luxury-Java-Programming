package Chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch11_04 extends JFrame {
	private int moneys[]= {50000,10000,1000,500,100,50,10,1}; //�ݾ� �� �迭
	private String[] names = {"������", "����", "õ��", "500��", "100��", "50��", "10��", "1��"};
	//�ݾ� string �迭
	
	JTextField[] text = new JTextField[names.length]; //ȯ��� �ݾ� �ؽ�Ʈ�ʵ�
	JLabel la = new JLabel();
	JCheckBox[] cb = new JCheckBox[7]; //�ݾ� üũ�ڽ� 7��
	JTextField input = new JTextField(10); //�Է� ���� �ؽ�Ʈ�ʵ�
	
	public ch11_04() {
		MyActionListener listener = new MyActionListener(); //������ ��ü ����
		
		setTitle("Money Changer CheckBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null); //����Ʈ���� ��ġ������ ����
		c.setBackground(Color.PINK); //���� ����
		
		JLabel total = new JLabel("�ݾ�");
		total.setSize(30, 30);
		total.setLocation(60, 30);
		
		input.setSize(90, 20);
		input.setLocation(100, 30);
		
		JButton btn = new JButton("���"); //���� ��ư
		btn.setSize(60, 20);
		btn.setLocation(200, 30);
		
		c.add(total);
		c.add(input);
		c.add(btn);
		
		btn.addActionListener(listener); //Action �̺�Ʈ ������ �ޱ�
			
		for(int i = 0; i < names.length; i++) {
			la = new JLabel(names[i]); //�ݾ� string ����� Label
			la.setHorizontalAlignment(JLabel.RIGHT); //���� ������ ����
			la.setSize(50, 20); //������ 50*20
			la.setLocation(60, 70 + (i * 20)); //��ġ ����
			
			text[i] = new JTextField(8); //ȯ��� �ݾ� ������ �� TextField
			text[i].setHorizontalAlignment(JTextField.CENTER); //���� ��� ����
			text[i].setSize(50, 20); //������ 50*20
			text[i].setLocation(130, 70 + (i * 20)); //��ġ ����
			
			c.add(la);
			c.add(text[i]);
		}
		for(int i = 0; i<cb.length; i++) {
			cb[i] = new JCheckBox(); //üũ�ڽ� ����
			cb[i].setBorderPainted(true); //��ư ��� ��
			c.add(cb[i]);
			
			cb[i].setHorizontalAlignment(JTextField.CENTER); //üũ�ڽ� ��� ����
			cb[i].setSize(15, 15); //������ 15*15
			cb[i].setLocation(200, 70 + (i * 20)); //��ġ ����
		}
		
		setSize(320, 320);
		setVisible(true);
	}
	//Action ������ ����
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String s = input.getText(); //�Է¹��� �� ���ڷ� ��ȯ�Ͽ� �ޱ�
			int money = Integer.parseInt(s); //��� �����ϵ��� ������ ��ȯ
			int res; //��� ����
			
			for(int i = 0; i<moneys.length; i++) {
				if(i == 7) { //i�� 7�� �� (1���� ����ų ��)
					res = money/moneys[i];
					text[i].setText(Integer.toString(res));
					break;
				}
				if(!cb[i].isSelected()) { //üũ�ڽ��� üũ �ȵǾ� ���� ��
					text[i].setText("0"); //üũ �ȵ� �κ� 0�� ó��
					continue;
				}
				res = money/moneys[i];
				text[i].setText(Integer.toString(res));
				if(res>0) money = money % moneys[i]; //ȯ�� �ݾ�
			}
		}
	}
	public static void main(String[] args) {
		new ch11_04();
	}
}
