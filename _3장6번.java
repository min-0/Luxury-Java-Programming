package ch3_;

import java.util.*;

public class _3��6�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money = sc.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			if (money / unit[i] != 0)
				System.out.printf(unit[i]+"�� ¥�� : " + money / unit[i]+"�� \n");
			money = money - (money / unit[i]) * unit[i];
		}
	}
}
