package ch3_;
import java.util.*;
public class _3장14번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String course[] = {"java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95,88,76,62,55};
		String name;
		
		while(true) {
			System.out.print("과목 이름>>");
			name = sc.next();
			if(course[0].equals(name))System.out.println(course[0] + "의 점수는 " + score[0]);
			else if(course[1].equals(name))System.out.println(course[1] + "의 점수는 " + score[1]);
			else if(course[2].equals(name))System.out.println(course[2] + "의 점수는 " + score[2]);
			else if(course[3].equals(name))System.out.println(course[3] + "의 점수는 " + score[3]);
			else if(course[4].equals(name))System.out.println(course[4] + "의 점수는 " + score[4]);
			else if(name.equals("그만"))break;
			else System.out.println("없는 과목입니다.");
		}
		sc.close();
	}

}
