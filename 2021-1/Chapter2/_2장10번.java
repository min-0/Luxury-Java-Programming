package ch2_;

import java.util.*; //Scanner 객체 생성을 위해 import 문에 패키지 선언

public class _2장10번 {

	      public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in); //입력 받기 위한 Scanner 객체 생성
	         
	         System.out.print("첫번째 원의 중심과 반지름 입력>>");
	         int x1 = sc.nextInt(); //첫번째 원의 x좌표
	         int y1 = sc.nextInt(); //첫번째 원의 y좌표
	         int r1 = sc.nextInt(); //첫번째 원의 반지름 길이
	      
	         System.out.print("두번째 원의 중심과 반지름 입력>>");
	         int x2 = sc.nextInt(); //두번째 원의 x좌표
	         int y2 = sc.nextInt(); //두번째 원의 y좌표
	         int r2 = sc.nextInt(); //두번째 원의 반지름 길이
	      
	         int pita;
	         int radius;
	         
	         pita = ((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
	         //피타고라스의 정리에 따라 두 점 사이의 거리 계산식(루트 씌우기 전)
	         radius = (r1+r2)*(r1+r2);
	         //두 원의 반지름 길이 합의 제곱
	         
	         if(pita <= radius) //두 점 사이의 거리가 두 원의 반지름 길이 합보다 작거나 같을 때
	            System.out.print("두 원은 서로 겹친다.");
	         else //두 점 사이의 거리가 두 원의 반지름 길이 합보다 클 때
	            System.out.print("두 원은 겹치지 않는다.");
	      
	         sc.close();
	      }
	   }
