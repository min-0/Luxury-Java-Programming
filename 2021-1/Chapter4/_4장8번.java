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
				System.out.println(name + "의 번호는 " + array[i].tel + "입니다");
				return;
			}
		}
		System.out.println(name + "이 없습니다.");
	}
	public void go() {
		String str;
		System.out.print("검색할 이름>>");
		str = sc.next();
		while(true) {
			if(str.equals("그만"))
				break;
			else {
			find(str);
			System.out.print("검색할 이름>>");
			str = sc.next();
			}
		}
	}
}

public class _4장8번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		phoneBook book;
		System.out.print("인원수>> ");
		int n = sc.nextInt();
		book = new phoneBook(n);
		for(int i=0;i<n;i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name=sc.next();
			String tel=sc.next();
			book.input(name, tel);
		}
		System.out.println("저장되었습니다.....");
		book.go();
		
	}
}