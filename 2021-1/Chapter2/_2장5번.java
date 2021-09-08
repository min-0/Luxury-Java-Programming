package ch2_;

import java.util.*;
public class _2장5번 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오>>");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if(n1+n2>=n3||n1+n3>=n2||n2+n3>=n1) {
			System.out.println("삼각형이 됩니다.");
		}
		else {
			System.out.println("삼각형이 될 수 없습니다.");
		}
		sc.close();
	}
}
