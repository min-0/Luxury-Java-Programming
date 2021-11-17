package Chapter13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch13_06 extends JFrame {
	ImageIcon icon = new ImageIcon("images/bubble.png"); //���� �̹��� ����
	Container c = getContentPane();
	
	private BThread th = null;

	public ch13_06() {
		setTitle("���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c.setLayout(null);
		c.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) { //���콺�� ������ ��
				int x = e.getX(); //x��ǥ�� ����
				int y = e.getY(); //y��ǥ�� ����
				th = new BThread(x, y); //������� �Ѱ��ֱ�
				th.start(); //������ ����
			}
		});
		setSize(300, 300);
		setVisible(true);
	}
	class BThread extends Thread {
		int x, y;
		JLabel la = null;
		public BThread(int x, int y) {
			this.x = x;
			this.y = y;
			
			la = new JLabel(icon);
			la.setSize(30, 30); //�̹��� ������
			la.setOpaque(true);
			la.setLocation(x, y);
			c.add(la);
		}
		@Override
		public void run() {
			while(true){
               try{
                    sleep(20);//20ms ���� ���� �ܴ�.
                    if(la.getY()+30<=0) //�̹����� ������ ������ ������ �����带 ����
                        return;
                    int x=la.getX();
                    int y=la.getY()-5;//5�ȼ��� �̹��� ���
    				la.setLocation(x, y); //�̹����� ��Ÿ���� ��ġ(���콺 Ŭ�� ��ġ)
                }
                catch(Exception e){
                    return; //���ܰ� �߻��ϸ� ������ ����
                }
            }
		}
	}
	public static void main(String[] args) {
		new ch13_06();
	}
}
