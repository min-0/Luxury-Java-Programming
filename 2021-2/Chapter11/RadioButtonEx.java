package Chapter11;

import javax.swing.*;
import java.awt.*;

public class RadioButtonEx extends JFrame {
	public RadioButtonEx() {
		setTitle("라디오버튼 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//이미지 라디오 버튼을 만들기 위해 2개의 이미지 객체 생성
		ImageIcon green = new ImageIcon("images/green.jpg"); //해제 상태 이미지
		ImageIcon selectedred = new ImageIcon("images/red.jpg"); //선택 상태 이미지
		
		//버튼 그룹 객체 생성
		ButtonGroup g = new ButtonGroup(); //3개의 라디오 버튼을 묶을 버튼 그룹 객체 생성
		
		//3개의 라디오버튼 생성
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배", true);
		JRadioButton call = new JRadioButton("수신", green);
		
		call.setBorderPainted(true);
		call.setSelectedIcon(selectedred);
		
		//컨텐트 팬에 3개의 라디오 버튼 부착 //버튼 그룹에 등록하여 하나만 선택되게 함
		g.add(apple);
		g.add(pear);
		g.add(call);
		
		//컨텐트 팬에 3개의 라디오 버튼 부착
		c.add(apple);
		c.add(pear);
		c.add(call);
		
		setSize(500, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new RadioButtonEx();
	}

}
