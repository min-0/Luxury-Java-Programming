package ch2_;
import java.util.*;
public class _2��12�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����>>");
		int n1 = sc.nextInt();
		String calculate = sc.next();
		int n2 = sc.nextInt();
		if(calculate.equals("+")) System.out.println(n1+ calculate+ n2 + "�� �����"+ (n1+n2));
		else if(calculate.equals("-")) System.out.println(n1+ calculate+ n2 + "�� �����"+ (n1-n2));
		else if(calculate.equals("*")) System.out.println(n1+ calculate+ n2 + "�� �����"+ (n1*n2));
		else if(calculate.equals("/")) {
			if(n2 == 0) System.out.println("0���� ���� �� �����ϴ�.");
			else System.out.println(n1+ calculate+ n2 + "�� �����"+ (n1/n2));
		}
		sc.close();
	}

}
