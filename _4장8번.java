package ch4;

import java.util.*;

class phone {
	String name;
	String tel;
	phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
}

class phoneBook {
	private int n;
	phone array[];
	Scanner sc;

	public phoneBook(int n) {
		array = new phone[n];
		n = 0;
		sc = new Scanner(System.in);
	}
	public void input(String name, String tel) {
		array[n++] = new phone(name, tel);
	}
	public void find(String name) {
		for(int i = 0; i < n; i++)
		{
			if(array[i].name.equals(name)) {
				System.out.println(name + "�� ��ȣ�� " + array[i].tel + "�Դϴ�");
				return;
			}
		}
		System.out.println(name + "�� �����ϴ�.");
	}
	public void go() {
		String str;
		System.out.print("�˻��� �̸�>>");
		str = sc.next();
		while(true) {
			if(str.equals("�׸�"))
				break;
			else {
			find(str);
			System.out.print("�˻��� �̸�>>");
			str = sc.next();
			}
		}
	}
}

public class _4��8�� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		phoneBook book;
		System.out.print("�ο���>> ");
		int n = sc.nextInt();
		book = new phoneBook(n);
		for(int i=0;i<n;i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String name=sc.next();
			String tel=sc.next();
			book.input(name, tel);
		}
		System.out.println("����Ǿ����ϴ�.....");
		book.go();
		
	}
}