package ch3_;

import java.util.*;

public class _3장6번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		
		System.out.print("금액을 입력하시오>>");
		int money = sc.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			if (money / unit[i] != 0)
				System.out.printf(unit[i]+"원 짜리 : " + money / unit[i]+"개 \n");
			money = money - (money / unit[i]) * unit[i];
		}
	}
}
