package ch5;

class Point_{
	private int x, y;
	public Point_() {this.x = 0; this.y = 0;}
	public Point_(int x, int y) {this.x = x; this.y = y;}
	public void showPoint() {
		System.out.println("(" + x + ", " + y +")");
	}
}

class ColorPoint_ extends Point_{
	private String color;
	public ColorPoint_(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class EX5_3 {
	public static void main(String[] args) {
		ColorPoint_ cp = new ColorPoint_(5, 6, "Blue");
		cp.showColorPoint();
	}

}
