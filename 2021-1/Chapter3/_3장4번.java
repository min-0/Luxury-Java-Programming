package ch3_;
import java.util.*;

public class 정민영_과제3 {

	public static void main(String[] args) {
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.nextLine().charAt(0);
		//charAt(0) = String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환
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
