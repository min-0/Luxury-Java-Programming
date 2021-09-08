package ch4;

import java.util.*;

class phone {
	String name;
	String tel;

	phone() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>> ");
		name = sc.next();
		tel = sc.next();
		System.out.println("저장되었습니다...");

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
				System.out.println(sname + "의 번호는 " + array[i].tel + " 입니다");
				check = 0;
			}
		}
		if (check == 1)
			System.out.println(sname + "이 없습니다");
	}
}

public class _4장8번2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		phoneBook book;

		System.out.print("인원수>> ");
		int n = sc.nextInt();
		book = new phoneBook(n);

		while (true) {
			System.out.print("검색할 이름>> ");
			String sname = sc.next();
			if (sname.equals("그만"))
				break;
			book.search(sname);
		}
	}
}