package Chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch11_01 extends JFrame {
	private JButton btn = new JButton("test button");
	private JCheckBox[] checkBox = new JCheckBox[2];
	public ch11_01() {
		setTitle("CheckBox Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		checkBox[0] = new JCheckBox("버튼 비활성화");
		checkBox[1] = new JCheckBox("버튼 감추기");
		
		c.add(checkBox[0]);
		c.add(checkBox[1]);
		c.add(btn);
		
		setSize(300, 150);
		setVisible(true);
		
		checkBox[0].addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					btn.setEnabled(false);
				else
					btn.setEnabled(true);
			}
		});
		checkBox[1].addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					btn.setVisible(false);
				else
					btn.setVisible(true);
			}
		});
	}
	public static void main(String[] args) {
		new ch11_01();
	}

}
