package Chapter9;
import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("300x300 ���� ������ �����"); //super("Ÿ��Ʋ���ڿ�"); //JFrame ������ ȣ���ؼ� Ÿ��Ʋ �ޱ�
		setSize(300, 300); //������ ũ�� 300x300
		setVisible(true); //������ ���
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}

}
