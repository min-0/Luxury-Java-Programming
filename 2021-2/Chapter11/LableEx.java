package Chapter11;

import javax.swing.*;
import java.awt.*;

public class LableEx extends JFrame {
	public LableEx() {
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//���ڿ� ����
		JLabel textLabel1 = new JLabel("����մϴ�");
		
		//�̹��� ���̺� ����
		ImageIcon heart = new ImageIcon("images/heart.jpg"); //�̹��� �ε�
		JLabel imageLael = new JLabel(heart); //�̹��� ���̺� ����
		
		//���ڿ��� �̹����� ��� ���� ���̺� ����
		ImageIcon normalIcon = new ImageIcon("images/green.jpg"); //�̹��� �ε�
		JLabel label = new JLabel("��������� ��ȭ�ϼ���", normalIcon, SwingConstants.CENTER); //���̺� ����
		
		//����Ʈ�ҿ� 3���� ���̺� ����
		c.add(textLabel1);
		c.add(imageLael);
		c.add(label);
		
		setSize(600, 750);
		setVisible(true);
	}
	public static void main(String[] args) {
		new LableEx();
	}

}
