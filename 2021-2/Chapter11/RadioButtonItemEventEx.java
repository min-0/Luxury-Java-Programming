package Chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonItemEventEx extends JFrame{
	private JRadioButton[] color = new JRadioButton[3]; //������ư �迭
	private String[] names = {"����", "�ʷ�", "����"}; //������ư�� ���ڿ�
	private ImageIcon [] image = { //�̹��� ��ü �迭
			new ImageIcon("images/call.jpg"),
			new ImageIcon("images/green.jpg"),
			new ImageIcon("images/red.jpg")
	};
	private JLabel imageLabel = new JLabel(); //�̹����� ��µ� ���̺�
	
	public RadioButtonItemEventEx() {
		setTitle("������ư ItemEvent ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel radioPanel = new JPanel(); //3���� ������ư�� ������ �г�
		radioPanel.setBackground(Color.gray);
		
		ButtonGroup g = new ButtonGroup(); //��ư �׷� ��ü ����
			for(int i = 0; i < color.length; i++) { //3���� ������ư�� ����
				color[i] = new JRadioButton(names[i]); //������ư ����
				g.add(color[i]); //��ư �׷쿡 ����
				radioPanel.add(color[i]); //�гο� ����
				color[i].addItemListener(new MyItemListener()); //������ư�� ������ ������ ���
			}
			color[2].setSelected(true); //���� ������ư�� ���� ���·� ����
			c.add(radioPanel, BorderLayout.NORTH); //����Ʈ�ҿ� North�� �����г� ����
			c.add(imageLabel, BorderLayout.CENTER); //����Ʈ���� Center�� �̹��� ���̺� ����
			imageLabel.setHorizontalAlignment(SwingConstants.CENTER); //�̹��� �߾� ����
			
			setSize(500, 300);
			setVisible(true);
	}
	//������ ������ �ۼ�
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED) return; //������ ��� ����
			
			if(color[0].isSelected()) imageLabel.setIcon(image[0]);
			else if(color[1].isSelected()) imageLabel.setIcon(image[1]);
			else if(color[2].isSelected()) imageLabel.setIcon(image[2]);
			
		}
	}
	public static void main(String[] args) {
		new RadioButtonItemEventEx();
	}

}
