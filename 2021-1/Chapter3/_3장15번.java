package ch3_;

import java.util.*;

public class _3장15번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("곱하고자 하는 두 수 입력>>");
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				System.out.println(n1 + "x" + n2 + "=" + (n1 * n2));
			}
			catch(InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				sc.next();
			}
		}
	}
}
