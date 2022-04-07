package week4;

public class IfElseIfDemo {

	public static void main(String[] args) {
		int i = 20;
		
		if(i == 10) System.out.println(i + "는 10입니다.");
		else if(i == 20) System.out.println(i + "는 20입니다.");
		else if(i == 30) System.out.println(i + "는 30입니다.");
		else System.out.println(i + "는 10, 20, 30이 아닙니다.");
		
		System.out.println("if-else if 바깥쪽...무조건 실행");

	}

}