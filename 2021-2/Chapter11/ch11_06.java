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
		
		JTextArea ta = new JTextArea(5, 30); //�ؽ�Ʈ ���� �ִ� 5��, �ִ� 30��
		c.setLayout(new FlowLayout());
		c.add(ta);
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0); //���򽽶��̵� ����, �ּ�, �ִ�, �ʱ갪
		slider.setPaintLabels(true); //�����̴��� label�� ���̰� �Ѵ�.
		slider.setPaintTicks(true); //�����̴��� ������ ���̰� �Ѵ�.
		slider.setPaintTrack(true); //�����̴��� Ʈ���� ���̰� �Ѵ�.
		slider.setMajorTickSpacing(20); //�����̴��� ū ���� ���� 20
		slider.setMinorTickSpacing(5); //�����̴��� ���� ���� ���� 5
		c.add(slider);
		
		//Change ������ ����
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) { //�����̴��� ���� ������ �� ȣ��
				JSlider temp = (JSlider)e.getSource();
				String text = ta.getText();
				if(text.length() <= slider.getValue()) slider.setValue(text.length()); //���ڿ��� ���� �����̴� �þ�� ����
				else ta.setText(text.substring(0, temp.getValue())); //���ڿ��� �پ��� �����̴��� ����
			}
		});	
		//Key ������ ����
		ta.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) { //Ű�� ������ �� ȣ��
				JTextArea t = (JTextArea)e.getSource();
				String text = t.getText();
				if(text.length() <= 100) slider.setValue(text.length()); //���ڿ� ���̰� 100���� ���� ��
				else text = text.substring(0,99); //���ڿ� �ڸ���
			}
		});
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ch11_06();
	}
}
