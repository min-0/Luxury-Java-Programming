package ch5;

interface Shapes{
	final double PI=3.14;//상수
	void draw(); //도형을 그리는 추상 메소드
	double getArea(); //도형의 면적을 리턴하는 추상 메소드
	default public void redraw() { //디폴트 메소드
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}

class Circles implements Shapes{ //Shapes를 상속 받아 구현하는 Circles 클래스
	private int radius;
	public Circles(int radius) {this.radius=radius;}
	public void draw() {System.out.println("반지름이 "+radius+"인 원 입니다.");}
	public double getArea() {return radius*radius*PI;} //원의 면적 크기 반환
}

class Ovals implements Shapes{ //Shapes를 상속 받아 구현하는 Ovals 클래스
	private int x,y;
	public Ovals(int x,int y) { this.x=x; this.y=y;}
	public double getArea() { return PI*x*y; } //내접하는 타원의 면적 크기 반환
	public void draw() {System.out.println(x+"x"+y+"에 내접하는 타원입니다.");}
}

class Rects implements Shapes{ //Shapes를 상속 받아 구현하는 Rects 클래스
	private int x,y;
	public Rects(int x,int y) {this.x=x; this.y=y;}
	public double getArea() {return x*y;} //사각형 면적 크기 반환
	public void draw() {System.out.println(x+"x"+y+"크기의 사각형 입니다.");}
}


public class _5장14번 {
	public static void main(String[] args) {
		Shapes[] list = new Shapes[3]; //Shape을 상속받은 클래스 객체의 레퍼런스 배열
		list[0] = new Circles(10); //반지름이 10인 원 객체
		list[1] = new Ovals(20, 30); //20x30 사각형에 내접하는 타원
		list[2] = new Rects(10, 40); //10x40 크기의 사각형
		
		for(int i=0; i<list.length; i++) list[i].redraw(); //매개변수 전달
		for(int i=0; i<list.length; i++) System.out.println("면적은 "+ list[i].getArea());
		//배열 크기만큼 반복하여 전체 배열에 있는 도형 면적 출력
	}

}
