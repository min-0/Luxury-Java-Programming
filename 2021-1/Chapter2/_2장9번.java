package ch2_;

import java.util.*;
public class _2장9번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		double r = sc.nextDouble();
		System.out.print("점 입력>>");
		double xx = sc.nextDouble();
		double yy = sc.nextDouble();
		
		double aa = (x - xx)*(x-xx)+(y - yy)*(y - yy);
		if(Math.sqrt(aa)<=r) {
			System.out.println("점 (" + xx + ", " + yy + ") 는 원 안에 있다." );
		}
		else {
			System.out.println("점 (" + xx + ", " + yy + ") 는 원 안에 없다." );
		}
		sc.close();
	}

}
