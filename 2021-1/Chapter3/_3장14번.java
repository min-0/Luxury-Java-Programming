package ch3_;
import java.util.*;
public class _3��14�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String course[] = {"java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95,88,76,62,55};
		String name;
		
		while(true) {
			System.out.print("���� �̸�>>");
			name = sc.next();
			if(course[0].equals(name))System.out.println(course[0] + "�� ������ " + score[0]);
			else if(course[1].equals(name))System.out.println(course[1] + "�� ������ " + score[1]);
			else if(course[2].equals(name))System.out.println(course[2] + "�� ������ " + score[2]);
			else if(course[3].equals(name))System.out.println(course[3] + "�� ������ " + score[3]);
			else if(course[4].equals(name))System.out.println(course[4] + "�� ������ " + score[4]);
			else if(name.equals("�׸�"))break;
			else System.out.println("���� �����Դϴ�.");
		}
		sc.close();
	}

}
