package ch3_;
import java.util.*;

public class ���ο�_����3 {

	public static void main(String[] args) {
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.nextLine().charAt(0);
		//charAt(0) = String���� ����� ���ڿ� �߿��� �� ���ڸ� �����ؼ� charŸ������ ��ȯ
		int num = (int)ch;
		
		if(num>=97 && num <=122)
		{
			for(int i = 97; i <= num; i++)
			{
				for(int k = 0; k <= num-i; k++)
				{
					System.out.print((char)(k+97));
				}
				System.out.println();
			}
		}
	}
}
