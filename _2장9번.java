package ch2_;

import java.util.*;
public class _2��9�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �߽ɰ� ������ �Է�>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		double r = sc.nextDouble();
		System.out.print("�� �Է�>>");
		double xx = sc.nextDouble();
		double yy = sc.nextDouble();
		
		double aa = (x - xx)*(x-xx)+(y - yy)*(y - yy);
		if(Math.sqrt(aa)<=r) {
			System.out.println("�� (" + xx + ", " + yy + ") �� �� �ȿ� �ִ�." );
		}
		else {
			System.out.println("�� (" + xx + ", " + yy + ") �� �� �ȿ� ����." );
		}
		sc.close();
	}

}
