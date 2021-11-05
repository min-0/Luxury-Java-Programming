package Chapter11;

import javax.swing.*;
import java.awt.*;

public class RadioButtonEx extends JFrame {
	public RadioButtonEx() {
		setTitle("������ư ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//�̹��� ���� ��ư�� ����� ���� 2���� �̹��� ��ü ����
		ImageIcon green = new ImageIcon("images/green.jpg"); //���� ���� �̹���
		ImageIcon selectedred = new ImageIcon("images/red.jpg"); //���� ���� �̹���
		
		//��ư �׷� ��ü ����
		ButtonGroup g = new ButtonGroup(); //3���� ���� ��ư�� ���� ��ư �׷� ��ü ����
		
		//3���� ������ư ����
		JRadioButton apple = new JRadioButton("���");
		JRadioButton pear = new JRadioButton("��", true);
		JRadioButton call = new JRadioButton("����", green);
		
		call.setBorderPainted(true);
		call.setSelectedIcon(selectedred);
		
		//����Ʈ �ҿ� 3���� ���� ��ư ���� //��ư �׷쿡 ����Ͽ� �ϳ��� ���õǰ� ��
		g.add(apple);
		g.add(pear);
		g.add(call);
		
		//����Ʈ �ҿ� 3���� ���� ��ư ����
		c.add(apple);
		c.add(pear);
		c.add(call);
		
		setSize(500, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new RadioButtonEx();
	}

}
