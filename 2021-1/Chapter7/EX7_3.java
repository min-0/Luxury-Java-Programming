package ch7;

import java.util.*;

public class EX7_3 {
	public static void main(String[] args) {
		//���ڿ��� ���� ������ ArrayList ����
		ArrayList<String> a = new ArrayList<String>();
		
		//Ű����κ��� 4���� �̸� �Է� �޾� ArrayList�� ����
		Scanner sc = new Scanner(System.in); //Scanner ��ü ����
		for(int i=0; i<4; i++) {
			System.out.print("�̸��� �Է��϶�");
			String s = sc.next(); //Ű����κ��� �̸��� �Է�
			a.add(s); //ArrayList �÷��ǿ� ����
		}
		
		//ArrayList�� ��� �ִ� ��� �̸� ���
		for (int i=0; i<4; i++) {
			String name = a.get(i); //ArrayList�� i��° ���ڿ� ������
			System.out.print(name + " ");
		}
		
		//���� �� �̸� ���
		int longestIndex = 0; //���� ���� �� �̸��� �ִ� ArrayList ���� �ε���
		for(int i=1; i<a.size(); i++) {
			if(a.get(longestIndex).length() < a.get(i).length()) //�̸� ���� ��
				longestIndex = i; //i��° �̸��� �� �� �̸���
		}
		System.out.println("\n���� �� �̸��� " + a.get(longestIndex));
		sc.close();
	}
}
