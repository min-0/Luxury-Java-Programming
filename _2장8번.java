package ch2_;

import java.util.*;

public class _2��8�� {
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else
			return false;
	}

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� (x1, y1), �� (x2, y2)�� �Է�>>");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		boolean result;
		result = inRect(x1, y1, 100, 100, 200, 200);
		
		if(result == true) {
			result = inRect(x2, y2, 100, 100, 200, 200);
			if(result == true) System.out.println("�� �簢���� �浹���� �ʴ´�.");
			else if(result == false) System.out.println("�� �簢���� �浹�Ѵ�.");
		}
		else if(result == false) {
			result = inRect(x2, y2, 100, 100, 200, 200);
			if(result == true) System.out.println("�� �簢���� �浹�Ѵ�.");
			else if(result == false) System.out.println("�� �簢���� �浹���� �ʴ´�.");
		}
		sc.close();
	}
}
