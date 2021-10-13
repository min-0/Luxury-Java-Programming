package Chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxItemEventEx extends JFrame {
	private JCheckBox[] fruits = new JCheckBox[3];
	private String[] names = {"���", "��", "ü��"};
	
	private JLabel sumLabel;
	
	public CheckBoxItemEventEx() {
		setTitle("üũ�ڽ��� ItemEvent ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("��� 100��, �� 500��, ü�� 20000��"));
		
		//3���� üũ�ڽ��� ����, ����Ʈ�ҿ� �����ϰ� Item ������ ���
		MyItemListener listener = new MyItemListener();
		for(int i = 0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]); //names[]�� ���ڿ��� üũ�ڽ� ����
			fruits[i].setBorderPainted(true); //üũ�ڽ� �ܰ��� ���̵��� ����
			c.add(fruits[i]); //����Ʈ�ҿ� üũ�ڽ� ����
			fruits[i].addItemListener(listener); //üũ�ڽ� Item ������ ���
		}
		sumLabel = new JLabel("���� 0�� �Դϴ�.");
		c.add(sumLabel);
		
		setSize(250, 200);
		setVisible(true);
	}
	
	//Item ������ ����
	class MyItemListener implements ItemListener {
		private int sum = 0; //������ ��
		
		//üũ�ڽ��� ���� ���°� ���ϸ� itemStateChanged()�� ȣ���
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) { //���� ���
				if(e.getItem() == fruits[0]) sum += 100; //��� üũ�ڽ�
				else if(e.getItem() == fruits[1]) sum += 500; //�� üũ�ڽ�
				else sum += 20000; //ü�� üũ�ڽ�
			}
			else { //���� ���
				if(e.getItem() == fruits[0]) sum -= 100; //��� üũ�ڽ�
				else if(e.getItem() == fruits[1]) sum -= 500; //�� üũ�ڽ�
				else sum -= 20000; //ü�� üũ�ڽ�
			}
			sumLabel.setText("����" + sum + "�� �Դϴ�.") ; //�� ���
		}
	}
	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}

}
