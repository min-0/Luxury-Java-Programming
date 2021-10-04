package Chapter9;
import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("300x300 스윙 프레임 만들기"); //super("타이틀문자열"); //JFrame 생성자 호출해서 타이틀 달기
		setSize(300, 300); //프레임 크기 300x300
		setVisible(true); //프레임 출력
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}

}
