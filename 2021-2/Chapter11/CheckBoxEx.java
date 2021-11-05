package Chapter11;

import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame{
	public CheckBoxEx() {
		setTitle("üũ�ڽ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//�̹��� üũ�ڽ��� ����� 2���� �̹��� ��ü ����
		ImageIcon green = new ImageIcon("images/green.jpg"); //���� ���� �̹���
		ImageIcon selectedred = new ImageIcon("images/red.jpg"); //���� ���� �̹���
		
		//3���� üũ�ڽ� ����
		JCheckBox apple = new JCheckBox("���");
		JCheckBox pear = new JCheckBox("��", true);
		JCheckBox call = new JCheckBox("����", green);
		
		call.setBorderPainted(true);
		call.setSelectedIcon(selectedred);
		
		//����Ʈ �ҿ� 3���� üũ�ڽ� ����
		c.add(apple);
		c.add(pear);
		c.add(call);
		
		setSize(500, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CheckBoxEx();
	}

}
