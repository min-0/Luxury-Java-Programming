package ch4;

import java.util.*;

class phone {
	String name;
	String tel;

	phone() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>> ");
		name = sc.next();
		tel = sc.next();
		System.out.println("����Ǿ����ϴ�...");

	}
}

class phoneBook {
	phone array[];

	public phoneBook(int n) {
		array = new phone[n];
		for (int i = 0; i < n; i++) {
			array[i] = new phone();
		}
	}

	public void search(String sname) {
		int check = 1;
		for (int i = 0; i < array.length; i++) {
			if (sname.equals(array[i].name)) {
				System.out.println(sname + "�� ��ȣ�� " + array[i].tel + " �Դϴ�");
				check = 0;
			}
		}
		if (check == 1)
			System.out.println(sname + "�� �����ϴ�");
	}
}

public class _4��8��2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		phoneBook book;

		System.out.print("�ο���>> ");
		int n = sc.nextInt();
		book = new phoneBook(n);

		while (true) {
			System.out.print("�˻��� �̸�>> ");
			String sname = sc.next();
			if (sname.equals("�׸�"))
				break;
			book.search(sname);
		}
	}
}