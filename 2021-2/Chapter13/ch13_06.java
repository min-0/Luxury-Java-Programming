package Chapter13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch13_06 extends JFrame {
	ImageIcon icon = new ImageIcon("images/bubble.png"); //버블 이미지 생성
	Container c = getContentPane();
	
	private BThread th = null;

	public ch13_06() {
		setTitle("버블 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c.setLayout(null);
		c.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) { //마우스를 눌렀을 때
				int x = e.getX(); //x좌표값 저장
				int y = e.getY(); //y좌표값 저장
				th = new BThread(x, y); //스레드로 넘겨주기
				th.start(); //스레드 시작
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
			la.setSize(30, 30); //이미지 사이즈
			la.setOpaque(true);
			la.setLocation(x, y);
			c.add(la);
		}
		@Override
		public void run() {
			while(true){
               try{
                    sleep(20);//20ms 동안 잠을 잔다.
                    if(la.getY()+30<=0) //이미지가 프레임 밖으로 나가면 스레드를 종료
                        return;
                    int x=la.getX();
                    int y=la.getY()-5;//5픽셀씩 이미지 상승
    				la.setLocation(x, y); //이미지가 나타나는 위치(마우스 클릭 위치)
                }
                catch(Exception e){
                    return; //예외가 발생하면 스레드 종료
                }
            }
		}
	}
	public static void main(String[] args) {
		new ch13_06();
	}
}
