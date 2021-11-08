package Chapter11;

import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame {
	private String [] fruits = {"apple", "banana", "kiwi","mango", "pear", "peach", "berry", "strawberry", "blackberry"};
	private ImageIcon [] images = {
			new ImageIcon("images/call.jpg"),
			new ImageIcon("images/green.jpg"),
			new ImageIcon("images/red.jpg")
	};
	public ListEx() {
		setTitle("����Ʈ ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JList<String> strList = new JList<String>(fruits); //���ڿ� ����Ʈ ����
		c.add(strList);
		
		JList<ImageIcon> imageList = new JList<ImageIcon>(); //�̹��� ����Ʈ ����
		imageList.setListData(images);
		c.add(imageList);
		
		JList<String> scrollList = new JList<String>(fruits); //���ڿ� ����Ʈ ����
		c.add(new JScrollPane(scrollList)); //����Ʈ�� JScrollPane�� ����
		
		setSize(500, 650);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListEx();
	}

}
