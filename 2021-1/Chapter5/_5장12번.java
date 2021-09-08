package ch5;

import java.util.*;

abstract class Shape{
	private Shape next;
	public Shape() {next = null;}
	public void setNext(Shape obj) {next = obj;} //링크 연결
	public Shape getNext(){return next;}
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

class GrahpicEditor{ //GraphicEditor 클래스 선언
	static Scanner sc =new Scanner(System.in);
	private Shape one = null, two = null; //도형의 위치 첫번째는 one, 두번째는 two로 선언
	public void run() {
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		int n; //실행할 명령어 
		int option; //도형 옵션 선택 명령어
		int index; // 도형 위치
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			n = sc.nextInt();
			while(true) {
				if(n == 1) { //삽입시 
					System.out.print("Line(1), Rect(2), Circle(3)>>"); 
					option = sc.nextInt(); 
					if (option < 1 || option > 3) { //예외 처리
						System.out.println("잘못된 명령어 입니다.");
						break; 
					}
					insert(option); //삽입 메소드 호출
					break;
				}
				else if(n == 2) { // 삭제 시
					System.out.print("삭제할 도형의 위치 >> ");
					index = sc.nextInt();
					if(!delete(index)) {System.out.println("삭제할 수 없습니다.");}
					//삭제할 수 없는 상태일 때 출력
					break;
				}
				else if(n == 3) { //모두 보기 시
					show(); //보는 메소드 호출
					break;
				}
				else if(n == 4) { //종료 시
					System.out.println("beauty을 종료합니다.");
					return; //함수 종료
				}
			}
		}
	}
	public void insert(int option) { //삽입 메소드
		Shape shape = null;
		switch (option) {
			case 1: //선 옵션 선택 시
				shape = new Line(); 
				break; 
			case 2: //사각형 옵션 선택 시 
				shape = new Rect();
				break;
			case 3: //원 옵션 선택 시
				shape = new Circle();
				break;
		}
		if (one == null) {one = shape; two = shape;}
		//리스트가 비었을 때
		else {two.setNext(shape); two = shape;}
		//이미 존재할 때 마지막 원소 뒤에 삽입
	}
	private boolean delete(int index) { //삭제 메소드
		Shape current = one, previous = one; //상태 초기화 선언
		if (one == null)// 리스트가 비었을 때
			return false; //false 반환
		for (int i=0; i<index; i++) {
			previous = current;
			current = current.getNext(); //다음 원소로 이동
			if (current == null) //인덱스가 리스트보다 큰 경우
				return false;
		}
		if (one == two) {//원소가 한 개일 떄
			one = two = null;
			return true;
		}
		if (current == one) {//첫번째 인덱스 삭제하는 경우 
			one = one.getNext(); //다음 원소가 첫번째
		}
		else if (current == two) {//마지막 원소를 삭제하는 경우 
			two = previous; //이전 원소가 마지막 원소
			two.setNext(null);
		} 
		else {
			previous.setNext(current.getNext()); //현재 원소 삭제
		}
		return true; 
	
	}
	public void show() { //모두 보기 메소드
		Shape shape = one;
		while(shape != null) { //리스트가 비지 않았을 때
			shape.draw();
			shape = shape.getNext();
		}
	}	
}

public class _5장12번 {
	public static void main(String[] args) {
		GrahpicEditor Ed = new GrahpicEditor(); //클래스 객체 생성
		Ed.run(); //실행할 함수 호출
	}
}
