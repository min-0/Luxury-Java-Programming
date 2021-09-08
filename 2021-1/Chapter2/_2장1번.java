package ch2_;

import java.util.*;

public class _2장1번 {

	public static void main(String[] args) {
		System.out.print("원화를 입력하세요(단위 원)>>");
		Scanner sc = new Scanner(System.in);
		
		int won = sc.nextInt();
		
		System.out.println(won + "원은 $" + (double)won/1100 + "입니다.");
	}

}
