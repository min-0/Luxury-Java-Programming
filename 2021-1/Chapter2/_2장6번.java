package ch2_;

import java.util.*;

public class _2Àå6¹ø {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~99 »çÀÌÀÇ Á¤¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À>>");
		int input = sc.nextInt();
		int cnt = 0;
		if (input > 0 && input < 100) {
			if (input % 10 == 3 || input % 10 == 6 || input % 10 == 9) {
				cnt++;
			}
			if (input / 10 == 3 || input / 10 == 6 || input / 10 == 9) {
				cnt++;
			}
		}
		if (cnt == 1) {
			System.out.println("¹Ú¼öÂ¦");
		} else if (cnt == 2) {
			System.out.println("¹Ú¼öÂ¦Â¦");
		}
		sc.close();
	}
}
