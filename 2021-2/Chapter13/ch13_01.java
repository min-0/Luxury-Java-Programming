package Chapter13;

import java.util.*;

class Counting implements Runnable {
	public void run() {
		System.out.println("스레드 실행 시작");
		for(int i = 0; i < 10; i++) {
			System.out.print(i+1 + " ");
		}
		System.out.println("\n스레드 종료");
	}
}

public class ch13_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아무 키나 입력>> ");
		sc.next();
		sc.close();
		
		Thread th = new Thread(new Counting());
		th.start();
		
	}

}
