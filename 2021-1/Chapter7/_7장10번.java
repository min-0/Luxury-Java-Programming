package ch7;
import java.util.*;

abstract class Shape{
	public Shape() {}
	public abstract void draw(); //�߻� �޼ҵ�
}

class Line extends Shape{ //Shape�� ��� �޴� Line Ŭ����
	@Override //�Լ� ������
	public void draw() {System.out.println("Line");}
}
class Rect extends Shape{ //Shape�� ��� �޴� Rect Ŭ����
	@Override //�Լ� ������
	public void draw() {System.out.println("Rect");}
}
class Circle extends Shape{ //Shape�� ��� �޴� Circle Ŭ����
	@Override //�Լ� ������
	public void draw() {System.out.println("Circle");}
	
}

public class _7��10�� {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Vector<Shape> v = new Vector<Shape>();
		//Shape ��ü�� ��ҷ� �ٷ�� ���� ����
		
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		
		int n; //������ ��ɾ� 
		int option; //���� �ɼ� ���� ��ɾ�
		int index; //���� ���� �ɼ� ���� ��ɾ�
		
		while(true) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			n = sc.nextInt();
			
			if(n == 1) { //���� �� 
				System.out.print("Line(1), Rect(2), Circle(3)>>"); 
				option = sc.nextInt(); 
				if(option == 1) {v.add(new Line());}
				//Vector ��ҿ� Line() ����
				else if(option == 2) {v.add(new Rect());}
				//Vector ��ҿ� Rect() ����
				else if(option == 3) {v.add(new Circle());}
				//Vector ��ҿ� Circle() ����
				else {System.out.println("�ùٸ� ��ɾ �ƴմϴ�.");}
			}
			else if(n == 2) { //���� ��
				System.out.print("������ ������ ��ġ >> ");
				index = sc.nextInt();
				if(index < -1 || index > v.size()) {
					//0���� ���� ���� ������ �뷮���� ū �� ����
					System.out.println("������ �� �����ϴ�.");
				}
				else {v.remove(index-1);} //index-1 ��ġ ��� ����
			}
			else if(n == 3) { //��� ���� ��
				//��ü Shape�� �ٷ�� ���׸� ���� ����
				Iterator<Shape> it = v.iterator();
				//Iterator ��ü�� ��Ұ� ���� �� ���� �ݺ�
				while(it.hasNext()) { 
					Shape shape = it.next();
					shape.draw();
				}
			}
			else if(n == 4){ //���� ��
				System.out.println("beauty�� �����մϴ�.");
				return; //�Լ� ����
			}
			else {
				System.out.println("�ùٸ� ��ɾ �ƴմϴ�.");
			}
		}
	}
}
