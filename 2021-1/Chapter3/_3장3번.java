package ch3_;
import java.util.*;

public class _3��3�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�>>");
		int input = sc.nextInt();
		
		for(int i = 0; i < input; i++) {
			for(int k = i; k < input; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
