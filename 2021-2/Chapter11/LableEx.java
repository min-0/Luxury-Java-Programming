package Chapter11;

import javax.swing.*;
import java.awt.*;

public class LableEx extends JFrame {
	public LableEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//문자열 생성
		JLabel textLabel1 = new JLabel("사랑합니다");
		
		//이미지 레이블 생성
		ImageIcon heart = new ImageIcon("images/heart.jpg"); //이미지 로딩
		JLabel imageLael = new JLabel(heart); //이미지 레이블 생성
		
		//문자열과 이미지를 모두 가진 레이블 생성
		ImageIcon normalIcon = new ImageIcon("images/green.jpg"); //이미지 로딩
		JLabel label = new JLabel("보고싶으면 전화하세요", normalIcon, SwingConstants.CENTER); //레이블 생성
		
		//컨텐트팬에 3개의 레이블 부착
		c.add(textLabel1);
		c.add(imageLael);
		c.add(label);
		
		setSize(600, 750);
		setVisible(true);
	}
	public static void main(String[] args) {
		new LableEx();
	}

}
