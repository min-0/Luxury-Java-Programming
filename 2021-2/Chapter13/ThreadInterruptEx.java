package Chapter13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TimerRunnable1 implements Runnable {
	private JLabel timerLabel; //Ÿ�̸� ���� ��µ� ���̺�
	public TimerRunnable1(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	//������ �ڵ�, run()�� �����ϸ� ������ ����
	public void run() {
		int n = 0; //Ÿ�̸� ī��Ʈ ��
		while(true) { //���� ����
			timerLabel.setText(Integer.toString(n)); //Ÿ�̸� ���� ���̺� ���
			n++; //ī��Ʈ ����
			try {
				Thread.sleep(1000); //1�ʵ��� ���� �ܴ�
			}
			catch(InterruptedException e) {
				return; //���ܰ� �߻��ϸ� ������ ����
			}
		}
	}
}

public class ThreadInterruptEx extends JFrame {
	private Thread th;
	public ThreadInterruptEx() {
		setTitle("ThreadInterruptEx ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//Ÿ�̸� ���� ����� ���̺� ����
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("���", Font.ITALIC, 80));
		
		//Ÿ�̸� ������� ����� Runnable ��ü ����
		//Ÿ�̸� ���� ����� ���̺� ������Ʈ�� �����ڿ��� �����Ѵ�.
		TimerRunnable1 runnable = new TimerRunnable1(timerLabel);
		th = new Thread(runnable); //������ ����
		c.add(timerLabel);
		
		JButton btn = new JButton("Kill Timer");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				th.interrupt(); //Ÿ�̸� ������ ���� ����
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false); //��ư ��Ȱ��ȭ
			}
		});
		c.add(btn);
		
		setSize(300, 170);
		setVisible(true);
		
		th.start(); //������ ���� ��Ŵ
	}
	public static void main(String[] args) {
		new ThreadInterruptEx();
	}

}
