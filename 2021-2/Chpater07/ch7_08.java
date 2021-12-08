package Chapter7;

import java.util.*; //�ؽø� ����� ���� import
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch7_08 extends JFrame {
	private HashMap<String, Integer> map = new HashMap<>(); //�ؽø� ����
	public ch7_08() {
		setTitle("����Ʈ ���� ���α׷�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 10)); 
		//��ġ�����ڸ� FlowLayout���� ����, ��� �����ϰ� �¿찣�� 100, ���ϰ��� 10���� ����

		JLabel title = new JLabel("** ����Ʈ ���� ���α׷��Դϴ� **");
		c.add(title);
		
		JButton btn = new JButton("����Ʈ ���� �ϱ�"); //����Ʈ ������ �� �ִ� ���̾�α� ��ư
		btn.setBackground(Color.pink); //��ư ���� pink�� ����
		btn.setSize(30, 50);
		c.add(btn);
		
		JLabel list = new JLabel("����Ʈ ��Ȳ"); //���� �̸��� ����Ʈ�� ����� ���̺�
		c.add(list);
		
		btn.addActionListener(new ActionListener() { //��ư�� ���� ActionListner ���
			public void actionPerformed(ActionEvent e) {
				String input = JOptionPane.showInputDialog("�̸��� ����Ʈ �Է�"); //�Է��� �� �ִ� ���̾�α� ����
				
	            if(input.equals("�׸�")) System.exit(0); //�ؽ�Ʈâ�� "�׸�"�̶�� �Է��� ��� ���α׷� ����

	            String arr[] = input.split(" "); //������ �������� ���ڿ��� �߶� �迭 arr�� ����
	            list.setText(""); //���̺� �ʱ�ȭ �ٽ� �׸��� ����

	            Integer name = map.get(arr[0]); //�迭 0��°�� �� �̸�(point�� ���� Ÿ������)
	            Integer point = Integer.parseInt(arr[1]); //�迭 1��°�� ����Ʈ ��
	            if(name != null) point += name; //�̸��� null�� �ƴ� ��  �ʿ��� �ش� �̸��� ã�� ����Ʈ �߰�
	            map.put(arr[0], point); //�ʿ� ����Ʈ �߰�
	            
	            Iterator<String> keys = map.keySet().iterator(); 
	            while(keys.hasNext()) {
	                String key = keys.next();
	                list.setText(list.getText() + "(" + key + ", " +  map.get(key) + ")");
	            }
			}
		});
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ch7_08();
	}
}
