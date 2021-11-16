package Chapter13;

import javax.swing.*;
import java.awt.*;

class TimerThread extends Thread {
	private JLabel timerLabel; //Ÿ�̸� ���� ��µǴ� ���̺�
	public TimerThread (JLabel timerLabel) {
		this.timerLabel = timerLabel; //Ÿ�̸� ī��Ʈ�� ����� ���̺�
	}
	//������ �ڵ�. run()�� �����ϸ� ������ ����
	@Override
	public void run() {
		int n = 0; //Ÿ�̸� ī��Ʈ ��
		while(true) {
			timerLabel.setText(Integer.toString(n)); //���̺� ī��Ʈ �� ���
			n++; //ī��Ʈ ����
			try {
				Thread.sleep(1000); //1�� ���� ���� �ܴ�.
			}
			catch(InterruptedException e) {
				return; //���ܰ� �߻��ϸ� ������ ����
			}
		}
	}
}

public class ThreadTimerEx extends JFrame {
	public ThreadTimerEx() {
		setTitle("Thread�� ��� ���� Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//Ÿ�̸� ���� ����� ���̺� ����
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("���", Font.ITALIC, 80));
		c.add(timerLabel);
		
		//Ÿ�̸� ������ ��ü ����. Ÿ�̸� ���� ����� ���̺� �����ڿ� ����
		TimerThread th = new TimerThread(timerLabel); //������ ��ü�� �����
		
		setSize(300, 170);
		setVisible(true);
		
		th.start(); //Ÿ�̸� �������� ������ �����ϰ� �ȴ�.
	}
	
	public static void main(String[] args) {
		new ThreadTimerEx();
	}
}
