package ch3_;

import java.util.*; //Scanner 객체 생성을 위해 import 문에 패키지 선언
public class _3장16번 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//입력 받기 위한 Scanner 객체 생성
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		String str[] = {"가위", "바위", "보"};//컴퓨터가 사용할 가위 바위 보 만들기
		String user = "";
		int n;
		
		while(true) {//사용자가 "그만"을 입력할 때 무한루프 돌 수 있도록 while에 true로 걸어준다.
			System.out.print("가위 바위 보!>>");
			
			user = sc.next();//사용자 가위 바위 보 중 하나 입력
			n = (int)(Math.random()*3);//컴퓨터가 가위 바위 보 셋 중에 랜덤으로 낼 수 있도록 한다.
			
			if(user.equals("가위")) {//사용자가 가위를 입력 했을 때
				if(str[n].equals("가위")) //컴퓨터가 str[] 중 랜덤으로 가위 바위 보 각각 나왔을 때 처리
				{
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 비겼습니다.");
				}
				else if(str[n].equals("바위"))
				{
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 컴퓨터가 이겼습니다.");
				}
				else if(str[n].equals("보"))
				{
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
				}
			}
			else if(user.equals("바위")) {//사용자가 바위를 입력 했을 때
				if(str[n].equals("가위")) 
				{
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
				}
				else if(str[n].equals("바위"))
				{
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 비겼습니다.");
				}
				else if(str[n].equals("보"))
				{
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 컴퓨터가 이겼습니다.");
				}
			}
			else if(user.equals("보")) {//사용자가 보를 입력 했을 때
				if(str[n].equals("가위")) 
				{
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 컴퓨터가 이겼습니다.");
				}
				else if(str[n].equals("바위"))
				{
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
				}
				else if(str[n].equals("보"))
				{
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 비겼습니다.");
				}
			}
			else if(user.equals("그만")) {//사용자가 그만을 입력 했을 때
				System.out.println("게임을 종료합니다...");
				break;//무한루프 탈출 후 종료
			}
			else//사용자가 잘못 입력하였을 때
				System.out.println("'가위 바위 보' 또는 종료하시려면 '그만'을 입력해주세요");
		}
		sc.close();
	}
}
