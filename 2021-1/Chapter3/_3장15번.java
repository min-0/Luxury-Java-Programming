package ch3_;

import java.util.*;

public class _3��15�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				System.out.println(n1 + "x" + n2 + "=" + (n1 * n2));
			}
			catch(InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				sc.next();
			}
		}
	}
}
