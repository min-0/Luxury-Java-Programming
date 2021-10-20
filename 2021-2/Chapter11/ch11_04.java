package Chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch11_04 extends JFrame {
	private int moneys[]= {50000,10000,1000,500,100,50,10,1}; //금액 수 배열
	private String[] names = {"오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"};
	//금액 string 배열
	
	JTextField[] text = new JTextField[names.length]; //환산될 금액 텍스트필드
	JLabel la = new JLabel();
	JCheckBox[] cb = new JCheckBox[7]; //금액 체크박스 7개
	JTextField input = new JTextField(10); //입력 받을 텍스트필드
	
	public ch11_04() {
		MyActionListener listener = new MyActionListener(); //리스너 객체 생성
		
		setTitle("Money Changer CheckBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null); //컨텐트팬의 배치관리자 제거
		c.setBackground(Color.PINK); //배경색 지정
		
		JLabel total = new JLabel("금액");
		total.setSize(30, 30);
		total.setLocation(60, 30);
		
		input.setSize(90, 20);
		input.setLocation(100, 30);
		
		JButton btn = new JButton("계산"); //계산될 버튼
		btn.setSize(60, 20);
		btn.setLocation(200, 30);
		
		c.add(total);
		c.add(input);
		c.add(btn);
		
		btn.addActionListener(listener); //Action 이벤트 리스너 달기
			
		for(int i = 0; i < names.length; i++) {
			la = new JLabel(names[i]); //금액 string 출력할 Label
			la.setHorizontalAlignment(JLabel.RIGHT); //문자 오른쪽 정렬
			la.setSize(50, 20); //사이즈 50*20
			la.setLocation(60, 70 + (i * 20)); //위치 지정
			
			text[i] = new JTextField(8); //환산될 금액 객수가 들어갈 TextField
			text[i].setHorizontalAlignment(JTextField.CENTER); //문자 가운데 정렬
			text[i].setSize(50, 20); //사이즈 50*20
			text[i].setLocation(130, 70 + (i * 20)); //위치 지정
			
			c.add(la);
			c.add(text[i]);
		}
		for(int i = 0; i<cb.length; i++) {
			cb[i] = new JCheckBox(); //체크박스 생성
			cb[i].setBorderPainted(true); //버튼 배경 색
			c.add(cb[i]);
			
			cb[i].setHorizontalAlignment(JTextField.CENTER); //체크박스 가운데 정렬
			cb[i].setSize(15, 15); //사이즈 15*15
			cb[i].setLocation(200, 70 + (i * 20)); //위치 지정
		}
		
		setSize(320, 320);
		setVisible(true);
	}
	//Action 리스너 구현
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String s = input.getText(); //입력받은 수 문자로 변환하여 받기
			int money = Integer.parseInt(s); //계산 가능하도록 정수로 변환
			int res; //결과 저장
			
			for(int i = 0; i<moneys.length; i++) {
				if(i == 7) { //i가 7일 때 (1원을 가리킬 때)
					res = money/moneys[i];
					text[i].setText(Integer.toString(res));
					break;
				}
				if(!cb[i].isSelected()) { //체크박스가 체크 안되어 있을 때
					text[i].setText("0"); //체크 안된 부분 0개 처리
					continue;
				}
				res = money/moneys[i];
				text[i].setText(Integer.toString(res));
				if(res>0) money = money % moneys[i]; //환산 금액
			}
		}
	}
	public static void main(String[] args) {
		new ch11_04();
	}
}
