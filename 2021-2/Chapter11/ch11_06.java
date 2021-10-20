package Chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class ch11_06 extends JFrame {
	public ch11_06() {
		setTitle("TextArea Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JTextArea ta = new JTextArea(5, 30); //텍스트 라인 최대 5줄, 최대 30자
		c.setLayout(new FlowLayout());
		c.add(ta);
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0); //수평슬라이드 생성, 최소, 최대, 초깃값
		slider.setPaintLabels(true); //슬라이더에 label을 보이게 한다.
		slider.setPaintTicks(true); //슬라이더에 눈금을 보이게 한다.
		slider.setPaintTrack(true); //슬라이더의 트랙을 보이게 한다.
		slider.setMajorTickSpacing(20); //슬라이더에 큰 눈금 간격 20
		slider.setMinorTickSpacing(5); //슬라이더에 작은 눈금 간격 5
		c.add(slider);
		
		//Change 리스너 구현
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) { //슬라이더의 값이 변경할 때 호출
				JSlider temp = (JSlider)e.getSource();
				String text = ta.getText();
				if(text.length() <= slider.getValue()) slider.setValue(text.length()); //문자열을 쓰면 슬라이더 늘어나게 변경
				else ta.setText(text.substring(0, temp.getValue())); //문자열이 줄어들면 슬라이더도 변경
			}
		});	
		//Key 리스너 구현
		ta.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) { //키가 눌려질 때 호출
				JTextArea t = (JTextArea)e.getSource();
				String text = t.getText();
				if(text.length() <= 100) slider.setValue(text.length()); //문자열 길이가 100보다 작을 때
				else text = text.substring(0,99); //문자열 자르기
			}
		});
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ch11_06();
	}
}
