package ch4;
import java.util.*;

class Circle{
	private double x, y;
	private int radius;
	public Circle(double x, double y, int radius) {//x, y, radius 초기화
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("(" + x + ", " + y + ")" +radius);
	}
}
public class _4장5번 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c[] = new Circle[3];//3개의 Circle 배열 선언
		for (int i = 0; i<3; i++) {
			System.out.print("x, y, radius>>");
			double x = sc.nextDouble();//x 값이 읽기
			double y = sc.nextDouble();//y 값이 읽기
			int radius = sc.nextInt();//반지름 읽기
			c[i] = new Circle(x, y, radius);//circle 객체 생성
		}
		for(int i = 0; i<c.length; i++) {//모든 Circle 객체 출력
			c[i].show();
		}
		sc.close();
	}
}
