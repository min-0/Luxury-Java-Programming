package ch2_;

import java.util.*;

public class _2��3�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money = sc.nextInt();
		int res = money;
		while(res > 0)
		if (res > 50000) {
			System.out.println("�������� " + res / 50000 + "��");
			res = res - 50000*(res/50000);
			continue;
		} else if (res > 10000) {
			System.out.println("������ " + res / 10000 + "��");
			res = res - 10000*(res/10000);
			continue;
		}else if (res > 1000) {
			System.out.println("õ���� " + res / 1000 + "��");
			res = res - 1000*(res/1000);
			continue;
		}else if (res > 100) {
			System.out.println("��� " + res / 100 + "��");
			res = res - 100*(res/100);
			continue;
		}else if (res > 50) {
			System.out.println("���ʿ� " + res / 50 + "��");
			res = res - 50*(res/50);
			continue;
		}else if (res > 10) {
			System.out.println("�ʿ� " + res / 10 + "��");
			res = res - 10*(res/10);
			continue;
		}else if (res > 1) {
			System.out.println("�Ͽ� " + res / 1 + "��");
			res = res - 1*(res/1);
			break;
		}
		sc.close();
	}
}
