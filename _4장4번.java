package ch4;

import java.util.*;
class Rectangle{ //Rectangle 클래스 생성
	private int x, y, width, height; //필요한 클래스 필드 선언
	
	public Rectangle(int x, int y, int width, int height){ //클래스 이름과 동일한 생성자 생성
		// 변수 이름이 같기도 하고 같은 클래스 내 다른 생성자 호출을 위해 this를 사용해준다.
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public int square() { //사각형 넓이를 구해주는 곳
		return width*height;
	}
	public void show() { //좌표와 넓이를 출력해주는 곳
		System.out.println("(" + x+", "+  y+ ")에서 크기가 "+width+"X" +height+ "인 사각형");
	}
	public boolean contains(Rectangle r) { // 사각형이 매개변수 r에 포함하는 지 여부를 판단할 곳
		if(x + width >r.x + r.width && r.y + r.height < y + height) {
			return true;
		}
		else
			return false;
	}
}
public class _4장4번 { 
	public static void main(String[] args) {
		//r, s, t의 Rectangle 객체 생성
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();// show() 호출
		System.out.println("s의 면적은 " + s.square()); // square() 호출 후 출력
		if(t.contains(r)) System.out.println("t는 r을 포함합니다."); //contains(r) 호출 후 True로 반환될 때 출력
		if(t.contains(s)) System.out.println("t는 s를 포함합니다."); // contains(s) 호출 후 True로 반환될 때 출력
	}

}
