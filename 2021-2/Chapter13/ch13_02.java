package Chapter13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyPanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int x = (int)(Math.random()*200);
		int y = (int)(Math.random()*200);
		
		g.setColor(Color.MAGENTA);
		g.drawOval(x, y, 50, 50);
	}
}

class MyThread extends Thread {
	private MyPanel mp;
	public MyThread(MyPanel pa) {
		mp = pa;
	}
	//������ �ڵ�. run()�� �����ϸ� ������ ����
	@Override
	public void run() {
		while(true) {
			try {
				sleep(400); //400ms ���� ���� �ܴ�.
				mp.repaint();
			} catch (InterruptedException e) {
				return; //���ܰ� �߻��ϸ� ������ ����
			}
		}
	}
}

public class ch13_02 extends JFrame {
	MyPanel mp=new MyPanel();
	MyThread th=new MyThread(mp); //������ ��ü�� �����.
	public ch13_02() {
		setTitle("���� 0.5�� �������� �����̱�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(mp);
		mp.setLayout(null); //��ġ�� ����Ǿ�� �ϹǷ� ��ġ������ ����
		mp.setOpaque(true); //�� ������ �����ϵ��� ����
		
		mp.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) { //���콺�� �������� ����
				th.start(); //�������� ������ �����ϰ� �ȴ�.
			}
		});
		
		setVisible(true);
		setSize(300,300);
	}
	
	public static void main(String [] args) {
		new ch13_02();
	}
}
 

