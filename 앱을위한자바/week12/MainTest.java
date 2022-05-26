package week12;

import java.util.*;

public class MainTest {
	public static void drawAny(Shape shape) {
		shape.draw();
	}
	public static void main(String[] args) {
		Shape s1 = new Shape();
		s1.draw();
		Line l1 = new Line();
		l1.draw();
		System.out.println("===========");
		//매개변수 - 다형성을 이용한 객체 받기
		drawAny(new Shape());
		drawAny(new Line());
		drawAny(new Circle());
		System.out.println("===========");
		List <Shape> shapes = new ArrayList<Shape>();
		shapes.add(s1);
		shapes.add(new Line());
		shapes.add(new Rect());
		for(Shape shape:shapes) shape.draw(); //shapes에 들어있는 List를 반복문으로 모두 꺼내서 출력
	}
}
