package ch4;
import java.util.*;

class Circle{
	private double x, y;
	private int radius;
	public Circle(double x, double y, int radius) {//x, y, radius �ʱ�ȭ
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("(" + x + ", " + y + ")" +radius);
	}
}
public class _4��5�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c[] = new Circle[3];//3���� Circle �迭 ����
		for (int i = 0; i<3; i++) {
			System.out.print("x, y, radius>>");
			double x = sc.nextDouble();//x ���� �б�
			double y = sc.nextDouble();//y ���� �б�
			int radius = sc.nextInt();//������ �б�
			c[i] = new Circle(x, y, radius);//circle ��ü ����
		}
		for(int i = 0; i<c.length; i++) {//��� Circle ��ü ���
			c[i].show();
		}
		sc.close();
	}
}
