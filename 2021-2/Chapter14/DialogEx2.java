package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyModalialog extends JDialog {
	private JTextField tf = new JTextField(10);
	private JButton okButton = new JButton("OK");
	
	public MyModalialog(JFrame frame, String title) {
		super(frame, title, true); //true�� ��� Ÿ���� ���鵵�� ����
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		setSize(200, 100);
		
		//���̾�α� ok ��ư�� Action ������ �ޱ�
		//ok ��ư�� ���õǸ� ���̾�αװ� ȭ�鿡�� ������� �Ѵ�.
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //���̾�α׸� ������ �ʰ� �Ѵ�.
			}
		});
	}
	//�ؽ�Ʈ�ʵ� â�� ����ڰ� �Է��� ���ڿ��� �����Ѵ�.
	//�Էµ� ������ ������ null�� �����Ѵ�.
	public String getInput() {
		if(tf.getText().length() == 0) return null;
		else return tf.getText();
	}
}

public class DialogEx2 extends JFrame {
	private MyModalialog dialog; //���̾�α��� ���۷���
	public DialogEx2() {
		super("DialogEx2 ���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show Modal Dialog");
		
		//��� ���̾�α� ����
		dialog = new MyModalialog(this, "Test Modal Dialog");
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true); //��� ���̾�α� �۵� ����
				
				//���̾�α׷κ��� ����ڰ� �Է��� ���ڿ��� �޾ƿ´�.
				String text = dialog.getInput();
				
				if(text == null) return; //�Է��� ���ڿ��� ���� ���
				JButton btn = (JButton)e.getSource();
				btn.setText(text); //�Է��� ���ڿ��� �� ��ư�� ���ڿ��� �����Ѵ�.
			}
		});
		getContentPane().add(btn);
		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new DialogEx2();
	}

}

