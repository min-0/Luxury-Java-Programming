package Chapter13;

import java.util.*;

class Counting implements Runnable {
	public void run() {
		System.out.println("������ ���� ����");
		for(int i = 0; i < 10; i++) {
			System.out.print(i+1 + " ");
		}
		System.out.println("\n������ ����");
	}
}

public class ch13_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ƹ� Ű�� �Է�>> ");
		sc.next();
		sc.close();
		
		Thread th = new Thread(new Counting());
		th.start();
		
	}

}
