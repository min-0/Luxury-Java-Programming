package ch2_;

import java.util.*; //Scanner ��ü ������ ���� import ���� ��Ű�� ����

public class _2��10�� {

	      public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in); //�Է� �ޱ� ���� Scanner ��ü ����
	         
	         System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
	         int x1 = sc.nextInt(); //ù��° ���� x��ǥ
	         int y1 = sc.nextInt(); //ù��° ���� y��ǥ
	         int r1 = sc.nextInt(); //ù��° ���� ������ ����
	      
	         System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
	         int x2 = sc.nextInt(); //�ι�° ���� x��ǥ
	         int y2 = sc.nextInt(); //�ι�° ���� y��ǥ
	         int r2 = sc.nextInt(); //�ι�° ���� ������ ����
	      
	         int pita;
	         int radius;
	         
	         pita = ((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
	         //��Ÿ����� ������ ���� �� �� ������ �Ÿ� ����(��Ʈ ����� ��)
	         radius = (r1+r2)*(r1+r2);
	         //�� ���� ������ ���� ���� ����
	         
	         if(pita <= radius) //�� �� ������ �Ÿ��� �� ���� ������ ���� �պ��� �۰ų� ���� ��
	            System.out.print("�� ���� ���� ��ģ��.");
	         else //�� �� ������ �Ÿ��� �� ���� ������ ���� �պ��� Ŭ ��
	            System.out.print("�� ���� ��ġ�� �ʴ´�.");
	      
	         sc.close();
	      }
	   }
