package ch3_;
import java.util.*;

public class _3장3번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오>>");
		int input = sc.nextInt();
		
		for(int i = 0; i < input; i++) {
			for(int k = i; k < input; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
