package Chapter13;

import javax.swing.*;
import java.awt.*;

class TimerRunnable implements Runnable {
	private JLabel timerLabel; //Ÿ�̸� ���� ��µ� ���̺�
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel; //�� ī���͸� ����� ���̺�
	}
	
	@Override
	public void run() {
		int n = 0; //Ÿ�̸� ī��Ʈ ��
		while(true) { //���ѷ���
			timerLabel.setText(Integer.toString(n)); //���̺� ī��Ʈ ���
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

public class TimerRunnableEx extends JFrame {
	public TimerRunnableEx() {
		setTitle("Runnable�� ������ Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//Ÿ�̸� ���� ����� ���̺� ����
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("���", Font.ITALIC, 80));
		c.add(timerLabel);
		
		//Ÿ�̸� ������� ����� Runnable ��ü ����. Ÿ�̸� ���� ����� ���̺��� �����ڿ��� ����
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable); //������ ��ü ����
		
		setSize(250, 150);
		setVisible(true);
		
		th.start(); //Ÿ�̸� �����尡 ������ �����ϰ� �ȴ�.
	}
	public static void main(String[] args) {
		new TimerRunnableEx();
	}
}
