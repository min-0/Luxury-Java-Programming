package ch3_;

import java.util.*; //Scanner ��ü ������ ���� import ���� ��Ű�� ����
public class _3��16�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//�Է� �ޱ� ���� Scanner ��ü ����
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		String str[] = {"����", "����", "��"};//��ǻ�Ͱ� ����� ���� ���� �� �����
		String user = "";
		int n;
		
		while(true) {//����ڰ� "�׸�"�� �Է��� �� ���ѷ��� �� �� �ֵ��� while�� true�� �ɾ��ش�.
			System.out.print("���� ���� ��!>>");
			
			user = sc.next();//����� ���� ���� �� �� �ϳ� �Է�
			n = (int)(Math.random()*3);//��ǻ�Ͱ� ���� ���� �� �� �߿� �������� �� �� �ֵ��� �Ѵ�.
			
			if(user.equals("����")) {//����ڰ� ������ �Է� ���� ��
				if(str[n].equals("����")) //��ǻ�Ͱ� str[] �� �������� ���� ���� �� ���� ������ �� ó��
				{
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[n] + ", �����ϴ�.");
				}
				else if(str[n].equals("����"))
				{
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[n] + ", ��ǻ�Ͱ� �̰���ϴ�.");
				}
				else if(str[n].equals("��"))
				{
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[n] + ", ����ڰ� �̰���ϴ�.");
				}
			}
			else if(user.equals("����")) {//����ڰ� ������ �Է� ���� ��
				if(str[n].equals("����")) 
				{
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[n] + ", ����ڰ� �̰���ϴ�.");
				}
				else if(str[n].equals("����"))
				{
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[n] + ", �����ϴ�.");
				}
				else if(str[n].equals("��"))
				{
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[n] + ", ��ǻ�Ͱ� �̰���ϴ�.");
				}
			}
			else if(user.equals("��")) {//����ڰ� ���� �Է� ���� ��
				if(str[n].equals("����")) 
				{
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[n] + ", ��ǻ�Ͱ� �̰���ϴ�.");
				}
				else if(str[n].equals("����"))
				{
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[n] + ", ����ڰ� �̰���ϴ�.");
				}
				else if(str[n].equals("��"))
				{
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[n] + ", �����ϴ�.");
				}
			}
			else if(user.equals("�׸�")) {//����ڰ� �׸��� �Է� ���� ��
				System.out.println("������ �����մϴ�...");
				break;//���ѷ��� Ż�� �� ����
			}
			else//����ڰ� �߸� �Է��Ͽ��� ��
				System.out.println("'���� ���� ��' �Ǵ� �����Ͻ÷��� '�׸�'�� �Է����ּ���");
		}
		sc.close();
	}
}
