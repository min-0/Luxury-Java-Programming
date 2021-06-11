package ch7;
import java.util.*;

abstract class Shape{
	public Shape() {}
	public abstract void draw(); //추상 메소드
}

class Line extends Shape{ //Shape를 상속 받는 Line 클래스
	@Override //함수 재정의
	public void draw() {System.out.println("Line");}
}
class Rect extends Shape{ //Shape를 상속 받는 Rect 클래스
	@Override //함수 재정의
	public void draw() {System.out.println("Rect");}
}
class Circle extends Shape{ //Shape를 상속 받는 Circle 클래스
	@Override //함수 재정의
	public void draw() {System.out.println("Circle");}
	
}

public class _7장10번 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Vector<Shape> v = new Vector<Shape>();
		//Shape 객체를 요소로 다루는 벡터 생성
		
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		
		int n; //실행할 명령어 
		int option; //도형 옵션 선택 명령어
		int index; //도형 삭제 옵션 선택 명령어
		
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			n = sc.nextInt();
			
			if(n == 1) { //삽입 시 
				System.out.print("Line(1), Rect(2), Circle(3)>>"); 
				option = sc.nextInt(); 
				if(option == 1) {v.add(new Line());}
				//Vector 요소에 Line() 삽입
				else if(option == 2) {v.add(new Rect());}
				//Vector 요소에 Rect() 삽입
				else if(option == 3) {v.add(new Circle());}
				//Vector 요소에 Circle() 삽입
				else {System.out.println("올바른 명령어가 아닙니다.");}
			}
			else if(n == 2) { //삭제 시
				System.out.print("삭제할 도형의 위치 >> ");
				index = sc.nextInt();
				if(index < -1 || index > v.size()) {
					//0부터 작은 수나 벡터의 용량보다 큰 수 조건
					System.out.println("삭제할 수 없습니다.");
				}
				else {v.remove(index-1);} //index-1 위치 요소 삭제
			}
			else if(n == 3) { //모두 보기 시
				//객체 Shape를 다루는 제네릭 벡터 생성
				Iterator<Shape> it = v.iterator();
				//Iterator 객체에 요소가 있을 때 까지 반복
				while(it.hasNext()) { 
					Shape shape = it.next();
					shape.draw();
				}
			}
			else if(n == 4){ //종료 시
				System.out.println("beauty을 종료합니다.");
				return; //함수 종료
			}
			else {
				System.out.println("올바른 명령어가 아닙니다.");
			}
		}
	}
}
