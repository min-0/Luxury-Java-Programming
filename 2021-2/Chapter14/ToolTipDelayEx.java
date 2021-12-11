package Chapter14;

import javax.swing.*;
import java.awt.*;

public class ToolTipDelayEx extends JFrame {
	public ToolTipDelayEx() {
		setTitle("���� ���� �ð� ���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel red = new JLabel(new ImageIcon("images/red.jpg"));
		red.setToolTipText("���� �̹��� ���");
		
		JLabel green = new JLabel(new ImageIcon("images/green.jpg"));
		green.setToolTipText("�ʷ� �̹��� ���");
		
		c.add(red);
		c.add(green);
		
		//ToolTipManager ��ü�� ���
		ToolTipManager m = ToolTipManager.sharedInstance();
		m.setInitialDelay(0); //�ʱ� ���� ��� ���� �ð��� 0�ʷ� ����
		m.setDismissDelay(10000); //���� ���� �ð��� 10�ʷ� ����
		
		setSize(500, 250);
		setVisible(true);

	}
	public static void main(String[] args) {
		new ToolTipDelayEx();
	}
}
