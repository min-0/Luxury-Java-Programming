package ch5;

class Shape_{
	public Shape_ next;
	public Shape_() {next = null;}
	
	public void draw() {
		System.out.println("Shape");
	}
}

class Line_ extends Shape_{
	public void draw() {
		System.out.println("Line");
	}
}

class Rect_ extends Shape_{
	public void draw() {
		System.out.println("Rect");
	}
}

class Cicle_ extends Shape_{
	public void draw() {
		System.out.println("Cicle");
	}
}

public class EX5_5 {
	static void paint(Shape_ p) {
		p.draw();
	}
	public static void main (String[] args) {
		Line_ line = new Line_();
		
		paint(line);
		paint(new Shape_());
		paint(new Line_());
		paint(new Rect_());
		paint(new Cicle_());
	}
}
