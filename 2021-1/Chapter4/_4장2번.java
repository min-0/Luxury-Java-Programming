package ch4;
import java.util.*;
class Grade{
	private int math;
	private int science;
	private int english;
	
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	public int average() {
		int sum = 0;
		sum = math + science + english;
		int age = sum/3;
		return age;
	}
}

public class _4��2�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		
		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average());
		
		sc.close();
	}

}
