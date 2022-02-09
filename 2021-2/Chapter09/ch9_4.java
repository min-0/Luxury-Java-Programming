package Chapter9;

import javax.swing.*;
import java.awt.*;

public class ch9_4 extends JFrame {
	public ch9_4() {
		setTitle("Ten Color Button Frame"); //������ Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ �����츦 ������ ���α׷��� �����ϵ��� ����
		
		GridLayout grid = new GridLayout(1, 10); //1*10 ������ GridLayout ��ġ������ ����
		grid.setVgap(10); //���� ������ ���� ������ 10 �ȼ��� ����
		
		Container c = getContentPane(); //����Ʈ���� �˾Ƴ���.
		c.setLayout(grid); //grid�� ����Ʈ���� ��ġ�����ڷ� ����
		
		//0 ~ 9 ��ư �ޱ� & ����Ʈ���� ���� ����(RED ~ GRAY)
		c.add(new JButton("0")).setBackground(Color.RED);
		c.add(new JButton("1")).setBackground(Color.ORANGE);
		c.add(new JButton("2")).setBackground(Color.YELLOW);
		c.add(new JButton("3")).setBackground(Color.GREEN);
		c.add(new JButton("4")).setBackground(Color.CYAN);
		c.add(new JButton("5")).setBackground(Color.BLUE);
		c.add(new JButton("6")).setBackground(Color.MAGENTA);
		c.add(new JButton("7")).setBackground(Color.DARK_GRAY);
		c.add(new JButton("8")).setBackground(Color.PINK);
		c.add(new JButton("9")).setBackground(Color.GRAY);
		
		setSize(700, 300); //������ ũ�� 700*300 ����
		setVisible(true); //ȭ�鿡 ������ ���
	}
	public static void main(String[] args) {
		ch9_4 frame = new ch9_4();
	}
}
