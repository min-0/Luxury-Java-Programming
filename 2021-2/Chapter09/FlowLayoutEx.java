package Chapter9;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {

	public FlowLayoutEx() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		//����Ʈ�ҿ� FlowLayout ��ġ������ ����
		c.setLayout(new FlowLayout());
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("calculate"));
		
		setSize(300, 200); //������ ũ�� 300*200 ����
		setVisible(true); //ȭ�鿡 ������ ���
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}

}
