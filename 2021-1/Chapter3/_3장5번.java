package ch3_;
import java.util.*;

public class _3��5�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
		
		int iArray [] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			iArray[i] = sc.nextInt();
		}
		System.out.print("3�� ����� ");
		for(int i = 0; i < 10; i++) {
			if(iArray[i]%3 == 0) {
				System.out.print(iArray[i]+" ");
			}
		}
	}

}
