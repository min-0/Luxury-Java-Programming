package ch2_;

import java.util.*;

public class _2장3번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money = sc.nextInt();
		int res = money;
		while(res > 0)
		if (res > 50000) {
			System.out.println("오만원권 " + res / 50000 + "매");
			res = res - 50000*(res/50000);
			continue;
		} else if (res > 10000) {
			System.out.println("만원권 " + res / 10000 + "매");
			res = res - 10000*(res/10000);
			continue;
		}else if (res > 1000) {
			System.out.println("천원권 " + res / 1000 + "매");
			res = res - 1000*(res/1000);
			continue;
		}else if (res > 100) {
			System.out.println("백원 " + res / 100 + "개");
			res = res - 100*(res/100);
			continue;
		}else if (res > 50) {
			System.out.println("오십원 " + res / 50 + "개");
			res = res - 50*(res/50);
			continue;
		}else if (res > 10) {
			System.out.println("십원 " + res / 10 + "개");
			res = res - 10*(res/10);
			continue;
		}else if (res > 1) {
			System.out.println("일원 " + res / 1 + "개");
			res = res - 1*(res/1);
			break;
		}
		sc.close();
	}
}
