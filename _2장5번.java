package ch2_;

import java.util.*;
public class _2��5�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 3���� �Է��Ͻÿ�>>");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if(n1+n2>=n3||n1+n3>=n2||n2+n3>=n1) {
			System.out.println("�ﰢ���� �˴ϴ�.");
		}
		else {
			System.out.println("�ﰢ���� �� �� �����ϴ�.");
		}
		sc.close();
	}
}
