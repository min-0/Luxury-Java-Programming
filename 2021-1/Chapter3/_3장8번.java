package ch3_;

import java.util.*;

public class _3장8번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개?>>");
		int input = sc.nextInt();
		int array[] = new int[input];

		for (int i = 1; i <= input; i++) {
			array[i - 1] = (int) (Math.random() * 100);
			System.out.print(array[i - 1] + " ");
			if (i % 10 == 0)
				System.out.println();
		}
		sc.close();
	}

}
