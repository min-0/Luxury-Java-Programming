package ch3_;

import java.util.*;

public class _3��7�� {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] iArray = new int[10];
		int sum=0;
		System.out.print("������ ������: ");
		for(int i = 0; i < 10; i++) {
			iArray[i] = (int)(Math.random()*10 + 1);
			
			System.out.print(i + " ");
			sum += iArray[i];
		}
		System.out.println("\n����� "+(double)sum/10);
		sc.close();
	}
}
