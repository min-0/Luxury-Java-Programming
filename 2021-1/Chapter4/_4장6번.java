package ch4;
import java.util.*;

class CircleManager{
	private double x, y;
	private int radius;
	public CircleManager(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public int get() {
		return radius;
	}
	public void show() {
		System.out.println("가장 면적이 큰 원은 " + "(" + x + ", " + y + ")" + radius);
	}
}
public class _4장6번 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CircleManager [] c = new CircleManager[3];
		for(int i = 0; i<3; i++) {
			System.out.print("x, y, radius>>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new CircleManager(x, y, radius);
		}
		
		int max = 0;
		int index = 0;
		for (int i = 0; i < c.length; i++) {
			if(max < c[i].get()) {
				max = c[i].get();
				index = i;
			}
		}
		c[index].show();
		sc.close();
	}
}
