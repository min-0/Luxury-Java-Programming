package Chapter13;

import javax.swing.*;
import java.awt.*;
import java.util.*; //캘린더를 위한 import

public class ch13_03 extends JFrame {
	JLabel clock = new JLabel();
	public ch13_03() {
		setTitle("디지털 시계 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 40));
		
		Thread th = new Thread(new Digital());
		th.start();
		
		clock.setFont(new Font("고딕", Font.ITALIC, 50));
		c.add(clock);
		
		setSize(300, 200);
		setVisible(true);
	}
	class Digital implements Runnable {
		public void run() {
			Calendar c = Calendar.getInstance();			
			int hour = c.get(Calendar.HOUR_OF_DAY);
			int min = c.get(Calendar.MINUTE);
			int second = c.get(Calendar.SECOND);
			
			String clockText = Integer.toString(hour);
			clockText = clockText.concat(":");
			clockText = clockText.concat(Integer.toString(min));
			clockText = clockText.concat(":");
			clockText = clockText.concat(Integer.toString(second));
			while(true) {
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e){return;}
				clock.setText(clockText);
			}
		}
	}
	public static void main(String[] args) {
		new ch13_03();
	}

}
