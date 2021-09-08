package ch2_;
import java.util.*;
public class _2장7번 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점 (x,y)의 좌표를 입력하시오>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x >100 && x < 200 && y > 100 && y < 200) {
			System.out.println("("+x+", "+y+")"+"는 사각형 안에 있습니다.");
		}
		else {
			System.out.println("("+x+", "+y+")"+"는 사각형 안에 존재 하지 않습니다.");
		}
		sc.close();
	}
}
